package br.ies.poo.deiwid.petry.jogo.par.impar.main.jogo.par.impar.modelo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CalculaResultadoDeApostas {

	private ResultadoDoJogo resultado;

	public CalculaResultadoDeApostas(List<Aposta> apostas) {
		Integer soma = apostas.stream().mapToInt(Aposta::obterValor).sum();
		Boolean ehPar = soma % 2 == 0;
		Predicate<? super TiposDeAposta> filtroPeloTipoVencedor = tipoDeAposta -> tipoDeAposta.ehPar().equals(ehPar);
		List<TiposDeAposta> tipos = Arrays.asList(TiposDeAposta.values());
		TiposDeAposta tipoVencedor = tipos.stream().filter(filtroPeloTipoVencedor).findFirst().get();
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
