package br.ies.aula.controledenotas;

import java.util.List;

public class ControleDeNotas {

	public Resultado verificarAprovacao(Aluno deiwid) {
		// TODO Auto-generated method stub
		double media = calculoMedia(deiwid);
		if(media > 7) {
			return Resultado.APROVADO;
		}
		else if(media < 7) {
			return Resultado.REPROVADO;
		}
		
		return null;
	}
	private double calculoMedia(Aluno deiwid) {
		// TODO Auto-generated method stub
		double media = 0;
		double soma = 0;
		int i = 0;
		List<Nota> lstNotas = deiwid.lstNotas;
		for (Nota notas : lstNotas) {
			soma = notas.nota;
		}
		media = soma / i;
		return media;
	}

}
