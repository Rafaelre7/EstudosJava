package JFreeChart;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TutorialFreeChart extends JFrame {

	private JPanel contentPane;
	private JButton btnAssarPizza;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TutorialFreeChart frame = new TutorialFreeChart();
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
	public TutorialFreeChart() {
		setTitle("Grafico");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
//		btnAssarPizza.doClick();
		final JPanel panel = new JPanel();
		
		JPanel panel_1 = new JPanel();
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, 431, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 431, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 164, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		
		btnAssarPizza = new JButton("Montar Grafico");
		btnAssarPizza.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultPieDataset defaultPie = new DefaultPieDataset();
				defaultPie.setValue("Portuguesa", 40);
				defaultPie.setValue("Atum", 10);
				defaultPie.setValue("Queijo", 25);
				defaultPie.setValue("Frango", 25);
				
				JFreeChart grafico = ChartFactory.createPieChart3D("Minha Pizza", defaultPie,true,true,false);
				
				ChartPanel chartPanel = new ChartPanel(grafico);
				panel.removeAll();
				panel.add(chartPanel);
				panel.validate();
							
				
			}
		});
		panel_1.add(btnAssarPizza);
		panel.setLayout(new BorderLayout(0, 0));
		contentPane.setLayout(gl_contentPane);
	}
}
