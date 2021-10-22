package br.ies.pooii.douglas.hiura.jogo.par.impar.modelo;

import java.util.List;

import br.ies.pooii.douglas.hiura.jogo.par.impar.modelo.dao.entidade.Pessoa;
import br.ies.pooii.douglas.hiura.jogo.par.impar.modelo.dao.entidade.Rodada;
import br.ies.pooii.douglas.hiura.jogo.par.impar.modelo.dao.hibernate.PessoaDAOHibernate;
import br.ies.pooii.douglas.hiura.jogo.par.impar.modelo.dao.hibernate.RodadaDAOHibernate;

public class EstrategiaDaPrimeiraJogada implements EstrategiaDeAposta {

	private RodadaDoJogo rodada;

	public EstrategiaDaPrimeiraJogada(RodadaDoJogo rodada) {
		this.rodada = rodada;
	}

	@Override
	public void recebeUmaAposta(Aposta aposta) {
		Rodada rodadaEntidade = rodada.comoUmaEntidade();
		PessoaDAOHibernate daoHibernate = new PessoaDAOHibernate();
		List<Pessoa> jogadores = rodadaEntidade.getJogadores();
		List<Pessoa> torcedores = rodadaEntidade.getTorcedores();
		inserirPessoas(jogadores, daoHibernate);
		inserirPessoas(torcedores, daoHibernate);
		RodadaDAOHibernate daoRodadaHibernate = new RodadaDAOHibernate();
		daoRodadaHibernate.inserir(rodadaEntidade);
	}

	private void inserirPessoas(List<Pessoa> pessoas, PessoaDAOHibernate daoHibernate) {
		for (Pessoa pessoa : pessoas) {
			daoHibernate.inserir(pessoa);
		}
	}

}