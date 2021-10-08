package br.ies.poo.deiwid.petry.jogo.par.impar.modelo;

public class EstrategiaDaSegundaJogada implements EstrategiaDeAposta {
	private Rodada rodada;
	private Aposta daPrimeiraJogada;
	private CalcularResultadoDoJogo calcularResultadoDoJogo;

	public EstrategiaDaSegundaJogada(Aposta daPrimeiraJogada, Rodada rodada) {
		this.daPrimeiraJogada = daPrimeiraJogada;
		this.rodada = rodada;
	}

	@Override
	public void recebeUmaAposta(Aposta aposta) {
		calcularResultadoDoJogo = new CalcularResultadoDoJogo();
		ResultadoDoJogo resultado = calcularResultadoDoJogo.calcular(aposta, daPrimeiraJogada);
		rodada.avisarOEspeculadores(resultado);
	}

}
