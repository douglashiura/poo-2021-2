package br.ies.pooii.douglas.hiura.jogo.par.impar.modelo;

import java.util.Arrays;
import java.util.List;

public class EstrategiaDaSegundaJogada implements EstrategiaDeAposta {
	private Rodada rodada;
	private Aposta daPrimeiraJogada;

	public EstrategiaDaSegundaJogada(Aposta daPrimeiraJogada, Rodada rodada) {
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