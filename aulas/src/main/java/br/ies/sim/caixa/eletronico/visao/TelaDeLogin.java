package br.ies.sim.caixa.eletronico.visao;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import br.ies.sim.caixa.eletronico.controle.ControleUsuario;
import java.awt.Font;

public class TelaDeLogin extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNumConta;
	private JPasswordField txtSenha;

	public TelaDeLogin() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 465, 267);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNmeroDaConta = new JLabel("N\u00FAmero da conta:");
		lblNmeroDaConta.setBounds(176, 25, 102, 16);
		lblNmeroDaConta.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panel.add(lblNmeroDaConta);
		
		txtNumConta = new JTextField();
		txtNumConta.setBounds(120, 46, 214, 21);
		txtNumConta.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel.add(txtNumConta);
		txtNumConta.setColumns(10);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setBounds(206, 77, 39, 16);
		lblSenha.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panel.add(lblSenha);
		
		txtSenha = new JPasswordField();
		txtSenha.setBounds(120, 98, 214, 21);
		txtSenha.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel.add(txtSenha);
		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.setBounds(176, 144, 102, 23);
		btnEntrar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel.add(btnEntrar);
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					if (ControleUsuario.logarUsuario(txtNumConta.getText(), txtSenha.getText()) != null) {
						TelaPrincipal telaPrincipal = new TelaPrincipal(
								ControleUsuario.getInfoConta(Integer.parseInt(txtNumConta.getText())));
						telaPrincipal.setVisible(true);
						dispose();
					} else {
						JOptionPane.showMessageDialog(null,
								"Houve algum problema, verifique seu login e senha.");
					}
				} catch (Exception e) {
					e.printStackTrace();
					JOptionPane.showMessageDialog(null, "Não foi possível realizar o Login!");
				}
			}
		});
		
		JButton btnCriarConta = new JButton("Criar conta");
		btnCriarConta.setBounds(176, 172, 102, 23);
		btnCriarConta.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel.add(btnCriarConta);
		btnCriarConta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				TelaCriarConta telaDeCadastro = new TelaCriarConta();
				telaDeCadastro.setVisible(true);
				dispose();
			}
		});
	}
}
