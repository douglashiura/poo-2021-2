package br.ies.aula.jogo.cacaniquel.modelo.dao.hibernate;

import java.util.Properties;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import br.ies.aula.jogo.cacaniquel.modelo.Jogador;
import br.ies.aula.jogo.cacaniquel.modelo.dao.entidade.MapPremio;
import br.ies.aula.jogo.cacaniquel.modelo.dao.fachada.PremioDAO;

public class PremioDAOHibernate implements PremioDAO {
	
	SessionFactory fabricaDeSessao;
	Integer valorDoPremio = 60;
	
	public PremioDAOHibernate() {
		
		Properties propriedades = new Properties();
		propriedades.put(Environment.DIALECT, "org.hibernate.dialect.PostgreSQLDialect");
		propriedades.put(Environment.DRIVER, "org.postgresql.Driver");
		propriedades.put(Environment.URL, "jdbc:postgresql://localhost:5433/postgres");
		propriedades.put(Environment.USER, "postgres");
		propriedades.put(Environment.PASS, "3242");
		propriedades.put(Environment.SHOW_SQL, "true");
		propriedades.put(Environment.HBM2DDL_AUTO, "validate");
		Configuration configuracao = new Configuration();
		configuracao.addAnnotatedClass(MapPremio.class);
		configuracao.setProperties(propriedades);
		fabricaDeSessao = configuracao.buildSessionFactory();
	}

	@Override
	public void enviarPremioAoBanco(Jogador jogador) {
		
		MapPremio mapPremio = new MapPremio();
		mapPremio.setId_jogador(jogador.getId());
		mapPremio.setValor(valorDoPremio);
		mapPremio.setStatus("A sacar");
		
		Session sessao = fabricaDeSessao.openSession();
		sessao.beginTransaction();
		sessao.persist(mapPremio);
		sessao.getTransaction().commit();
		sessao.close();
	}
}
