package test.br.ies.pooii.douglas.hiura.jogo.par.impar;

import static org.junit.Assert.assertTrue;

import java.util.Properties;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.junit.Test;

import br.ies.pooii.douglas.hiura.jogo.par.impar.modelo.dao.entidade.Pessoa;

public class TesteHibernate {

	@Test
	public void configurarHibernate() throws Exception {
		Properties properties = new Properties();
		properties.put(Environment.DIALECT, "org.hibernate.dialect.PostgreSQLDialect");
		properties.put(Environment.DRIVER, "org.postgresql.Driver");
		properties.put(Environment.URL, "jdbc:postgresql://localhost:5432/saas");
		properties.put(Environment.USER, "comexchain");
		properties.put(Environment.PASS, "comexchain");
		properties.put(Environment.SHOW_SQL, "true");
		properties.put(Environment.HBM2DDL_AUTO, "update");
		Configuration configuration = new Configuration();
		configuration.addAnnotatedClass(Pessoa.class);
		configuration.setProperties(properties);
		SessionFactory fabricaDeSessao = configuration.buildSessionFactory();
		Session sessao = fabricaDeSessao.openSession();
		assertTrue(sessao.isConnected());
	}

}
