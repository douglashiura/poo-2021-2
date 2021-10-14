package br.ies.pooii.douglas.hiura.jogo.par.impar.modelo.dao.hibernate;

import java.util.List;
import java.util.Properties;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;

import br.ies.pooii.douglas.hiura.jogo.par.impar.modelo.dao.entidade.Pessoa;
import br.ies.pooii.douglas.hiura.jogo.par.impar.modelo.dao.fachada.PessoaDAO;

public class PessoaDAOHibernate implements PessoaDAO {

	private SessionFactory fabricaDeSessao;

	public PessoaDAOHibernate() {
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
		configuration.setProperties(properties);
		fabricaDeSessao = configuration.buildSessionFactory();
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
