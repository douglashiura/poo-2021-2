package br.ies.poo.deiwid.petry.jogo.par.impar.main.jogo.par.impar.modelo.dao.hibernate;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;

import br.ies.poo.deiwid.petry.jogo.par.impar.main.jogo.par.impar.modelo.dao.entidade.Pessoa;
import br.ies.poo.deiwid.petry.jogo.par.impar.main.jogo.par.impar.modelo.dao.entidade.Rodada;

public class GerenciadorDeFabricaDeHibernate {

	private static GerenciadorDeFabricaDeHibernate INSTANCIA_UNICA = null;
	private SessionFactory fabricaDeSessao;

	private GerenciadorDeFabricaDeHibernate() {
		Properties properties = new Properties();
		properties.put(Environment.DIALECT, "org.hibernate.dialect.PostgreSQLDialect");
		properties.put(Environment.DRIVER, "org.postgresql.Driver");
		properties.put(Environment.URL, "jdbc:postgresql://localhost:5432/saas");
		properties.put(Environment.USER, "comexchain");
		properties.put(Environment.PASS, "comexchain");
		properties.put(Environment.AUTOCOMMIT, "false");
		properties.put(Environment.SHOW_SQL, "true");
		properties.put(Environment.HBM2DDL_AUTO, "validate");
		Configuration configuration = new Configuration();
		configuration.addAnnotatedClass(Pessoa.class);
		configuration.addAnnotatedClass(Rodada.class);
		configuration.setProperties(properties);
		fabricaDeSessao = configuration.buildSessionFactory();
	}

	public static GerenciadorDeFabricaDeHibernate obterInstancia() {
		if (INSTANCIA_UNICA == null) {
			INSTANCIA_UNICA = new GerenciadorDeFabricaDeHibernate();
		}
		return INSTANCIA_UNICA;
	}

	public SessionFactory getFabricaDeSessao() {
		return fabricaDeSessao;
	}

}
