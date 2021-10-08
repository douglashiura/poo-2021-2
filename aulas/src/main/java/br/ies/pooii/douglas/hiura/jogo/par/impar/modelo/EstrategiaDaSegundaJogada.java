package br.ies.pooii.douglas.hiura.jogo.par.impar.modelo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

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
		int soma = listaDeApostas.stream().mapToInt(aposta -> aposta.obterValor()).sum();
		Boolean ehPar = soma % 2 == 0;
		TiposDeAposta tipoVencedor = transformarBooleanEmTipo(ehPar);
		List<Aposta> vencedores = obterApenasVencedores(listaDeApostas, tipoVencedor);
		return new ResultadoDoJogo(soma, vencedores, tipoVencedor);
	}

	private List<Aposta> obterApenasVencedores(List<Aposta> listaDeApostas, TiposDeAposta tipoVencedor) {
		Predicate<? super Aposta> filtarVencedores = aposta -> aposta.obterTipo().equals(tipoVencedor);
		List<Aposta> vencedores = listaDeApostas.stream().filter(filtarVencedores).collect(Collectors.toList());
		return vencedores;
	}

	private TiposDeAposta transformarBooleanEmTipo(Boolean ehPar) {
		Map<Boolean, TiposDeAposta> mapaBooleanParaTipo = new HashMap<Boolean, TiposDeAposta>(2);
		mapaBooleanParaTipo.put(Boolean.TRUE, TiposDeAposta.PAR);
		mapaBooleanParaTipo.put(Boolean.FALSE, TiposDeAposta.IMPAR);
		TiposDeAposta tipoVencedor = mapaBooleanParaTipo.get(ehPar);
		return tipoVencedor;
	}

}