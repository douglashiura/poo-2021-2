package desenvolvimento;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Random;

public class Maquina extends Acao{
	private Integer fichas = 0;
	Integer n1;
	Integer n2;
	Integer n3;
	
	
	
	@Test
	public void testeGerarFichas() throws Exception {
		Jogador jogador = new Jogador();
		Maquina maquina = new Maquina();
		jogador.setMoeda(5);
		maquina.colocarMoeda(jogador);
		fichas = maquina.getFichas();
		
		assertEquals(Integer.valueOf(5), maquina.getFichas());
	}
		
	@Test
	public void testeAlavanca() throws Exception {
		// o jogo aceita apenas os valores: 1, 5 e 10;
		Jogador jogador = new Jogador();
		Maquina maquina = new Maquina();
		jogador.setMoeda(10);
		maquina.colocarMoeda(jogador);
		fichas = maquina.getFichas();
		
		while (fichas >0) {
			System.out.println("Você possui: " + fichas + " fichas");
			maquina.puxarAlavanca(fichas);
			n1 = maquina.getN1();
			n2 = maquina.getN2();
			n3 = maquina.getN3();
			maquina.buscarCombinacaoVencedora(n1, n2, n3);
			maquina.getRecompensa();
			
			this.fichas = fichas - 1;
		}		
		
		
	}



}
