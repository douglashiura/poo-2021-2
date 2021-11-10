package aulas.bibliotecaswing.exercicios;

import org.junit.Test;
import br.ies.aula.jogo.cacaniquel.modelo.Jogador;
import br.ies.aula.jogo.cacaniquel.modelo.Modelo;
import br.ies.aula.jogo.cacaniquel.modelo.dao.entidade.MapJogador;
import br.ies.aula.jogo.cacaniquel.modelo.dao.hibernate.JogadorDAOHibernate;
import br.ies.aula.jogo.cacaniquel.modelo.dao.hibernate.PartidaDAOHibernate;
import br.ies.aula.jogo.cacaniquel.modelo.dao.hibernate.PremioDAOHibernate;


public class TesteCacaNiquel {
	JogadorDAOHibernate jogadorDAO;
	
	
	@Test
	public void persistirJogador() throws Exception {
		
		Jogador jogador = new Jogador();
		jogador.setId(2527);
		jogador.setNome("Xesus");

		jogadorDAO = new JogadorDAOHibernate();
		jogadorDAO.enviarJogadorAoBanco(jogador);
	}
	
	@Test
	public void buscarJogador() throws Exception {
		
		Jogador jogador = new Jogador();
		jogador.setId(2527);
		
		jogadorDAO = new JogadorDAOHibernate();
		MapJogador mapJogador = jogadorDAO.buscarJogadorNoBanco(jogador);
		
		System.out.println(mapJogador.getId()+" "+mapJogador.getNome());
	}
	
	@Test
	public void persistirPremio() throws Exception {
		
		Jogador jogador = new Jogador();
		jogador.setId(2527);
		
		PremioDAOHibernate premioDAO = new PremioDAOHibernate();
		premioDAO.enviarPremioAoBanco(jogador);
	}
	
	@Test
	public void testeOJogo() throws Exception {
		
		Jogador jogador = new Jogador();
		jogador.setId(2526);
		Modelo maquina = new Modelo();

		maquina.cadastrarJogador(jogador);
		
		jogador.setDinheiro(5);
		maquina.trocarDinheiroPorFicha(jogador.getDinheiro());
		
		if (maquina.verificarSeJogadorTemFichas()) {
			maquina.gerarValoresAleatorios();
		}
	}
	
	@Test
	public void persistirPartida() throws Exception {
		
		Jogador jogador = new Jogador();
		jogador.setId(2527);
		
		PartidaDAOHibernate partidaDAO = new PartidaDAOHibernate();
		partidaDAO.enviarPartidaAoBanco(jogador);
	}

}
