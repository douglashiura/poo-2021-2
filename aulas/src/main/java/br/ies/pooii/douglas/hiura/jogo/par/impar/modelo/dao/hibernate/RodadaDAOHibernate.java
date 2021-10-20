package br.ies.pooii.douglas.hiura.jogo.par.impar.modelo.dao.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import br.ies.pooii.douglas.hiura.jogo.par.impar.modelo.dao.entidade.Rodada;
import br.ies.pooii.douglas.hiura.jogo.par.impar.modelo.dao.fachada.RodadaDAO;

public class RodadaDAOHibernate implements RodadaDAO {

	private SessionFactory fabricaDeSessao;

	public RodadaDAOHibernate() {
		fabricaDeSessao = GerenciadorDeFabricaDeHibernate.obterInstancia().getFabricaDeSessao();
	}

	@Override
	public void inserir(Rodada rodada) {
		Session sessao = fabricaDeSessao.openSession();
		sessao.beginTransaction();
		sessao.persist(rodada);
		sessao.getTransaction().commit();
		sessao.close();
	}

	@Override
	public Rodada encontar(Integer id) {
		Session sessao = fabricaDeSessao.openSession();
		sessao.beginTransaction();
		try {
			return sessao.find(Rodada.class, id);
		} finally {
			sessao.close();
		}
	}

}
