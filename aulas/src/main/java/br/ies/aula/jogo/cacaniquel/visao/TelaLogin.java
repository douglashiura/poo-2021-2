package br.ies.aula.jogo.cacaniquel.visao;

import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaLogin extends JPanel{
	
	private static final long serialVersionUID = 1L;
	private JLabel lblAviso;
	private JLabel lblCPF;
	private JLabel lblNome;
	private JTextField txtCPF;
	private JTextField txtNome;
	private JButton btnEntrar;


	public TelaLogin() {
		
		configuracaoTelaLogin();
		montarPainel();
	}
	
	public void configuracaoTelaLogin(){
		
		setBorder(BorderFactory.createLineBorder(Color.green, 1));
		setBackground(Color.black);
		setLayout(null);
		setVisible(true);
	}
	
	public void montarPainel() {
		
		lblAviso = new JLabel("INSIRA SEUS DADOS PARA JOGAR E TER ACESSO AO REEMBOLSO OU PRÊMIO!");
		lblAviso.setFont(new Font("Comic Sans", Font.BOLD, 25));
		lblAviso.setForeground(Color.green);
		lblAviso.setBounds(170, 50, 1000, 50);
		lblAviso.setVisible(true);
		
		lblCPF = new JLabel("CPF: ");
		lblCPF.setFont(new Font("Verdana", Font.BOLD, 30));
		lblCPF.setForeground(Color.white);
		lblCPF.setBounds(450, 200, 300, 50);
		lblCPF.setVisible(true);
		
		lblNome = new JLabel("NOME: ");
		lblNome.setFont(new Font("Verdana", Font.BOLD, 30));
		lblNome.setForeground(Color.white);
		lblNome.setBounds(450, 300, 300, 50);
		lblNome.setVisible(true);
		
		txtCPF = new JTextField(7);
		txtCPF.setBounds(570, 210, 300, 30);
		txtCPF.setVisible(true);
		
		txtNome = new JTextField(7);
		txtNome.setBounds(570, 310, 300, 30);
		txtNome.setVisible(true);
		
		btnEntrar = new JButton("ENTRAR");
		btnEntrar.setForeground(Color.black);
		btnEntrar.setFont(new Font("Comic Sans", Font.BOLD, 15));
		btnEntrar.setBackground(Color.green);
		btnEntrar.setBounds(620, 400, 170, 40);
		btnEntrar.setVisible(true);
		
		add(lblCPF);
		add(lblNome);
		add(lblAviso);
		add(txtCPF);
		add(txtNome);
		add(btnEntrar);
	}	
	
	
	
	
	
	
	public JButton getBtnEntrar() {
		return btnEntrar;
	}
	public JTextField getTxtCPF() {
		return txtCPF;
	}
	public JTextField getTxtNome() {
		return txtNome;
	}

	
}
