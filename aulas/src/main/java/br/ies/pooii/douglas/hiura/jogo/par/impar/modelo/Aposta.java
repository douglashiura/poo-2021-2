package br.ies.pooii.douglas.hiura.jogo.par.impar.modelo;

public class Aposta {

	private Jogador jogador;
	private Integer valorApostado;
	private TiposDeAposta tipo;

	public Aposta(Jogador jogador, Integer valorApostado, TiposDeAposta tipo) {
		this.jogador = jogador;
		this.valorApostado = valorApostado;
		this.tipo = tipo;
	}

	public Integer obterValor() {
		return valorApostado;
	}

	public Jogador obterJogador() {
		return jogador;
	}

	public TiposDeAposta obterTipo() {
		return tipo;
	}

}
