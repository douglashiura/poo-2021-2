package desenvolvimento;

import org.junit.Test;
import static org.junit.Assert.*;

public class Maquina {
	
	@Test
	//player extend acao(classe abst) pra pegar o metodo puxarAlavanca para puxar a alavanca ;
	//metodo puxar alavanca gera 3 valores aleatorios
	//
	public void testeColocarMoedaNaMaquina() throws Exception {
		//Jogador.colocarMoeda();
		Jogador jogador = new Jogador();
		
		
		assertEquals(false, jogador.statusAcesso());
		
		
		
	}
	

}
