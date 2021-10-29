 package br.ies.pooii.douglas.hiura.jogo.par.impar.modelo;

import java.util.List;

public class EstrategiaDaUltimaJogada implements EstrategiaDeAposta {
	private RodadaDoJogo rodada;

	public EstrategiaDaUltimaJogada( RodadaDoJogo rodada) {
		this.rodada = rodada;
	}

	@Override
	public void recebeApostas(List<Aposta> ateOMomento) {
		ResultadoDoJogo resultado = calcular(ateOMomento);
		rodada.avisarOEspeculadores(resultado);
	}

	private ResultadoDoJogo calcular(List<Aposta> listaDeApostas) {
	
		CalculaResultadoDeApostas calculadora = new CalculaResultadoDeApostas(listaDeApostas);
		return calculadora.obterResultado();
	}
}