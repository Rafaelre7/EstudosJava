package Calculadora;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.DecimalFormat;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CalculadoraProporcao extends JFrame {

	private JPanel contentPane;
	private JTextField tfCaminhao;
	private JTextField tfCaixote;
	private JTextField tfProporcao;

	private static float caminhao = 0;
	private static float caixote = 0;
	private static float calc = 0;

	private Toolkit toolkit;
	private Clipboard clipboard;
	private StringSelection stringSelection;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculadoraProporcao frame = new CalculadoraProporcao();
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
	public CalculadoraProporcao() {
		setTitle("Calculadora de Propor\u00E7\u00E3o");
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent e) {

				toolkit = Toolkit.getDefaultToolkit();
				clipboard = toolkit.getSystemClipboard();
			}
		});
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 383, 228);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);

		JLabel lblCapacCaminho = new JLabel("Capac. Caminh\u00E3o");
		lblCapacCaminho.setBounds(10, 37, 100, 14);
		contentPane.add(lblCapacCaminho);

		tfCaminhao = new JTextField();
		tfCaminhao.setBounds(10, 62, 122, 28);
		contentPane.add(tfCaminhao);
		tfCaminhao.setColumns(10);

		JLabel lblCapacCaixote = new JLabel("Capac. Caixote");
		lblCapacCaixote.setBounds(156, 36, 100, 16);
		contentPane.add(lblCapacCaixote);

		tfCaixote = new JTextField();
		tfCaixote.setBounds(156, 62, 84, 28);
		contentPane.add(tfCaixote);
		tfCaixote.setColumns(10);

		JLabel lblProporo = new JLabel("Propor\u00E7\u00E3o");
		lblProporo.setBounds(266, 36, 74, 16);
		contentPane.add(lblProporo);

		tfProporcao = new JTextField();
		tfProporcao.setBounds(266, 62, 84, 28);
		contentPane.add(tfProporcao);
		tfProporcao.setColumns(10);

		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				caminhao = Integer.parseInt(tfCaminhao.getText());
				caixote = Integer.parseInt(tfCaixote.getText());
				calc = (caminhao / caixote);
				float total = (1 / calc) * 100;

				DecimalFormat df = new DecimalFormat("#,##0.0");
				String str = df.format(total);

				tfProporcao.setText(String.valueOf(str));
				stringSelection = new StringSelection(String.valueOf(total));
			}
		});
		btnCalcular.setBounds(150, 141, 90, 28);
		contentPane.add(btnCalcular);

		JButton btnCopiar = new JButton("Copiar");
		btnCopiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clipboard.setContents(stringSelection, null);
			}
		});
		btnCopiar.setBounds(266, 141, 90, 28);
		contentPane.add(btnCopiar);
	}
}
