package hibernate.testes;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.Collections;
import java.util.List;
import java.util.Properties;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.junit.Test;

import hibernate.classedao.MapPessoa;
import hibernate.classedao.Rodada;
import hibernate.classedepersistencia.PessoaDAOHibernate;
import hibernate.classedepersistencia.RodadaDAOHibernate;

public class TesteHibernate{
	
	@Test
	public void testHibernateIsConnected() {
		
		Properties properties = new Properties();
		properties.put(Environment.DIALECT, "org.hibernate.dialect.PostgreSQLDialect");
		properties.put(Environment.DRIVER, "org.postgresql.Driver");
		properties.put(Environment.URL, "jdbc:postgresql://localhost:5433/postgres");
		properties.put(Environment.USER, "postgres");
		properties.put(Environment.PASS, "3242");
		properties.put(Environment.SHOW_SQL, "true");
		properties.put(Environment.HBM2DDL_AUTO, "validate");
		Configuration configuracao = new Configuration();
		configuracao.setProperties(properties);
		SessionFactory fabricaDeSessao = configuracao.buildSessionFactory();
		Session sessao = fabricaDeSessao.openSession();
		assertTrue(sessao.isConnected());
	}

	@Test
	public void inserirDouglas() throws Exception {
		
		MapPessoa pessoa = new MapPessoa();
		pessoa.setNome("i");
		pessoa.setSenha("clye2");
		PessoaDAOHibernate daoHibernate = new PessoaDAOHibernate();
		daoHibernate.inserir(pessoa);
		assertNotNull(pessoa.getId());
	}
	
	@Test
	public void ListarPessoasDaTabela() throws Exception {
	
		PessoaDAOHibernate daoHibernate = new PessoaDAOHibernate();
		List<MapPessoa> pessoas = daoHibernate.listar();
		
		pessoas.forEach(p -> System.out.println(p.getId() +" "+ p.getNome()));
		
		assertEquals(9, pessoas.size());
		
	}

	
	
}
