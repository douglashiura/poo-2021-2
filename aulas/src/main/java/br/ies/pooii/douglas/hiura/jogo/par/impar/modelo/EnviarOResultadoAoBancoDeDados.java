package br.ies.pooii.douglas.hiura.jogo.par.impar.modelo;

import java.util.List;

import br.ies.pooii.douglas.hiura.jogo.par.impar.modelo.dao.entidade.Resultado;
import br.ies.pooii.douglas.hiura.jogo.par.impar.modelo.dao.entidade.Rodada;
import br.ies.pooii.douglas.hiura.jogo.par.impar.modelo.dao.hibernate.ResultadoDAOHibernate;

public class EnviarOResultadoAoBancoDeDados implements Especulavel {

	private Rodada rodada;

	public EnviarOResultadoAoBancoDeDados(RodadaDoJogo rodada) {
		this.rodada = rodada.comoUmaEntidade();
	}

	@Override
	public void obtemOResultado(ResultadoDoJogo resultado) {
		ResultadoDAOHibernate dao = new ResultadoDAOHibernate();
		List<Aposta> vencedores = resultado.obterApostasVencedoras();
		for (Aposta aposta : vencedores) {
			Resultado resuldaoDoTipoEntidade = new Resultado();
			resuldaoDoTipoEntidade.setRodada(rodada);
			resuldaoDoTipoEntidade.setVencedor(aposta.obterJogador().comoPessoa());
			dao.inserir(resuldaoDoTipoEntidade);
		}
	}

}
