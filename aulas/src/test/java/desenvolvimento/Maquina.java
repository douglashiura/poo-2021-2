package desenvolvimento;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Random;

public class Maquina{
	private Integer fichas = 0;
	private boolean acesso = false;
	private Integer n1;
	private Integer n2;
	private Integer n3;
	
	@Test
	public void testeGerarAcesso() throws Exception {
		Acao maquina = new Acao();
		Jogador jogador = new Jogador();
		jogador.setMoeda(5);
		maquina.colocarMoeda(jogador);
		acesso = maquina.getAcesso();
		fichas = maquina.getFichas();
		
		assertEquals(Integer.valueOf(5), jogador.getMoeda());
		assertEquals(Integer.valueOf(5), fichas);
		assertTrue(acesso);
		
		while (this.fichas >0) {
			System.out.println("Você possui: " + fichas + " fichas");
			maquina.puxarAlavanca(fichas);
			n1 = maquina.getN1();
			n2 = maquina.getN2();
			n3 = maquina.getN3();
			
			this.fichas = fichas - 1;
			
		}
			
		
		
	}
	
	public void testePuxarAlavanca() throws Exception {
		
		
				
		}

	
	
	
}
