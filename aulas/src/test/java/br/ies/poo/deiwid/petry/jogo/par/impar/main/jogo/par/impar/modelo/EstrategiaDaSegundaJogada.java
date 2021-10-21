package br.ies.poo.deiwid.petry.jogo.par.impar.main.jogo.par.impar.modelo;

import java.util.Arrays;
import java.util.List;

public class EstrategiaDaSegundaJogada implements EstrategiaDeAposta {
	private RodadaDoJogo rodada;
	private Aposta daPrimeiraJogada;

	public EstrategiaDaSegundaJogada(Aposta daPrimeiraJogada, RodadaDoJogo rodada) {
		this.daPrimeiraJogada = daPrimeiraJogada;
		this.rodada = rodada;
	}

	@Override
	public void recebeUmaAposta(Aposta aposta) {
		ResultadoDoJogo resultado = calcular(aposta);
		rodada.avisarOEspeculadores(resultado);
	}

	private ResultadoDoJogo calcular(Aposta apostaDois) {
		List<Aposta> listaDeApostas = Arrays.asList(daPrimeiraJogada, apostaDois);
		CalculaResultadoDeApostas calculadora = new CalculaResultadoDeApostas(listaDeApostas);
		return calculadora.obterResultado();
	}
}