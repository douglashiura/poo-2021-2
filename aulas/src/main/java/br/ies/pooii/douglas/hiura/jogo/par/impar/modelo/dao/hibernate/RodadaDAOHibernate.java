package br.ies.pooii.douglas.hiura.jogo.par.impar.modelo.dao.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import br.ies.pooii.douglas.hiura.jogo.par.impar.modelo.dao.entidade.Pessoa;
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

	public List<Rodada> listarTodasAsRodadasDoJogador(Pessoa jogador) {
		Session sessao = fabricaDeSessao.openSession();
		sessao.beginTransaction();
		try {
			String hql = "SELECT rodada FROM Rodada rodada JOIN rodada.jogadores jogadores WHERE jogadores= :jogador ORDER BY rodada.id ASC";
			Query<Rodada> createQuery = sessao.createQuery(hql, Rodada.class);
			return createQuery.setParameter("jogador", jogador).getResultList();
		} finally {
			sessao.close();
		}
	}

	public List<Rodada> listar() {
		Session sessao = fabricaDeSessao.openSession();
		sessao.beginTransaction();
		try {
			String hql = "SELECT rodada FROM Rodada rodada ORDER BY rodada.id ASC";
			Query<Rodada> createQuery = sessao.createQuery(hql, Rodada.class);
			List<Rodada> resultList = createQuery.getResultList();
			resultList.forEach(rodada -> rodada.getJogadores().forEach(jogador -> jogador.getNome()));
			resultList.forEach(rodada -> rodada.getTorcedores().forEach(torcedor -> torcedor.getNome()));
			return resultList;
		} finally {
			sessao.close();
		}
	}

}
