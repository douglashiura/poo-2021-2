package br.ies.aula.controledenotas.visao;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


import br.ies.aula.controledenotas.controle.ControleJanelaLogin;
import br.ies.aula.controledenotas.modelo.LimitaCaracter;

public class JanelaLogin extends JFrame {

	private static final long serialVersionUID = 1L;
	
	private JPanel panelPrincipal;
	private JTextField textFieldMatricula;
	private JPasswordField fieldSenha;
	private JLabel labelMatricula;
	private JLabel labelSenha;
	private JButton botaoLogar;
	private JButton botaoSair;
	private JButton botaoCadastrar;
	
	public static void main(String[] args) {
		new JanelaLogin();
	}
	
	public JanelaLogin() {
		configurarTela();
		montarTela();
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	}
	
	private void configurarTela() {
		setTitle("Login - Controle de Notas");		
		setSize(380, 420);
		getContentPane().setLayout(null);
	}
	
	private void montarTela() {
		montarPanelPrincipal();
		montarLabels();
		montarFields();
		montarBotoes();
	}

	private void montarPanelPrincipal() {
		panelPrincipal = new JPanel();
		panelPrincipal.setBounds(20, 11, 330, 350);
		panelPrincipal.setLayout(null);
		
		getContentPane().add(panelPrincipal);
	}

	private void montarLabels() {
		labelMatricula = new JLabel("Matricula:");
		labelMatricula.setFont(new Font("Tahoma", Font.PLAIN, 13));
		labelMatricula.setHorizontalAlignment(SwingConstants.RIGHT);
		labelMatricula.setBounds(25, 85, 75, 15);
		
		labelSenha = new JLabel("Senha:");
		labelSenha.setFont(new Font("Tahoma", Font.PLAIN, 13));
		labelSenha.setHorizontalAlignment(SwingConstants.RIGHT);
		labelSenha.setBounds(25, 116, 75, 15);
		
		panelPrincipal.add(labelMatricula);
		panelPrincipal.add(labelSenha);
	}

	private void montarFields() {
		textFieldMatricula = new JTextField();
		textFieldMatricula.setDocument(new LimitaCaracter(11));
		textFieldMatricula.setBounds(110, 81, 145, 25);
		
		fieldSenha = new JPasswordField();
		fieldSenha.setBounds(110, 112, 145, 25);
		
		panelPrincipal.add(textFieldMatricula);
		panelPrincipal.add(fieldSenha);
	}

	private void montarBotoes() {
		botaoLogar = new JButton("Logar");
		botaoLogar.setBounds(110, 158, 70, 25);
		botaoLogar.addActionListener(new ControleJanelaLogin(textFieldMatricula, fieldSenha));
		
		botaoSair = new JButton("Sair");
		botaoSair.setBounds(185, 158, 70, 25);
		botaoSair.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
			
		});
		
		botaoCadastrar = new JButton("Cadastrar");
		botaoCadastrar.setBounds(110, 188, 145, 25);
		botaoCadastrar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new JanelaCadastro();
			}
		});
		
		panelPrincipal.add(botaoLogar);
		panelPrincipal.add(botaoSair);
		panelPrincipal.add(botaoCadastrar);
	}
}
