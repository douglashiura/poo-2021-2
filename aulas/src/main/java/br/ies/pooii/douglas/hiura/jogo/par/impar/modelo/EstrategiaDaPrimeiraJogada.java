package br.ies.pooii.douglas.hiura.jogo.par.impar.modelo;

import br.ies.pooii.douglas.hiura.jogo.par.impar.modelo.dao.entidade.Rodada;
import br.ies.pooii.douglas.hiura.jogo.par.impar.modelo.dao.hibernate.RodadaDAOHibernate;

public class EstrategiaDaPrimeiraJogada implements EstrategiaDeAposta {

	private RodadaDoJogo rodada;

	public EstrategiaDaPrimeiraJogada(RodadaDoJogo rodada) {
		this.rodada = rodada;
	}

	@Override
	public void recebeUmaAposta(Aposta aposta) {
		Rodada rodadaEntidade = rodada.comoUmaEntidade();
//		PessoaDAOHibernate daoHibernate = new PessoaDAOHibernate();
//		daoHibernate.inserir(douglas);
//		daoHibernate.inserir(lucas);
//		daoHibernate.inserir(brayan);
		RodadaDAOHibernate daoRodadaHibernate = new RodadaDAOHibernate();
		daoRodadaHibernate.inserir(rodadaEntidade);
	}

}