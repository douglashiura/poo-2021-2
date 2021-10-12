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

import br.ies.aula.controledenotas.modelo.Aluno;
import br.ies.aula.controledenotas.modelo.AlunoBD;
import br.ies.aula.controledenotas.modelo.RegistroNota;
import br.ies.aula.controledenotas.modelo.RegistroNotaBD;
import br.ies.aula.controledenotas.visao.JanelaPrincipal;

public class ControleJanelaLogin implements ActionListener {

	private AlunoBD alunoBD;
	private RegistroNotaBD registroNotaBD;
	private JTextField textFieldMatricula;
	private JPasswordField fieldSenha;
	
	public ControleJanelaLogin(JTextField textFieldMatricula, JPasswordField fieldSenha) {
		this.textFieldMatricula = textFieldMatricula;
		this.fieldSenha = fieldSenha;
		alunoBD = new AlunoBD();
		registroNotaBD = new RegistroNotaBD();
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		String matricula = textFieldMatricula.getText();
		Aluno aluno = alunoBD.pesquisarAluno(matricula);
		
		if (autenticarAluno(aluno)) {
			RegistroNota registroNota = new RegistroNota(aluno);
			registroNotaBD.inserir(registroNota);
			new JanelaPrincipal(registroNota);
			fecharJanela(event);
		} else 
			JOptionPane.showMessageDialog(null, "Login ou senha incorretos!");
			
	}
	
	private boolean autenticarAluno(Aluno aluno) {
		String senha = String.valueOf(fieldSenha.getPassword());
		
		if (aluno == null)
			return false;
		else if (aluno.getSenha().equals(senha))
			return true;
		else
			return false;
		
	}

	private void fecharJanela(ActionEvent event) {
		JComponent source = (JComponent)event.getSource();
		Component root = SwingUtilities.getRoot(source);
		JFrame janelaCadastro = (JFrame)root;
		janelaCadastro.dispose();
	}
	
}