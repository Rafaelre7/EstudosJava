package ComputacaoGrafica;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.TitledBorder;
import javax.swing.text.MaskFormatter;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;

import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.text.ParseException;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class RGB extends JFrame {

	private JPanel contentPane;
	private JPanel PanelCor;
	private JTextField tfRed;
	private JTextField tfGreen;
	private JTextField tfBlue;
	private String red, green, blue;
	private int iRed, iGreen, iBlue;
	private MaskFormatter msRed, msGreen, msBlue;
	private JLabel lblEx;
	private JLabel lblEx_1;
	private JLabel lblEx_2;
	private JButton btnExecutar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RGB frame = new RGB();
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
	public RGB() {
		setTitle("Computa\u00E7\u00E3o Grafica");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 544, 286);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		try{
			msRed = new MaskFormatter("###");
		}catch(ParseException e1){
			e1.printStackTrace();
		}
		try{
			msGreen = new MaskFormatter("###");
		}catch(ParseException e1){
			e1.printStackTrace();
		}
		try{
			msBlue = new MaskFormatter("###");
		}catch(ParseException e1){
			e1.printStackTrace();
		}
		
		
	
		tfRed = new JFormattedTextField(msRed);
		tfRed.setBounds(41, 35, 86, 20);
		contentPane.add(tfRed);
		tfRed.setColumns(10);

		tfGreen = new JFormattedTextField(msGreen);
		tfGreen.setColumns(10);
		tfGreen.setBounds(41, 77, 86, 20);
		contentPane.add(tfGreen);

		tfBlue = new JFormattedTextField(msBlue);
		tfBlue.setColumns(10);
		tfBlue.setBounds(41, 120, 86, 20);
		contentPane.add(tfBlue);

		JLabel lblNewLabel = new JLabel("R :");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setBounds(17, 38, 26, 14);
		contentPane.add(lblNewLabel);

		JLabel lblG = new JLabel("G :");
		lblG.setForeground(Color.GREEN);
		lblG.setBounds(17, 80, 26, 14);
		contentPane.add(lblG);

		JLabel lblB = new JLabel("B :");
		lblB.setForeground(Color.BLUE);
		lblB.setBounds(17, 123, 26, 14);
		contentPane.add(lblB);

		
		
		PanelCor = new JPanel();
		PanelCor.setBackground(Color.WHITE);
		PanelCor.setBorder(new TitledBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)), "RGB",
				TitledBorder.LEFT, TitledBorder.TOP, null, Color.BLACK));
		PanelCor.setBounds(225, 21, 290, 203);
		contentPane.add(PanelCor);
		
		btnExecutar = new JButton("Executar");
		btnExecutar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnExecutar.setForeground(Color.BLACK);
		btnExecutar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					red = tfRed.getText();
					green = tfGreen.getText();
					blue = tfBlue.getText();
					
					iRed = Integer.parseInt(red);
					iGreen = Integer.parseInt(green);
					iBlue = Integer.parseInt(blue);
					
					if(iRed > 255 || iGreen > 255 || iBlue > 255) {
						 JOptionPane.showMessageDialog(null,
			                    "Valor não pode ser maior que 255","Alarme",
			                    JOptionPane.ERROR_MESSAGE);
						
					}else {
						PanelCor.setBackground(new Color(iRed, iGreen, iBlue));
					}
					
				} catch (Exception e1) {
						e1.printStackTrace();
						JOptionPane.showMessageDialog(null,
			                    "Valor não pode ser nulo","Alarme",
			                    JOptionPane.ERROR_MESSAGE);
				}
				
				System.out.println("("+red + "," + green + "," + blue+")");

			}
		});
		btnExecutar.setBounds(17, 173, 130, 45);
		contentPane.add(btnExecutar);
		
		lblEx = new JLabel("Ex 0...255");
		lblEx.setBounds(134, 35, 71, 14);
		contentPane.add(lblEx);
		
		lblEx_1 = new JLabel("Ex 0...255");
		lblEx_1.setBounds(134, 80, 71, 14);
		contentPane.add(lblEx_1);
		
		lblEx_2 = new JLabel("Ex 0...255");
		lblEx_2.setBounds(134, 123, 71, 14);
		contentPane.add(lblEx_2);
	}
}
