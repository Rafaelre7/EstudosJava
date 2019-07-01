package ImportarXLS.Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import ImportarXLS.Controlador.ControladorExcel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VistaExcel extends JFrame {

	private JPanel contentPane;
	public JTable jtDatos;
	public JButton btnImportar, btnExportar;
	public JScrollPane scrollPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VistaExcel frame = new VistaExcel();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VistaExcel() {
		setTitle("Importar e exportar com java");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		btnImportar = new JButton("Importar");
		btnImportar.setBounds(10, 11, 89, 23);
		contentPane.add(btnImportar);

		btnExportar = new JButton("Exportar");
		btnExportar.setBounds(335, 11, 89, 23);
		contentPane.add(btnExportar);

		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 70, 414, 180);
		contentPane.add(scrollPane);

		jtDatos = new JTable();
		jtDatos.setModel(new DefaultTableModel(new Object[][] {},
				new String[] { "New column", "New column", "New column", "New column", "New column" }));
		scrollPane.setViewportView(jtDatos);
	}
}
