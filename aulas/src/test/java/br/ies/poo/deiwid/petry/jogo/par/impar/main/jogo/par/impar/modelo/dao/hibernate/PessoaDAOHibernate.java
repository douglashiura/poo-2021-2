package br.ies.poo.deiwid.petry.jogo.par.impar.main.jogo.par.impar.modelo.dao.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import br.ies.poo.deiwid.petry.jogo.par.impar.main.jogo.par.impar.modelo.dao.entidade.Pessoa;
import br.ies.poo.deiwid.petry.jogo.par.impar.main.jogo.par.impar.modelo.dao.fachada.PessoaDAO;

public class PessoaDAOHibernate implements PessoaDAO {

	private SessionFactory fabricaDeSessao;

	public PessoaDAOHibernate() {
		fabricaDeSessao = GerenciadorDeFabricaDeHibernate.obterInstancia().getFabricaDeSessao();
	}

	@Override
	public void inserir(Pessoa pessoa) {
		Session sessao = fabricaDeSessao.openSession();
		sessao.beginTransaction();
		sessao.persist(pessoa);
		sessao.getTransaction().commit();
		sessao.close();
	}

	@Override
	public void deletar(Pessoa pessoa) {
		Session sessao = fabricaDeSessao.openSession();
		sessao.beginTransaction();
		sessao.delete(pessoa);
		sessao.getTransaction().commit();
		sessao.close();
	}

	@Override
	public List<Pessoa> listar() {
		Session sessao = fabricaDeSessao.openSession();
		try {
			return sessao.createQuery("SELECT pessoa FROM Pessoa pessoa", Pessoa.class).list();
		} finally {
			sessao.close();
		}
	}

}
