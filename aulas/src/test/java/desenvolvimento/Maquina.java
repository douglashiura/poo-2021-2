package desenvolvimento;

import org.junit.Test;
import static org.junit.Assert.*;

public class Maquina extends Acao{
	private Integer fichas = 0;
	private boolean acesso = false;
	
	@Test
	public void testeGerarAcesso() throws Exception {
		Acao acao = new Acao();
		Jogador jogador = new Jogador();
		jogador.setMoeda(5);
		acao.colocarMoeda(jogador);
		acesso = acao.getAcesso();
		fichas = acao.getFichas();
		
		assertEquals(Integer.valueOf(5), jogador.getMoeda());
		assertEquals(Integer.valueOf(5), fichas);
		assertTrue(acesso);
		
	}
	
	public void testePuxarAlavanca() throws Exception {
		
		if (acesso = true) {
			
			
				
		}
	}

	
	
	
	
}
