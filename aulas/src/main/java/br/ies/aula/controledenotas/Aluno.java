package br.ies.aula.controledenotas;

import java.util.List;

public class Aluno {

	public String nome;
	public int matricula;
	public List<Nota> lstNotas;
	
	public Aluno(){
	}
	
	public Aluno(String nome, int matricula) {
		// TODO Auto-generated constructor stub
		this.nome = nome;
		this.matricula = matricula;
	}
	
	public Aluno(String nome, int matricula, List<Nota> lstNotas) {
		// TODO Auto-generated constructor stub
		this.nome = nome;
		this.matricula = matricula;
		this.setLstNotas(lstNotas);
	}

	public  List<Nota> getLstNotas() {
		return lstNotas;
	}

	public void setLstNotas(List<Nota> lstNotas) {
		this.lstNotas = lstNotas;
	}
	
}
