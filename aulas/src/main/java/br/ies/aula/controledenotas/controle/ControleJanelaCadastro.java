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

import br.ies.aula.controledenotas.modelo.Usuario;
import br.ies.aula.controledenotas.modelo.UsuarioBD;

public class ControleJanelaCadastro implements ActionListener {

	private UsuarioBD alunoBD;
	private JTextField textFieldNome;
	private JPasswordField fieldSenha;
	private JTextField textFieldMatricula;
	
	public ControleJanelaCadastro(JTextField textFieldNome,  JPasswordField fieldSenha, JTextField textFieldMatricula) {
		this.textFieldNome = textFieldNome;
		this.fieldSenha = fieldSenha;
		this.textFieldMatricula = textFieldMatricula;
		alunoBD = new UsuarioBD();
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		String nome = textFieldNome.getText();
		String senha = String.valueOf(fieldSenha.getPassword());
		String matricula = textFieldMatricula.getText();
		
		Usuario aluno = new Usuario(nome, senha, matricula, 1);
		
		alunoBD.inserir(aluno);
		
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
