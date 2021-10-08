package br.ies.pooii.douglas.hiura.jogo.par.impar.modelo;

import java.util.List;

public class ResultadoDoJogo {

	private Integer soma;
	private TiposDeAposta tipo;
	private List<Aposta> apostasVencedoras;

	public ResultadoDoJogo(Integer soma, List<Aposta> apostasVencedoras, TiposDeAposta tipo) {
		this.soma = soma;
		this.apostasVencedoras = apostasVencedoras;
		this.tipo = tipo;
	}

	public List<Aposta> obterApostasVencedoras() {
		return apostasVencedoras;
	}

	public TiposDeAposta obterTipoDaApostaVencedora() {
		return tipo;
	}

	public Integer obterValorSomado() {
		return soma;
	}

}
