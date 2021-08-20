package aulas;

import static org.junit.Assert.assertEquals;

import java.util.Random;

import org.junit.Test;

public class TestePrincipal extends GeradorDeContas{

	
	
	@Test
	public void soma() throws Exception {

		Jogador jogadorUM = new Jogador();
		jogadorUM.setNome("Anatan");

		GeradorDeContas gerador = new GeradorDeContas();
		GeradorDeContas soma = new GeradorDeContas();

		soma.setQuestao(gerador.valo() + gerador.valo());
		System.out.println(soma.getQuestao()+"Soma");
		jogadorUM.setResposta(4);
	

		assertEquals(soma.getQuestao(), jogadorUM.getResposta());

	}

	@Test
	public void testRandom() throws Exception {
		
		GeradorDeContas gerador = new GeradorDeContas();
		Random ram = new Random();

		for (int i = 0; i < 1; i++) {
			System.out.println(ram.nextInt(100));
			System.out.println(gerador.valo()+"mm");
		}
	}

}
