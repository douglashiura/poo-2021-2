package test.br.ies.pooii.douglas.hiura.jogo.par.impar;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.Properties;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.junit.Before;
import org.junit.Test;

import br.ies.pooii.douglas.hiura.jogo.par.impar.modelo.dao.entidade.Pessoa;
import br.ies.pooii.douglas.hiura.jogo.par.impar.modelo.dao.entidade.Rodada;
import br.ies.pooii.douglas.hiura.jogo.par.impar.modelo.dao.hibernate.PessoaDAOHibernate;
import br.ies.pooii.douglas.hiura.jogo.par.impar.modelo.dao.hibernate.RodadaDAOHibernate;

public class TesteHibernate {

	@Before
	public void configurarOTeste() {
		Properties properties = new Properties();
		properties.put(Environment.DIALECT, "org.hibernate.dialect.PostgreSQLDialect");
		properties.put(Environment.DRIVER, "org.postgresql.Driver");
		properties.put(Environment.URL, "jdbc:postgresql://localhost:5432/saas");
		properties.put(Environment.USER, "comexchain");
		properties.put(Environment.PASS, "comexchain");
		properties.put(Environment.SHOW_SQL, "true");
		properties.put(Environment.HBM2DDL_AUTO, "create");
		Configuration configuration = new Configuration();
		configuration.addAnnotatedClass(Pessoa.class);
		configuration.addAnnotatedClass(Rodada.class);
		configuration.setProperties(properties);
		configuration.buildSessionFactory();
	}

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
		configuration.addAnnotatedClass(Rodada.class);
		configuration.setProperties(properties);
		SessionFactory fabricaDeSessao = configuration.buildSessionFactory();
		Session sessao = fabricaDeSessao.openSession();
		assertTrue(sessao.isConnected());
	}

	@Test
	public void inserirDouglas() throws Exception {
		Pessoa douglas = new Pessoa();
		douglas.setNome("Douglas");
		douglas.setSenha("s4nh4");
		PessoaDAOHibernate daoHibernate = new PessoaDAOHibernate();
		daoHibernate.inserir(douglas);
		assertNotNull(douglas.getId());
	}

	@Test
	public void insertirDouglasDeletaELista() throws Exception {
		Pessoa douglas = new Pessoa();
		douglas.setNome("Douglas");
		douglas.setSenha("s4nh4");
		PessoaDAOHibernate daoHibernate = new PessoaDAOHibernate();
		daoHibernate.inserir(douglas);
		daoHibernate.deletar(douglas);
		List<Pessoa> pessoas = daoHibernate.listar();
		assertEquals(0, pessoas.size());
	}

	@Test
	public void insertirDouglasELista() throws Exception {
		Pessoa douglas = new Pessoa();
		douglas.setNome("Douglas");
		douglas.setSenha("s4nh4");
		PessoaDAOHibernate daoHibernate = new PessoaDAOHibernate();
		daoHibernate.inserir(douglas);
		List<Pessoa> pessoas = daoHibernate.listar();
		assertEquals(1, pessoas.size());
		assertEquals(douglas.getId(), pessoas.get(0).getId());
	}

	@Test
	public void inserirDouglasEUmaRodadaComOJogadorDouglas() throws Exception {
		Pessoa douglas = new Pessoa();
		douglas.setNome("Douglas");
		douglas.setSenha("s4nh4");
		Rodada rodada = new Rodada();
		rodada.getJogadores().add(douglas);
		PessoaDAOHibernate daoHibernate = new PessoaDAOHibernate();
		daoHibernate.inserir(douglas);
		RodadaDAOHibernate daoRodadaHibernate = new RodadaDAOHibernate();
		daoRodadaHibernate.inserir(rodada);
		assertNotNull(rodada.getId());
	}

	@Test
	public void inserirDouglasEmDuasRodadaComOJogadorDouglas() throws Exception {
		Pessoa douglas = new Pessoa();
		douglas.setNome("Douglas");
		douglas.setSenha("s4nh4");
		Rodada rodadaUm = new Rodada("GrandePremmio");
		rodadaUm.getJogadores().add(douglas);
		Rodada rodadaDois = new Rodada("Final");
		rodadaDois.getJogadores().add(douglas);
		PessoaDAOHibernate daoHibernate = new PessoaDAOHibernate();
		daoHibernate.inserir(douglas);
		RodadaDAOHibernate daoRodadaHibernate = new RodadaDAOHibernate();
		daoRodadaHibernate.inserir(rodadaUm);
		daoRodadaHibernate.inserir(rodadaDois);
		List<Rodada> rodadasDoDouglas = daoRodadaHibernate.listarTodasAsRodadasDoJogador(douglas);
		assertEquals(2, rodadasDoDouglas.size());
		assertEquals(rodadaUm.getId(), rodadasDoDouglas.get(0).getId());
		assertEquals("GrandePremmio", rodadasDoDouglas.get(0).getNome());
		assertEquals(rodadaDois.getId(), rodadasDoDouglas.get(1).getId());
		assertEquals("Final", rodadasDoDouglas.get(1).getNome());
	}
}
