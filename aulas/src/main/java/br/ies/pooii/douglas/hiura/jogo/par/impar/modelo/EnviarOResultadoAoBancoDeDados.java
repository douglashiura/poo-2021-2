package br.ies.pooii.douglas.hiura.jogo.par.impar.modelo;

import java.util.List;

import br.ies.pooii.douglas.hiura.jogo.par.impar.modelo.dao.entidade.Rodada;

public class EnviarOResultadoAoBancoDeDados implements Especulavel {

	private Rodada rodada;

	public EnviarOResultadoAoBancoDeDados(RodadaDoJogo rodada) {
		this.rodada = rodada.comoUmaEntidade();
	}

	@Override
	public void obtemOResultado(ResultadoDoJogo resultado) {
		List<Aposta> vencedores = resultado.obterApostasVencedoras();
		for (Aposta aposta : vencedores) {
			aposta.hashCode();
		}
	}

}
