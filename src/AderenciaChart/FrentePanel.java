package AderenciaChart;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

import javax.swing.border.BevelBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import java.awt.Dimension;

public class FrentePanel extends JFrame {

	private JPanel contentPane;
	private JPanel panelPrincipal;
	private JPanel panelSecundario;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrentePanel frame = new FrentePanel();
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
	public FrentePanel() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent e) {
//				DefaultPieDataset defaultPie = new DefaultPieDataset();
//				defaultPie.setValue("Portuguesa", 40);
//				defaultPie.setValue("Atum", 10);
//				defaultPie.setValue("Queijo", 25);
//				defaultPie.setValue("Frango", 25);
//				
//				
//				JFreeChart grafico = ChartFactory.createPieChart3D("Minha Pizza", defaultPie,true,true,false);
//				
//				ChartPanel chartPanel = new ChartPanel(grafico);
//				panelPrincipal.removeAll();
//				panelPrincipal.add(chartPanel);
//				panelPrincipal.validate();
//				
			}
		});
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 864, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panelPrincipal = new JPanel();
		panelPrincipal.setBorder(new TitledBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null), "Frentes", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		panelPrincipal.setBounds(22, 11, 397, 335
				);
		contentPane.add(panelPrincipal);
		
		JButton btnMontarChart = new JButton("Montar Chart");
		btnMontarChart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultPieDataset defaultPie = new DefaultPieDataset();
				defaultPie.setValue("Portuguesa", 40);
				defaultPie.setValue("Atum", 10);
				defaultPie.setValue("Queijo", 25);
				defaultPie.setValue("Frango", 25);
				
			
				
				JFreeChart grafico = ChartFactory.createPieChart3D("Minha Pizza", defaultPie,true,true,false);
				
				ChartPanel chartPanel = new ChartPanel(grafico);
				chartPanel.setPreferredSize(new Dimension(655, 490));
				panelPrincipal.removeAll();
				panelPrincipal.add(chartPanel);
				panelPrincipal.validate();
				
			}
		});
		btnMontarChart.setBounds(147, 357, 118, 23);
		contentPane.add(btnMontarChart);
		
		panelSecundario = new JPanel();
		panelSecundario.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Turnos", TitledBorder.CENTER, TitledBorder.TOP, null, Color.BLACK));
		panelSecundario.setBounds(429, 11, 397, 335);
		contentPane.add(panelSecundario);
	}
}
