package br.ies.aula.testecontroledenotas;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import br.ies.aula.controledenotas.Aluno;
import br.ies.aula.controledenotas.ControleDeNotas;
import br.ies.aula.controledenotas.Nota;
import br.ies.aula.controledenotas.Resultado;

import javax.swing.JOptionPane;

public class TesteControleDeNotas {
	private Aluno deiwid;
	private Nota notasDeiwid;
	private Aluno aluno;
	private Nota notasAluno;
	private ControleDeNotas controleDeNotas = new ControleDeNotas();
	private List<Nota> lstNotas = new ArrayList<Nota>();
	private int quantidadeDeNotas;
	private String nomeDoAluno;
	private int matriculaDoAluno; 
	@Before
	public void configuracao() {
		quantidadeDeNotas = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de notas"));
		nomeDoAluno = JOptionPane.showInputDialog("Nome do Aluno");
		matriculaDoAluno = Integer.parseInt(JOptionPane.showInputDialog("Matricula do Aluno"));
	}
	@Test
	public void aprovacao() throws Exception {
		
		deiwid = new Aluno("deiwid", 1234, lstNotas );
		notasDeiwid = new Nota(8.5);
		deiwid.lstNotas.add(notasDeiwid);
		notasDeiwid = new Nota(7.0);
		deiwid.lstNotas.add(notasDeiwid);
		notasDeiwid = new Nota(5.5);
		deiwid.lstNotas.add(notasDeiwid);
		Resultado resultado = controleDeNotas.verificarAprovacao(deiwid);
		assertEquals(Resultado.APROVADO, resultado);
	}
	
	@Test
	public void aprovacaoDois() throws Exception {
		aluno = new Aluno(nomeDoAluno, matriculaDoAluno, lstNotas);
		adicionarNotas(aluno, quantidadeDeNotas);
		Resultado resultado = controleDeNotas.verificarAprovacao(aluno);
		assertEquals(Resultado.APROVADO, resultado);
	}
	private void adicionarNotas(Aluno aluno, int quantidadeDeNotas) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= quantidadeDeNotas; i++) {
			double nota = Double.parseDouble(JOptionPane.showInputDialog("Digite a"+i+"ª nota"));
			notasAluno = new Nota(nota);
			aluno.lstNotas.add(notasAluno);
		}
	}
}
