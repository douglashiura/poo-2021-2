package br.ies.pooii.douglas.hiura.jogo.par.impar.modelo.dao.hibernate;

import java.util.Properties;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;

import br.ies.pooii.douglas.hiura.jogo.par.impar.modelo.dao.entidade.Pessoa;
import br.ies.pooii.douglas.hiura.jogo.par.impar.modelo.dao.entidade.Rodada;
import br.ies.pooii.douglas.hiura.jogo.par.impar.modelo.dao.fachada.RodadaDAO;

public class RodadaDAOHibernate implements RodadaDAO {

	private SessionFactory fabricaDeSessao;

	public RodadaDAOHibernate() {
		Properties properties = new Properties();
		properties.put(Environment.DIALECT, "org.hibernate.dialect.PostgreSQLDialect");
		properties.put(Environment.DRIVER, "org.postgresql.Driver");
		properties.put(Environment.URL, "jdbc:postgresql://localhost:5432/saas");
		properties.put(Environment.USER, "comexchain");
		properties.put(Environment.PASS, "comexchain");
		properties.put(Environment.AUTOCOMMIT, "false");

		properties.put(Environment.SHOW_SQL, "true");
		properties.put(Environment.HBM2DDL_AUTO, "create");
		Configuration configuration = new Configuration();
		configuration.addAnnotatedClass(Pessoa.class);
		configuration.addAnnotatedClass(Rodada.class);
		configuration.setProperties(properties);
		fabricaDeSessao = configuration.buildSessionFactory();
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
