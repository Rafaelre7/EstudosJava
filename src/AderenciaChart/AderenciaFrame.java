package AderenciaChart;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.border.MatteBorder;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.block.BlockBorder;
import org.jfree.chart.labels.StandardCategoryItemLabelGenerator;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.border.BevelBorder;
import javax.swing.JFormattedTextField;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.toedter.calendar.JDateChooser;
import javax.swing.border.CompoundBorder;

public class AderenciaFrame extends JFrame {

	private JPanel contentPane;
	private JPanel panelPrincipal;
	private JPanel panelS;
	private JPanel panelCTurno;
	private JPanel panelCUsina;
	private JPanel panelCFrente;
	private JPanel panelCabecalho;
	private JPanel panelRIncompletos;
	private JTable table;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AderenciaFrame frame = new AderenciaFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws UnsupportedLookAndFeelException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	public AderenciaFrame() throws InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent e) {
	
				// Chart Consolidado Usina
				DefaultCategoryDataset barra = new DefaultCategoryDataset();
				barra.setValue(15, "1º Turno", "12/09");
				barra.setValue(5, "2º Turno", "12/09");
				barra.setValue(30, "3º Turno", "12/09");
				barra.setValue(28, "1º Turno", "13/09");
				barra.setValue(19, "2º Turno", "13/09");
				barra.setValue(28, "3º Turno", "13/09");

				JFreeChart grafico = ChartFactory.createBarChart3D("CONSOLIDADO TURNO", null, null,
						barra, PlotOrientation.VERTICAL,
						true, true, false);
				
				ChartPanel painel = new ChartPanel(grafico);
				painel.setPreferredSize(new Dimension(431, 332));
				
				CategoryPlot plot = (CategoryPlot) grafico.getPlot();
				BarRenderer renderer = (BarRenderer) plot.getRenderer();
				renderer.setBaseItemLabelsVisible(true);
				renderer.setBaseItemLabelGenerator(new StandardCategoryItemLabelGenerator());
				panelCTurno.removeAll();
				panelCTurno.add(painel);
				panelCTurno.validate();

	/*----------------------------------------------------------------------------------------------------------------------------------------------*/			
				// Chart Consolidado Turno
				DefaultCategoryDataset barra1 = new DefaultCategoryDataset();
				barra1.setValue(15, "1º Turno", "12/09");
				barra1.setValue(5, "2º Turno", "12/09");
				barra1.setValue(30, "3º Turno", "12/09");
				barra1.setValue(28, "1º Turno", "13/09");
				barra1.setValue(19, "2º Turno", "13/09");
				barra1.setValue(28, "3º Turno", "13/09");

				JFreeChart grafico4 = ChartFactory.createBarChart3D("CONSOLIDADO USINA", null, null,
						barra, PlotOrientation.VERTICAL,
						true, true, false);
				
				ChartPanel painel4 = new ChartPanel(grafico4);
				painel4.setPreferredSize(new Dimension(431, 332));
				
				CategoryPlot plot4 = (CategoryPlot) grafico4.getPlot();
				BarRenderer renderer4 = (BarRenderer) plot4.getRenderer();
				renderer4.setBaseItemLabelsVisible(true);
				renderer4.setBaseItemLabelGenerator(new StandardCategoryItemLabelGenerator());
		
				panelCUsina.removeAll();
				panelCUsina.add(painel4);
				panelCUsina.validate();
	/*----------------------------------------------------------------------------------------------------------------------------------------------*/
				//Chart Consolidado Frente
				DefaultCategoryDataset dataset = new DefaultCategoryDataset();
				//1
				dataset.addValue(75, "FRENTE 1", "12/09/2017");
				dataset.addValue(50, "FRENTE 2", "12/09/2017");
				dataset.addValue(50, "FRENTE 3", "12/09/2017");
				dataset.addValue(0, "SEM DADOS", "12/09/2017");
				//2
				dataset.addValue(71, "FRENTE 1", "13/09/2017");
				dataset.addValue(56, "FRENTE 2", "13/09/2017");
				dataset.addValue(46, "FRENTE 3", "13/09/2017");
				dataset.addValue(66, "FRENTE 4", "13/09/2017");
				dataset.addValue(51, "FRENTE 5", "13/09/2017");
				dataset.addValue(62, "FRENTE 6", "13/09/2017");
				dataset.addValue(0, "SEM DADOS ", "13/09/2017");
				
				JFreeChart chart = ChartFactory.createBarChart3D("CONSOLIDADO FRENTE",
						null /* x-axis label */, null/* y-axis label */, dataset);
				chart.setBackgroundPaint(Color.white);
				CategoryPlot plot1 = (CategoryPlot) chart.getPlot();

				NumberAxis rangeAxis = (NumberAxis) plot1.getRangeAxis();
				rangeAxis.setStandardTickUnits(NumberAxis.createIntegerTickUnits());
				BarRenderer renderer1 = (BarRenderer) plot1.getRenderer();
				
				// Linha do 3D
				renderer1.setDrawBarOutline(false);
				renderer1.setBaseItemLabelsVisible(true);
				renderer1.setBaseItemLabelGenerator(new StandardCategoryItemLabelGenerator());
				chart.getLegend().setFrame(BlockBorder.NONE);
				
				ChartPanel chartPanel2 = new ChartPanel(chart);
				chartPanel2.setPreferredSize(new Dimension(870, 212));
				panelCFrente.removeAll();
				panelCFrente.add(chartPanel2);
				panelCFrente.validate();
	
	/*----------------------------------------------------------------------------------------------------------------------------------------------*/
				//Chart Registros incompletos
							
				DefaultCategoryDataset barra3 = new DefaultCategoryDataset();
				barra3.setValue(163, "CCT", "13/09");
				barra3.setValue(14, "S/DADOS", "12/09");

				JFreeChart grafico3 = ChartFactory.createBarChart3D("REGISTROS INCOMPLETOS", null, null, barra3, PlotOrientation.HORIZONTAL, true, true,
						false);
				ChartPanel painel3 = new ChartPanel(grafico3);
				CategoryPlot plot3 = (CategoryPlot) grafico3.getPlot();
				BarRenderer renderer3 = (BarRenderer) plot3.getRenderer();
				renderer3.setBaseItemLabelsVisible(true);
				renderer3.setBaseItemLabelGenerator(new StandardCategoryItemLabelGenerator());
				
				painel3.setPreferredSize(new Dimension(250, 550));
			
				panelRIncompletos.removeAll();
				panelRIncompletos.add(painel3);
				panelRIncompletos.validate();
				
   /*----------------------------------------------------------------------------------------------------------------------------------------------*/



				
			}
		});
		setTitle("PAINEL DE ADERENCIA - SGIB");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1366, 730);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		// COLOCAR ICONE
		ImageIcon icone = new ImageIcon("resources/icone.png");
		setIconImage(icone.getImage());
		// TRAVAR A TELA
		setResizable(false);

		 try {
	            int index = 0;
	            UIManager.LookAndFeelInfo info;
	            info = UIManager.getInstalledLookAndFeels()[index];
	            while (!"Nimbus".equals(info.getName())) {
	                index++;
	                info = UIManager.getInstalledLookAndFeels()[index];
	            }
	            UIManager.setLookAndFeel(info.getClassName());
	        } catch (ClassNotFoundException ex) {
	            Logger.getLogger(AderenciaFrame.class.getName()).log(Level.SEVERE, null, ex);
	        }
		 
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		tabbedPane.setBounds(0, 79, 1366, 634);
		contentPane.add(tabbedPane);

		panelPrincipal = new JPanel();
		tabbedPane.addTab("DashBoard", null, panelPrincipal, null);
		panelPrincipal.setLayout(null);

		panelCTurno = new JPanel();
		panelCTurno.setBounds(218, 11, 431, 336);
		panelPrincipal.add(panelCTurno);

		panelCUsina = new JPanel();
		panelCUsina.setBounds(657, 11, 431, 336);
		panelPrincipal.add(panelCUsina);

		JLabel lblDataInicio = new JLabel("Data Inicio..:");
		lblDataInicio.setBounds(6, 11, 72, 16);
		panelPrincipal.add(lblDataInicio);

		JLabel lblDataFim = new JLabel("Data Fim..:");
		lblDataFim.setBounds(6, 45, 72, 16);
		panelPrincipal.add(lblDataFim);

		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("C:\\Users\\Rafael Pimenta\\Documents\\GitHub\\balanca\\resources\\exit.png"));
		label_1.setBounds(181, 101, 16, 16);
		panelPrincipal.add(label_1);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(6, 117, 191, 230);
		panelPrincipal.add(scrollPane);

		table = new JTable();
		table.setModel(new DefaultTableModel(
				new Object[][] { { null }, { null }, { null }, { null }, { null }, { null }, { null }, },
				new String[] { "FRENTE" }) {
			boolean[] columnEditables = new boolean[] { false };

			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		scrollPane.setViewportView(table);

		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(6, 366, 191, 205);
		panelPrincipal.add(scrollPane_1);

		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(
				new Object[][] { { null }, { null }, { null }, { null }, { null }, { null }, { null }, },
				new String[] { "TURNO" }));
		scrollPane_1.setViewportView(table_1);

		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon("C:\\Users\\Rafael Pimenta\\Documents\\GitHub\\balanca\\resources\\exit.png"));
		label_2.setBounds(181, 350, 16, 16);
		panelPrincipal.add(label_2);

		panelRIncompletos = new JPanel();
		panelRIncompletos.setBounds(1100, 11, 248, 556);
		panelPrincipal.add(panelRIncompletos);

		panelCFrente = new JPanel();
		panelCFrente.setBounds(218, 355, 870, 212);
		panelPrincipal.add(panelCFrente);

		JButton btnNewButton = new JButton("Filtrar");
		btnNewButton.setIcon(new ImageIcon(
				"C:\\Users\\Rafael Pimenta\\Documents\\GitHub\\balanca\\src\\main\\resources\\com\\solinftec\\balanca\\main\\filter.png"));
		btnNewButton.setBounds(107, 69, 95, 28);
		panelPrincipal.add(btnNewButton);

		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(81, 6, 122, 28);
		panelPrincipal.add(dateChooser);

		JDateChooser dateChooser_1 = new JDateChooser();
		dateChooser_1.setBounds(81, 39, 122, 28);
		panelPrincipal.add(dateChooser_1);

		panelS = new JPanel();
		tabbedPane.addTab("Pag 2", null, panelS, null);

		panelCabecalho = new JPanel();
		panelCabecalho.setBounds(0, 0, 1366, 78);
		contentPane.add(panelCabecalho);
		panelCabecalho.setLayout(null);

		JLabel lblPainelDeAcompanhamento = new JLabel("PAINEL DE ACOMPANHAMENTO SGIB");
		lblPainelDeAcompanhamento.setFont(new Font("Calibri", Font.BOLD, 36));
		lblPainelDeAcompanhamento.setBounds(392, 34, 575, 38);
		panelCabecalho.add(lblPainelDeAcompanhamento);

		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(
				"C:\\Users\\Rafael Pimenta\\Documents\\GitHub\\balanca\\src\\main\\resources\\com\\solinftec\\balanca\\main\\Logo.png"));
		label.setBounds(1107, 11, 227, 67);
		panelCabecalho.add(label);

	}
}