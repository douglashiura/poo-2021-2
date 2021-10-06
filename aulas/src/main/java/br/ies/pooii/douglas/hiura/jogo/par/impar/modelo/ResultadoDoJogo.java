package br.ies.pooii.douglas.hiura.jogo.par.impar.modelo;

public class ResultadoDoJogo {

	private Integer soma;
	private TiposDeAposta tipo;
	private Jogador jogador;

	public ResultadoDoJogo(Integer soma, Jogador jogador, TiposDeAposta tipo) {
		this.soma = soma;
		this.jogador = jogador;
		this.tipo = tipo;
	}

	public Jogador obterVencedor() {
		return jogador;
	}

	public TiposDeAposta obterTipoDaApostaVencedora() {
		return tipo;
	}

	public Integer obterValorSomado() {
		return soma;
	}

}
