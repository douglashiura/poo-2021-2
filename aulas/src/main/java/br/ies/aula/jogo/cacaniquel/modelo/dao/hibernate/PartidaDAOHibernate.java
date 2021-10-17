package br.ies.aula.jogo.cacaniquel.modelo.dao.hibernate;

import java.util.Properties;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import br.ies.aula.jogo.cacaniquel.modelo.Jogador;
import br.ies.aula.jogo.cacaniquel.modelo.dao.entidade.MapPartida;
import br.ies.aula.jogo.cacaniquel.modelo.dao.fachada.PartidaDAO;

public class PartidaDAOHibernate implements PartidaDAO{
	
	SessionFactory fabricaDeSessao;
	
	public PartidaDAOHibernate() {
		
		Properties propriedades = new Properties();
		propriedades.put(Environment.DIALECT, "org.hibernate.dialect.PostgreSQLDialect");
		propriedades.put(Environment.DRIVER, "org.postgresql.Driver");
		propriedades.put(Environment.URL, "jdbc:postgresql://localhost:5433/postgres");
		propriedades.put(Environment.USER, "postgres");
		propriedades.put(Environment.PASS, "3242");
		propriedades.put(Environment.SHOW_SQL, "true");
		propriedades.put(Environment.HBM2DDL_AUTO, "validate");
		Configuration configuracao = new Configuration();
		configuracao.addAnnotatedClass(MapPartida.class);
		configuracao.setProperties(propriedades);
		fabricaDeSessao = configuracao.buildSessionFactory();
	}
	
	
	@Override
	public void enviarPartidaAoBanco(Jogador jogador) {
		
		MapPartida mapPartida = new MapPartida();
		mapPartida.setId_jogador(jogador.getId());
		mapPartida.setReembolso(jogador.getReembolso());
		jogador.setReembolso(0);
		
		Session sessao = fabricaDeSessao.openSession();
		sessao.beginTransaction();
		sessao.persist(mapPartida);
		sessao.getTransaction().commit();
		sessao.close();
	}
	

}
