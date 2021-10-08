package br.ies.pooii.douglas.hiura.jogo.par.impar.modelo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CalculaResultadoDe {

	private ResultadoDoJogo resultado;

	public CalculaResultadoDe(List<Aposta> apostas) {
		int soma = apostas.stream().mapToInt(Aposta::obterValor).sum();
		Boolean ehPar = soma % 2 == 0;
		TiposDeAposta tipoVencedor = Arrays.asList(TiposDeAposta.values()).stream().map(null);
		List<Aposta> vencedores = obterApenasVencedores(apostas, tipoVencedor);
		this.resultado = new ResultadoDoJogo(soma, vencedores, tipoVencedor);
	}

	private List<Aposta> obterApenasVencedores(List<Aposta> listaDeApostas, TiposDeAposta tipoVencedor) {
		Predicate<? super Aposta> filtarVencedores = aposta -> aposta.obterTipo().equals(tipoVencedor);
		List<Aposta> vencedores = listaDeApostas.stream().filter(filtarVencedores).collect(Collectors.toList());
		return vencedores;
	}

	public ResultadoDoJogo obterResultado() {
		return resultado;
	}

}
