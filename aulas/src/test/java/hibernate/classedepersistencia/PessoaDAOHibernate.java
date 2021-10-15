package hibernate.classedepersistencia;

import java.util.List;
import java.util.Properties;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;

import hibernate.classedao.MapPessoa;
import hibernate.interfacee.PessoaDAO;

public class PessoaDAOHibernate implements PessoaDAO{
		
	SessionFactory fabricaDeSessao;

	public PessoaDAOHibernate() {
			
		Properties propriedades = new Properties();
		propriedades.put(Environment.DIALECT, "org.hibernate.dialect.PostgreSQLDialect");
		propriedades.put(Environment.DRIVER, "org.postgresql.Driver");
		propriedades.put(Environment.URL, "jdbc:postgresql://localhost:5433/postgres");
		propriedades.put(Environment.USER, "postgres");
		propriedades.put(Environment.PASS, "3242");
		propriedades.put(Environment.SHOW_SQL, "true");
		propriedades.put(Environment.HBM2DDL_AUTO, "validate");
		Configuration configuracao = new Configuration();
		configuracao.addAnnotatedClass(MapPessoa.class);
		configuracao.setProperties(propriedades);
		fabricaDeSessao = configuracao.buildSessionFactory();
	}

	@Override
	public void inserir(MapPessoa mapPessoa) {
		
		Session sessao = fabricaDeSessao.openSession();
		sessao.save(mapPessoa);
		sessao.close();
	}

	@Override
	public void deletar(MapPessoa mapPessoa) {
		
	}

	@Override
	public List<MapPessoa> listar() {
		
		Session sessao = fabricaDeSessao.openSession();
		try {
			return sessao.createQuery("SELECT mappessoa FROM MapPessoa mappessoa", MapPessoa.class).list();
		} finally {
			sessao.close();
		}
	}

}
