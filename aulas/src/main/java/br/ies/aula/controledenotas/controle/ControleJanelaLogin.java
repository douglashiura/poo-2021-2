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
import br.ies.aula.controledenotas.modelo.RegistroNota;
import br.ies.aula.controledenotas.modelo.RegistroNotaBD;
import br.ies.aula.controledenotas.visao.JanelaPrincipal;

public class ControleJanelaLogin implements ActionListener {

	private UsuarioBD alunoBD;
	private RegistroNotaBD registroNotaBD;
	private JTextField textFieldMatricula;
	private JPasswordField fieldSenha;
	
	public ControleJanelaLogin(JTextField textFieldMatricula, JPasswordField fieldSenha) {
		this.textFieldMatricula = textFieldMatricula;
		this.fieldSenha = fieldSenha;
		alunoBD = new UsuarioBD();
		registroNotaBD = new RegistroNotaBD();
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		String matricula = textFieldMatricula.getText();
		Usuario usuario = alunoBD.pesquisarAluno(matricula);
		
		if (autenticarUsuario(usuario)) {
			RegistroNota registroNota = new RegistroNota(usuario);
			registroNotaBD.inserir(registroNota);
			new JanelaPrincipal(registroNota);
			fecharJanela(event);
		} 
		else if (autenticarAluno(usuario)) {
			RegistroNota registroNota = new RegistroNota(usuario);
			registroNotaBD.inserir(registroNota);
			new JanelaPrincipal(registroNota);
			fecharJanela(event);
		}
		else 
			JOptionPane.showMessageDialog(null, "Login ou senha incorretos!");
			
	}
	
	private boolean autenticarAluno(Usuario usuario) {
		String senha = String.valueOf(fieldSenha.getPassword());
		
		if (usuario == null)
			return false;
		else if (usuario.getSenha().equals(senha) && usuario.getTipo().equals(1))
			return true;
		else
			return false;
		
	}
	
	private boolean autenticarUsuario(Usuario usuario) {
		String senha = String.valueOf(fieldSenha.getPassword());
		
		if (usuario == null)
			return false;
		else if (usuario.getSenha().equals(senha) && usuario.getTipo().equals(2))
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