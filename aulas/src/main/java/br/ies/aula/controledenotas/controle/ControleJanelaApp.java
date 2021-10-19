package br.ies.aula.controledenotas.controle;

import java.awt.Component;

import javax.swing.JComboBox;
import javax.swing.JTextField;

import br.ies.aula.controledenotas.Aluno;
import br.ies.aula.controledenotas.modelo.ControleDeNotas;
import br.ies.aula.controledenotas.modelo.RegistroNota;
import br.ies.aula.controledenotas.modelo.RegistroNotaBD;


public class ControleJanelaApp {


	private ControleDeNotas app;
	private RegistroNotaBD registroNotaBD;

	public ControleJanelaApp(Component[] componentLabels, RegistroNota registroNota) {
		this.app = new ControleDeNotas(registroNota);
		registroNotaBD = new RegistroNotaBD();
	}

	public void iniciarApp() {
		app.iniciarApp();
	}
	
	public void trocarAluno() {
		Aluno alunoAtual = app.getAluno();
		RegistroNota registroNota = new RegistroNota(alunoAtual);
		registroNotaBD.inserir(registroNota);
		
		this.app = new ControleDeNotas(registroNota);
		
		iniciarApp();
	}

	public void salvar(JTextField textFieldMatricula, JComboBox<?> comboBoxMaterias, JTextField textNotaUm, JTextField textNotaUmRecuperacao, JTextField textNotaDois, JTextField textNotaDoisRecuperacao, JComboBox<?> comboBoxSemestre) {
		
	}
	
}
