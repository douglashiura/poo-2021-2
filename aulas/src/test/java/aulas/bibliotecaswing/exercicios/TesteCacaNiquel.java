package aulas.bibliotecaswing.exercicios;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import br.ies.aula.jogo.cacaniquel.modelo.Jogador;
import br.ies.aula.jogo.cacaniquel.modelo.Modelo;
import br.ies.aula.jogo.cacaniquel.modelo.dao.entidade.MapJogador;
import br.ies.aula.jogo.cacaniquel.modelo.dao.hibernate.JogadorDAOHibernate;


public class TesteCacaNiquel {

	
	@Test
	public void buscarJogadorPorID() throws Exception {
		
		MapJogador jogador = new MapJogador();
		jogador.setId(17);
		
		JogadorDAOHibernate daoHibernate = new JogadorDAOHibernate();
		MapJogador resultadoDaBusca = daoHibernate.buscarNoBanco(jogador);
		
		System.out.println(resultadoDaBusca.getNome()+" "+resultadoDaBusca.getId());
	}

	
	@Test
	public void persistirJogadorHibernate() throws Exception {
		
		MapJogador jogador = new MapJogador();
		jogador.setNome("Juh");
		jogador.setPremio(25);
		jogador.setDinheiro(20);
		jogador.setId(17);

		JogadorDAOHibernate jogadorDAO = new JogadorDAOHibernate();
		jogadorDAO.inserirJogador(jogador);
	}
	
	@Test
	public void updateJogadorHibernate() throws Exception {
		
		MapJogador jogador = new MapJogador();
		jogador.setId(17);
		jogador.setPremio(60);
		JogadorDAOHibernate jogadorDAO = new JogadorDAOHibernate();
		jogadorDAO.updatePremio(jogador);
	}
	
	@Test
	public void jogadorInsereDinheiroERecebeFichas() throws Exception {
		Jogador jogador = new Jogador();
		Modelo maquina = new Modelo();

		
		maquina.adicionarJogador(jogador);
		
		jogador.setDinheiro(5);
		maquina.pegarDinheiroDoJogador(jogador);
		
		assertEquals(jogador.getDinheiro(), Integer.valueOf(0));
		assertEquals(jogador.getFichas(), Integer.valueOf(5));
		assertEquals(maquina.getDinheiro(), Integer.valueOf(0));		
	}
}
