package aulas.bibliotecaswing.exercicios;

import static org.junit.Assert.assertEquals;
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
		jogador.setId(1273);
		jogador.setNome("Fuca");

		jogadorDAO = new JogadorDAOHibernate();
		jogadorDAO.enviarJogadorAoBanco(jogador);
	}
	
	@Test
	public void buscarJogador() throws Exception {
		
		Jogador jogador = new Jogador();
		jogador.setId(2929);
		
		jogadorDAO = new JogadorDAOHibernate();
		MapJogador mapJogador = jogadorDAO.buscarJogadorNoBanco(jogador);
		
		System.out.println(mapJogador.getId()+" "+mapJogador.getNome());
	}
	
	@Test
	public void persistirPartida() throws Exception {
		
		Jogador jogador = new Jogador();
		jogador.setId(1273);
		
		PartidaDAOHibernate partidaDAO = new PartidaDAOHibernate();
		partidaDAO.enviarPartidaAoBanco(jogador);
	}

	@Test
	public void persistirPremio() throws Exception {
		
		Jogador jogador = new Jogador();
		jogador.setId(2929);
		
		PremioDAOHibernate premioDAO = new PremioDAOHibernate();
		premioDAO.enviarPremioAoBanco(jogador);
	}
	
	@Test
	public void testeOJogo() throws Exception {
		
		Jogador jogador = new Jogador();
		Modelo maquina = new Modelo();

		maquina.setJogador(jogador);
		
		jogador.setDinheiro(5);
		maquina.trocarDinheiroPorFicha(jogador.getDinheiro());
		maquina.verificarSeJogadorTemFichas();
		
		if (maquina.verificarSeJogadorTemFichas()) {
			maquina.gerarValoresAleatorios();
		}
	}
	

}
