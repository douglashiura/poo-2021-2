package br.ies.pooii.douglas.hiura.jogo.par.impar.modelo.dao.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import br.ies.pooii.douglas.hiura.jogo.par.impar.modelo.dao.entidade.Resultado;

public class ResultadoDAOHibernate {

	private SessionFactory fabricaDeSessao;

	public ResultadoDAOHibernate() {
		fabricaDeSessao = GerenciadorDeFabricaDeHibernate.obterInstancia().getFabricaDeSessao();
	}

	public void inserir(Resultado resultado) {
		Session sessao = fabricaDeSessao.openSession();
		sessao.beginTransaction();
		sessao.persist(resultado);
		sessao.getTransaction().commit();
		sessao.close();
	}

	public List<Resultado> listar() {
		Session sessao = fabricaDeSessao.openSession();
		try {
			return sessao.createQuery("SELECT resultado FROM Resultado resultado", Resultado.class).list();
		} finally {
			sessao.close();
		}
	}

}
