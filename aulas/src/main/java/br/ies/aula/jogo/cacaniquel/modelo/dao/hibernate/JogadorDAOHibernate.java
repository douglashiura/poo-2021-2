package br.ies.aula.jogo.cacaniquel.modelo.dao.hibernate;

import java.util.Properties;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import br.ies.aula.jogo.cacaniquel.modelo.Jogador;
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
	public void enviarJogadorAoBanco(Jogador jogador) {
		
			Session sessao = fabricaDeSessao.openSession();
			sessao.beginTransaction();
			sessao.persist(converterJogadorToMapJogador(jogador));
			sessao.getTransaction().commit();
			sessao.close();
	}

	@Override
	public MapJogador buscarJogadorNoBanco(Jogador jogador) {
		
			Session sessao = fabricaDeSessao.openSession();
			try {
				return sessao.find(MapJogador.class, jogador.getId());
			
			} finally {
				sessao.close();
			}
	}
	
	@Override
	public MapJogador converterJogadorToMapJogador(Jogador jogador) {
		
		MapJogador mapJogador = new MapJogador();
		mapJogador.setId(jogador.getId());
		mapJogador.setNome(jogador.getNome());
		
		return mapJogador;
	}

	@Override
	public String cadastrarJogador(Jogador jogador) {
		
		MapJogador mapJogador = buscarJogadorNoBanco(jogador);
		
		if (mapJogador == null) {
			enviarJogadorAoBanco(jogador);
			return "Novo jogador cadastrado!";
			
		} else {
			return "Bem-vindo de volta!";
		}
	}

	
	
}
