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

import br.ies.aula.controledenotas.controle.ControleJanelaCadastro;

public class JanelaCadastro extends JFrame {

	private static final long serialVersionUID = 1L;
	
	private JPanel panelPrincipal;
	private JLabel labelNome;
	private JLabel labelLogin;
	private JLabel labelSenha;
	private JLabel labelMatricula;
	private JTextField textFieldNome;
	private JTextField textFieldLogin;
	private JPasswordField fieldSenha;
	private JTextField textFieldMatricula;
	
	public static void main(String[] args) {
		new JanelaCadastro();
	}

	public JanelaCadastro() {
		configurarTela();
		montarTela();
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	}
	
	private void configurarTela() {
		setTitle("Cadastro - Aluno");		
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
		labelNome = new JLabel("Nome:");
		labelNome.setFont(new Font("Tahoma", Font.PLAIN, 13));
		labelNome.setHorizontalAlignment(SwingConstants.RIGHT);
		labelNome.setBounds(25, 110, 75, 15);
		
		labelLogin = new JLabel("Login:");
		labelLogin.setFont(new Font("Tahoma", Font.PLAIN, 13));
		labelLogin.setHorizontalAlignment(SwingConstants.RIGHT);
		labelLogin.setBounds(25, 140, 75, 15);
		
		labelSenha = new JLabel("Senha:");
		labelSenha.setFont(new Font("Tahoma", Font.PLAIN, 13));
		labelSenha.setHorizontalAlignment(SwingConstants.RIGHT);
		labelSenha.setBounds(25, 170, 75, 15);
		
		labelMatricula = new JLabel("Matricula:");
		labelMatricula.setFont(new Font("Tahoma", Font.PLAIN, 13));
		labelMatricula.setHorizontalAlignment(SwingConstants.RIGHT);
		labelMatricula.setBounds(25, 200, 75, 15);
		
		panelPrincipal.add(labelNome);
		panelPrincipal.add(labelLogin);
		panelPrincipal.add(labelSenha);
		panelPrincipal.add(labelMatricula);
	}

	private void montarFields() {
		textFieldNome = new JTextField();
		textFieldNome.setBounds(110, 105, 145, 25);
		
		textFieldLogin = new JTextField();
		textFieldLogin.setBounds(110, 135, 145, 25);
		
		fieldSenha = new JPasswordField();
		fieldSenha.setBounds(110, 165, 145, 25);
		
		textFieldMatricula = new JTextField();
		textFieldMatricula.setBounds(110, 195, 145, 25);
		
		panelPrincipal.add(textFieldNome);
		panelPrincipal.add(textFieldLogin);
		panelPrincipal.add(fieldSenha);
		panelPrincipal.add(textFieldMatricula);
	}

	private void montarBotoes() {
		JButton botaoSalvar = new JButton("Salvar");
		botaoSalvar.setBounds(110, 230, 70, 25);
		botaoSalvar.addActionListener(new ControleJanelaCadastro(textFieldNome, textFieldLogin, fieldSenha, textFieldMatricula));
		
		JButton botaoSair = new JButton("Sair");
		botaoSair.setBounds(185, 230, 70, 25);
		botaoSair.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
			
		});
		
		panelPrincipal.add(botaoSalvar);
		panelPrincipal.add(botaoSair);
	}
}
