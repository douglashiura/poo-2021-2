package br.ies.aula.jogo.cacaniquel.modelo.dao.hibernate;

import java.util.List;
import java.util.Properties;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import br.ies.aula.jogo.cacaniquel.modelo.dao.entidade.MapJogador;
import br.ies.aula.jogo.cacaniquel.modelo.dao.fachada.JogadorDAO;

public class JogadorDAOHibernate implements JogadorDAO {
	
	SessionFactory fabricaDeSessao;
	
	
	public JogadorDAOHibernate () {
		
		Properties propriedades = new Properties();
		propriedades.put(Environment.DIALECT, "org.hibernate.dialect.PostgreSQLDialect");
		propriedades.put(Environment.DRIVER, "org.postgresql.Driver");
		propriedades.put(Environment.URL, "jdbc:postgresql://localhost:5433/postgres");
		propriedades.put(Environment.USER, "postgres");
		propriedades.put(Environment.PASS, "3242");
		propriedades.put(Environment.SHOW_SQL, "true");
		propriedades.put(Environment.HBM2DDL_AUTO, "validate");
		Configuration configuracao = new Configuration();
		configuracao.addAnnotatedClass(MapJogador.class);
		configuracao.setProperties(propriedades);
		fabricaDeSessao = configuracao.buildSessionFactory();
	}
	
	@Override
	public void inserirJogador(MapJogador mapJogador) {
		
		Session sessao = fabricaDeSessao.openSession();
		sessao.beginTransaction();
		sessao.persist(mapJogador);
		sessao.getTransaction().commit();
		sessao.close();
	}

	@Override
	public MapJogador buscarNoBanco(MapJogador mapJogador) {
		
			Session sessao = fabricaDeSessao.openSession();
			try {
				return sessao.find(MapJogador.class, mapJogador.getId());
			
			} finally {
				sessao.close();
			}
	}
	
	public void updatePremio(MapJogador mapJogador) {
		
			Session sessao = fabricaDeSessao.openSession();
			sessao.beginTransaction();
			MapJogador jogador = sessao.find(MapJogador.class, mapJogador.getId());
			jogador.setPremio(jogador.getPremio() + mapJogador.getPremio());
			jogador = null;
			sessao.getTransaction().commit();
			sessao.close();
	}

	
}
