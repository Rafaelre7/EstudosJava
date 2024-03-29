package JFreeChart;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;

import org.jfree.data.category.DefaultCategoryDataset;

public class JDBCCategoryDataset extends DefaultCategoryDataset { 
	 
    /** For serialization. */ 
    static final long serialVersionUID = -3080395327918844965L; 
 
    /** The database connection. */ 
    private transient Connection connection; 
 
    /**
     * A flag the controls whether or not the table is transposed.  The default 
     * is 'true' because this provides the behaviour described in the 
     * documentation. 
     */ 
    private boolean transpose = true; 
 
 
    /**
     * Creates a new dataset with a database connection. 
     * 
     * @param  url  the URL of the database connection. 
     * @param  driverName  the database driver class name. 
     * @param  user  the database user. 
     * @param  passwd  the database user's password. 
     * 
     * @throws ClassNotFoundException if the driver cannot be found. 
     * @throws SQLException if there is an error obtaining a connection to the 
     *                      database. 
     */ 
    public JDBCCategoryDataset(String url, 
                               String driverName, 
                               String user, 
                               String passwd) 
        throws ClassNotFoundException, SQLException { 
 
        Class.forName(driverName); 
        this.connection = DriverManager.getConnection(url, user, passwd); 
    } 
 
    /**
     * Create a new dataset with the given database connection. 
     * 
     * @param connection  the database connection. 
     */ 
    public JDBCCategoryDataset(Connection connection) { 
        if (connection == null) { 
            throw new NullPointerException("A connection must be supplied."); 
        } 
        this.connection = connection; 
    } 
 
    /**
     * Creates a new dataset with the given database connection, and executes 
     * the supplied query to populate the dataset. 
     * 
     * @param connection  the connection. 
     * @param query  the query. 
     * 
     * @throws SQLException if there is a problem executing the query. 
     */ 
    public JDBCCategoryDataset(Connection connection, String query) 
        throws SQLException { 
        this(connection); 
        executeQuery(query); 
    } 
 
    /**
     * Returns a flag that controls whether or not the table values are 
     * transposed when added to the dataset. 
     * 
     * @return A boolean. 
     */ 
    public boolean getTranspose() { 
        return this.transpose; 
    } 
 
    /**
     * Sets a flag that controls whether or not the table values are transposed 
     * when added to the dataset. 
     * 
     * @param transpose  the flag. 
     */ 
    public void setTranspose(boolean transpose) { 
        this.transpose = transpose; 
    } 
 
    /**
     * Populates the dataset by executing the supplied query against the 
     * existing database connection.  If no connection exists then no action 
     * is taken. 
     * <p> 
     * The results from the query are extracted and cached locally, thus 
     * applying an upper limit on how many rows can be retrieved successfully. 
     * 
     * @param query  the query. 
     * 
     * @throws SQLException if there is a problem executing the query. 
     */ 
    public void executeQuery(String query) throws SQLException { 
        executeQuery(this.connection, query); 
    } 
 
    /**
     * Populates the dataset by executing the supplied query against the 
     * existing database connection.  If no connection exists then no action 
     * is taken. 
     * <p> 
     * The results from the query are extracted and cached locally, thus 
     * applying an upper limit on how many rows can be retrieved successfully. 
     * 
     * @param con  the connection. 
     * @param query  the query. 
     * 
     * @throws SQLException if there is a problem executing the query. 
     */ 
    public void executeQuery(Connection con, String query) throws SQLException { 
 
        Statement statement = null; 
        ResultSet resultSet = null; 
        try { 
            statement = con.createStatement(); 
            resultSet = statement.executeQuery(query); 
            ResultSetMetaData metaData = resultSet.getMetaData(); 
 
            int columnCount = metaData.getColumnCount(); 
 
            if (columnCount < 2) { 
                throw new SQLException( 
                    "JDBCCategoryDataset.executeQuery() : insufficient columns " 
                    + "returned from the database."); 
            } 
 
            // Remove any previous old data 
            int i = getRowCount(); 
            while (--i >= 0) { 
                removeRow(i); 
            } 
 
            while (resultSet.next()) { 
                // first column contains the row key... 
                Comparable rowKey = resultSet.getString(1); 
                for (int column = 2; column <= columnCount; column++) { 
 
                    Comparable columnKey = metaData.getColumnName(column); 
                    int columnType = metaData.getColumnType(column); 
 
                    switch (columnType) { 
                        case Types.TINYINT: 
                        case Types.SMALLINT: 
                        case Types.INTEGER: 
                        case Types.BIGINT: 
                        case Types.FLOAT: 
                        case Types.DOUBLE: 
                        case Types.DECIMAL: 
                        case Types.NUMERIC: 
                        case Types.REAL: { 
                            Number value = (Number) resultSet.getObject(column); 
                            if (this.transpose) { 
                                setValue(value, columnKey, rowKey); 
                            } 
                            else { 
                                setValue(value, rowKey, columnKey); 
                            } 
                            break; 
                        } 
                        case Types.DATE: 
                        case Types.TIME: 
                        case Types.TIMESTAMP: { 
                            Date date = (Date) resultSet.getObject(column); 
                            Number value = new Long(date.getTime()); 
                            if (this.transpose) { 
                                setValue(value, columnKey, rowKey); 
                            } 
                            else { 
                                setValue(value, rowKey, columnKey); 
                            } 
                            break; 
                        } 
                        case Types.CHAR: 
                        case Types.VARCHAR: 
                        case Types.LONGVARCHAR: { 
                            String string 
                                = (String) resultSet.getObject(column); 
                            try { 
                                Number value = Double.valueOf(string); 
                                if (this.transpose) { 
                                    setValue(value, columnKey, rowKey); 
                                } 
                                else { 
                                    setValue(value, rowKey, columnKey); 
                                } 
                            } 
                            catch (NumberFormatException e) { 
                                // suppress (value defaults to null) 
                            } 
                            break; 
                        } 
                        default: 
                            // not a value, can't use it (defaults to null) 
                            break; 
                    } 
                } 
            } 
 
            fireDatasetChanged(); 
        } 
        finally { 
            if (resultSet != null) { 
                try { 
                    resultSet.close(); 
                } 
                catch (Exception e) { 
                    // report this? 	
                } 
            } 
            if (statement != null) { 
                try { 
                    statement.close(); 
                } 
                catch (Exception e) { 
                    // report this? 
                } 
            } 
        } 
    } 
 
}