package controledenotas;

import java.util.List;

public class Aluno {

	public String nome;
	public int matricula;
	public List<Notas> lstNotas;
	
	public Aluno(){
	}
	
	public Aluno(String nome, int matricula, List<Notas> lstNotas) {
		// TODO Auto-generated constructor stub
		this.nome = nome;
		this.matricula = matricula;
		this.setLstNotas(lstNotas);
	}

	public  List<Notas> getLstNotas() {
		return lstNotas;
	}

	public void setLstNotas(List<Notas> lstNotas) {
		this.lstNotas = lstNotas;
	}
	
}
