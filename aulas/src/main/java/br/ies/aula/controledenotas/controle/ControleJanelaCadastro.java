package br.ies.aula.controledenotas.controle;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

import br.ies.aula.controledenotas.banco.BancoException;
import br.ies.aula.controledenotas.entidade.EntidadeAluno;
import br.ies.aula.controledenotas.modelo.Aluno;

public class ControleJanelaCadastro implements ActionListener {

	private Aluno aluno;
	private JTextField textFieldNome;
	private JTextField textFieldLogin;
	private JPasswordField fieldSenha;
	private JTextField textFieldMatricula;
	
	public ControleJanelaCadastro(JTextField textFieldNome, JTextField textFieldLogin, JPasswordField fieldSenha, JTextField textFieldMatricula) {
		this.textFieldNome = textFieldNome;
		this.textFieldLogin = textFieldLogin;
		this.fieldSenha = fieldSenha;
		this.textFieldMatricula = textFieldMatricula;
		aluno = new Aluno();
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		String nome = textFieldNome.getText();
		String login = textFieldLogin.getText();
		String senha = String.valueOf(fieldSenha.getPassword());
		String matricula = textFieldMatricula.getText();
		
		EntidadeAluno entidadeAluno = new EntidadeAluno(nome, login, senha, matricula);
		
		aluno.inserir(entidadeAluno);
		
		fecharJanela(event);
		JOptionPane.showMessageDialog(null, "Cadastro efetuado com sucesso!");
		
	}
	
	private void fecharJanela(ActionEvent event) {
		JComponent source = (JComponent)event.getSource();
		Component root = SwingUtilities.getRoot(source);
		JFrame janelaCadastro = (JFrame)root;
		janelaCadastro.dispose();
	}

}
