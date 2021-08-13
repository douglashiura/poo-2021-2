package aulas;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestePrincipal {

	@Test
	public void soma() throws Exception {

		Jogador jogadorUM = new Jogador();
		jogadorUM.setNome("Anatan");
		
		GeradorDeContas soma = new GeradorDeContas();
		
		assertEquals(soma.getQuestao(), jogadorUM.getResposta());

	}

}
