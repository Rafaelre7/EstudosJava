package JFreeChart;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

public class FrentePanel extends JFrame {

	private JPanel contentPane;
	private JPanel panelPrincipal;

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 514, 379);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		 panelPrincipal = new JPanel();
		panelPrincipal.setBounds(56, 27, 389, 190);
		contentPane.add(panelPrincipal);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultPieDataset defaultPie = new DefaultPieDataset();
				defaultPie.setValue("Portuguesa", 40);
				defaultPie.setValue("Atum", 10);
				defaultPie.setValue("Queijo", 25);
				defaultPie.setValue("Frango", 25);
				
			
				
				JFreeChart grafico = ChartFactory.createPieChart3D("Minha Pizza", defaultPie,true,true,false);
				
				ChartPanel chartPanel = new ChartPanel(grafico);
				panelPrincipal.removeAll();
				panelPrincipal.add(chartPanel);
				panelPrincipal.validate();
			}
		});
		btnNewButton.setBounds(198, 266, 89, 23);
		contentPane.add(btnNewButton);
	}
}
