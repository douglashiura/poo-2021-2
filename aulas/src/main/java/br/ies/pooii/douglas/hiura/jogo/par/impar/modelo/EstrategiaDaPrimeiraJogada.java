package br.ies.pooii.douglas.hiura.jogo.par.impar.modelo;

public class EstrategiaDaPrimeiraJogada implements EstrategiaDeAposta {

	private Aposta aposta;
	private Rodada rodada;

	public EstrategiaDaPrimeiraJogada(Rodada rodada) {
		this.rodada = rodada;
	}

	@Override
	public void recebeUmaAposta(Aposta aposta) {
		this.aposta = aposta;
		this.rodada.fiqueAlertaParaReceberASegundaAposta();
	}

	@Override
	public Aposta obterAposta() {
		return aposta;
	}
}