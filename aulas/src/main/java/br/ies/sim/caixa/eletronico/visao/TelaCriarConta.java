package br.ies.sim.caixa.eletronico.visao;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import br.ies.sim.caixa.eletronico.controle.ControleUsuario;
import br.ies.sim.caixa.eletronico.modelo.Conta;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Font;

public class TelaCriarConta extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNome;
	private JPasswordField txtSenha;

	public TelaCriarConta() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 432, 255);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNomeCompleto = new JLabel("Nome completo:");
		lblNomeCompleto.setBounds(163, 35, 94, 16);
		lblNomeCompleto.setFont(new Font("Tahoma", Font.PLAIN, 13));
		contentPane.add(lblNomeCompleto);
		
		txtNome = new JTextField();
		txtNome.setBounds(95, 56, 231, 21);
		txtNome.setFont(new Font("Tahoma", Font.PLAIN, 12));
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblSenhaDaConta = new JLabel("Senha da conta:");
		lblSenhaDaConta.setBounds(163, 87, 91, 16);
		lblSenhaDaConta.setFont(new Font("Tahoma", Font.PLAIN, 13));
		contentPane.add(lblSenhaDaConta);
		
		txtSenha = new JPasswordField();
		txtSenha.setBounds(95, 108, 231, 21);
		txtSenha.setFont(new Font("Tahoma", Font.PLAIN, 12));
		contentPane.add(txtSenha);
		
		JButton btnCriarconta = new JButton("Criar conta");
		btnCriarconta.setBounds(152, 159, 114, 23);
		btnCriarconta.setFont(new Font("Tahoma", Font.PLAIN, 12));
		contentPane.add(btnCriarconta);
		btnCriarconta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String nome = txtNome.getText();
					String senha = txtSenha.getText();
					Conta conta = ControleUsuario.criarConta(nome, senha);
					if (conta != null) {
						JOptionPane.showMessageDialog(null,
								"Conta Criada com sucesso!\n" + "O número da sua conta é: " + conta.getNumeroConta());
						TelaDeLogin telaDeLogin = new TelaDeLogin();
						telaDeLogin.setVisible(true);
						dispose();
					} else {
						JOptionPane.showMessageDialog(null, "Houve um erro na criação da conta!\n"
								+ "Verifique se está preenchendo os campos corretamente.");
					}
				} catch (Exception e2) {
					e2.printStackTrace();
					JOptionPane.showMessageDialog(null, "Houve algum erro, verifique seus dados novamente!");
				}
			}
		});
	}
}