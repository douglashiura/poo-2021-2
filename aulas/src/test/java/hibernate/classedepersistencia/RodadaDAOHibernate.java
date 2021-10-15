package hibernate.classedepersistencia;

import java.util.Properties;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;

import hibernate.classedao.MapPessoa;
import hibernate.classedao.Rodada;
import hibernate.interfacee.RodadaDAO;

public class RodadaDAOHibernate implements RodadaDAO {

	private SessionFactory fabricaDeSessao;

	public RodadaDAOHibernate() {
		
		Properties propriedades = new Properties();
		propriedades.put(Environment.DIALECT, "org.hibernate.dialect.PostgreSQLDialect");
		propriedades.put(Environment.DRIVER, "org.postgresql.Driver");
		propriedades.put(Environment.URL, "jdbc:postgresql://localhost:5433/postgres");
		propriedades.put(Environment.USER, "postgres");
		propriedades.put(Environment.PASS, "3242");
		propriedades.put(Environment.SHOW_SQL, "true");
		propriedades.put(Environment.HBM2DDL_AUTO, "validate");
		
		Configuration configuracao = new Configuration();
		configuracao.addAnnotatedClass(Rodada.class);
		configuracao.addAnnotatedClass(MapPessoa.class);
		configuracao.setProperties(propriedades);
		fabricaDeSessao = configuracao.buildSessionFactory();
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