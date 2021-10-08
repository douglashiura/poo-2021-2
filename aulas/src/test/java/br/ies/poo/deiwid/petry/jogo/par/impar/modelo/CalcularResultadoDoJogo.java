package br.ies.poo.deiwid.petry.jogo.par.impar.modelo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CalcularResultadoDoJogo {
	
	ResultadoDoJogo calcular(Aposta apostaDois, Aposta daPrimeiraJogada) {
		List<Aposta> listaDeApostas = Arrays.asList(daPrimeiraJogada, apostaDois);
		int soma = listaDeApostas.stream().mapToInt(aposta -> aposta.obterValor()).sum();
		Boolean ehPar = soma % listaDeApostas.size() == 0;
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
