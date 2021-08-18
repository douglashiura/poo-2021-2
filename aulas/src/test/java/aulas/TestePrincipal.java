package aulas;

import static org.junit.Assert.assertEquals;

import java.util.Random;

import org.junit.Test;

public class TestePrincipal {

	@Test
	public void soma() throws Exception {

		Jogador jogadorUM = new Jogador();
		jogadorUM.setNome("Anatan");

		GeradorDeContas soma = new GeradorDeContas();

		soma.setQuestao(2 + 2);
		jogadorUM.setResposta(4);

		assertEquals(soma.getQuestao(), jogadorUM.getResposta());

	}

	@Test
	public void testRandom() throws Exception {
		
		GeradorDeContas gerador = new GeradorDeContas();
		Random ram = new Random();

		for (int i = 0; i < 1; i++) {
			System.out.println(ram.nextInt(100));
			System.out.println(gerador.getRandomico()+"mm");
		}
	}

}
