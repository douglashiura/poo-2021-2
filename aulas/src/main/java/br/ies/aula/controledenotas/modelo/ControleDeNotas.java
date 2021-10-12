package br.ies.aula.controledenotas.modelo;

import java.util.List;

import br.ies.aula.controledenotas.Aluno;
import br.ies.aula.controledenotas.Nota;
import br.ies.aula.controledenotas.Resultado;

public class ControleDeNotas {

	private RegistroNota registroNota;
	public ControleDeNotas(RegistroNota registroNota) {
		this.setRegistroNota(registroNota);
		
	}
	public ControleDeNotas() {
		// TODO Auto-generated constructor stub
	}
	public Resultado verificarAprovacao(Aluno aluno) {
		// TODO Auto-generated method stub
		double media = calculoMedia(aluno);
		if(media > 7) {
			return Resultado.APROVADO;
		}
		else if(media < 7) {
			return Resultado.REPROVADO;
		}
		
		return null;
	}
	private double calculoMedia(Aluno aluno) {
		// TODO Auto-generated method stub
		double media = 0;
		double soma = 0;
		int i = 0;
		List<Nota> lstNotas = aluno.lstNotas;
		for (Nota notas : lstNotas) {
			soma = notas.nota;
		}
		media = soma / i;
		return media;
	}
	public void iniciarApp() {
		// TODO Auto-generated method stub
		
	}
	public Aluno getAluno() {
		// TODO Auto-generated method stub
		return null;
	}
	public RegistroNota getRegistroNota() {
		return registroNota;
	}
	public void setRegistroNota(RegistroNota registroNota) {
		this.registroNota = registroNota;
	}
}
