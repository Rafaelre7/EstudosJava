package Layout;

import java.awt.AWTEvent;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.BoxLayout;
import java.awt.CardLayout;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.BevelBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.CompoundBorder;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.UIManager;
import java.awt.Font;
import java.awt.Graphics;

public class TesteLayout extends JFrame {
	
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TesteLayout frame = new TesteLayout();
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
	public TesteLayout() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 520, 480);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		JLabel lblSolinftecDashboard = new JLabel("SOLINFTEC DASHBOARD");
		panel.add(lblSolinftecDashboard);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		contentPane.add(tabbedPane, BorderLayout.CENTER);
		
		JPanel Primeiro = new JPanel();
		tabbedPane.addTab("Primeiro", null, Primeiro, null);
		Primeiro.setLayout(new BoxLayout(Primeiro, BoxLayout.X_AXIS));
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new TitledBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null), "MES", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(59, 59, 59)));
		Primeiro.add(panel_4);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new TitledBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null), "DIA", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		Primeiro.add(panel_5);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBorder(new TitledBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null), "SEMANA", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		Primeiro.add(panel_6);
		
		JPanel Segundo = new JPanel();
		tabbedPane.addTab("Segundo", null, Segundo, null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null), "DIA", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null), "SEMANA", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(59, 59, 59)));
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new TitledBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null), "MES", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		JPanel panel_7 = new JPanel();
		panel_7.setBorder(new TitledBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null), "ANO", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GroupLayout gl_Segundo = new GroupLayout(Segundo);
		gl_Segundo.setHorizontalGroup(
			gl_Segundo.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_Segundo.createSequentialGroup()
					.addGroup(gl_Segundo.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_Segundo.createSequentialGroup()
							.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
							.addGap(1))
						.addComponent(panel_2, GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE))
					.addGap(127)
					.addGroup(gl_Segundo.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_Segundo.createSequentialGroup()
							.addComponent(panel_7, GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
							.addGap(20))
						.addGroup(Alignment.TRAILING, gl_Segundo.createSequentialGroup()
							.addComponent(panel_3, GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
							.addGap(20))))
		);
		gl_Segundo.setVerticalGroup(
			gl_Segundo.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Segundo.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_Segundo.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_Segundo.createSequentialGroup()
							.addGap(8)
							.addComponent(panel_3, GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE))
						.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE))
					.addGap(18)
					.addGroup(gl_Segundo.createParallelGroup(Alignment.TRAILING)
						.addComponent(panel_2, GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
						.addGroup(gl_Segundo.createSequentialGroup()
							.addGap(18)
							.addComponent(panel_7, GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)))
					.addGap(60))
		);
		Segundo.setLayout(gl_Segundo);
		
		JPanel Terceiro = new JPanel();
		tabbedPane.addTab("Terceiro", null, Terceiro, null);
		
		JLabel lblTamnahoFonte = new JLabel("Tamnaho fonte");
		lblTamnahoFonte.setFont(new Font("Arial Black", lblTamnahoFonte.getFont().getStyle() | Font.BOLD, lblTamnahoFonte.getFont().getSize()));
		GroupLayout gl_Terceiro = new GroupLayout(Terceiro);
		gl_Terceiro.setHorizontalGroup(
			gl_Terceiro.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Terceiro.createSequentialGroup()
					.addGap(194)
					.addComponent(lblTamnahoFonte, GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
					.addGap(215))
		);
		gl_Terceiro.setVerticalGroup(
			gl_Terceiro.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Terceiro.createSequentialGroup()
					.addGap(153)
					.addComponent(lblTamnahoFonte, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGap(204))
		);
		Terceiro.setLayout(gl_Terceiro);
	}
}