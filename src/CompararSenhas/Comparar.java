package CompararSenhas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Comparar extends JFrame {

	private JPanel contentPane;
	private JTextField tfSenha1;
	private JTextField tfConfirmacao;
	private JTextField tfSenhaSalva;
	private JLabel lblMensagem;
	private String valor1 , valor2;
	private JButton btnConfirmar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Comparar frame = new Comparar();
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
	public Comparar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 319, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSenha = new JLabel("Senha 1 ..:");
		lblSenha.setBounds(30, 42, 62, 14);
		contentPane.add(lblSenha);
		
		JLabel lblSenha_1 = new JLabel("Confirmacao ..:");
		lblSenha_1.setBounds(30, 79, 96, 14);
		contentPane.add(lblSenha_1);
		
		tfSenha1 = new JTextField();
		tfSenha1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				valor1 = tfSenha1.getText();
				valor2 = tfConfirmacao.getText();
				System.out.println(valor1 +" - "+ valor2);
				if(!valor1.equals(valor2)) {
//					lblMensagem.setText("Senhas Invalidas");
					btnConfirmar.setEnabled(false);
				}else {
					lblMensagem.setText("");
					btnConfirmar.setEnabled(true);
					
				}
			}
		});
		tfSenha1.setBounds(116, 39, 138, 23);
		contentPane.add(tfSenha1);
		tfSenha1.setColumns(10);
		
		tfConfirmacao = new JTextField();
		tfConfirmacao.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				//Evento de clique 
				valor1 = tfSenha1.getText();
				valor2 = tfConfirmacao.getText();
//				System.out.println(valor1 +" - "+ valor2);
				if(!valor1.equals(valor2)) {
					lblMensagem.setText("Senhas Invalidas");
					btnConfirmar.setEnabled(false);
				}else {
					lblMensagem.setText("");
					btnConfirmar.setEnabled(true);
					
				}
//				
			}
		});
		tfConfirmacao.setBounds(116, 79, 135, 23);
		contentPane.add(tfConfirmacao);
		tfConfirmacao.setColumns(10);
		
		btnConfirmar = new JButton("Confirmar");
		btnConfirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tfSenhaSalva.setText(valor1);
			}
		});
		btnConfirmar.setBounds(107, 147, 97, 23);
		contentPane.add(btnConfirmar);
		btnConfirmar.setEnabled(false);
		
		tfSenhaSalva = new JTextField();
		tfSenhaSalva.setBounds(51, 227, 200, 23);
		contentPane.add(tfSenhaSalva);
		tfSenhaSalva.setColumns(10);
		
		JLabel lblSenhaValidada = new JLabel("Senha Validada");
		lblSenhaValidada.setBounds(99, 195, 105, 14);
		contentPane.add(lblSenhaValidada);
		
		lblMensagem = new JLabel("");
		lblMensagem.setBounds(51, 122, 200, 14);
		contentPane.add(lblMensagem);
	}
}
