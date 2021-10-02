package br.ies.aula.jogo.cacaniquel.controle;

import org.junit.Test;
import br.ies.aula.jogo.cacaniquel.modelo.Acao;
import br.ies.aula.jogo.cacaniquel.modelo.Jogador;
import static org.junit.Assert.*;


public class Maquina extends Acao {
	private Integer continuar = 0;

	@Test
	public void testeGerarFichas() throws Exception {
		Jogador jogador = new Jogador();
		Maquina maquina = new Maquina();
		jogador.setMoeda(5);
		maquina.colocarMoeda(jogador);
		
		assertEquals(Integer.valueOf(5), jogador.getFichas());
	}

	@Test
	public void testeMoedaInvalida() throws Exception {
		Jogador jogador = new Jogador();
		Maquina maquina = new Maquina();
		jogador.setMoeda(4);
		maquina.colocarMoeda(jogador);

		assertEquals(Integer.valueOf(0), jogador.getFichas());
		assertEquals(Integer.valueOf(4), jogador.getMoeda());
	}

	@Test
	public void testeDesistenciaNoMeioDaPartida() throws Exception {
		Jogador jogador = new Jogador();
		Maquina maquina = new Maquina();
		jogador.setMoeda(5);
		maquina.colocarMoeda(jogador);

		while (jogador.getFichas() > 0 && continuar == 1) {
			System.out.println("Você possui: " + jogador.getFichas() + " fichas");
			if (continuar == 1) {
				maquina.puxarAlavanca(jogador);
				maquina.buscarCombinacaoVencedora(maquina.getN1(), maquina.getN2(), maquina.getN3());
			}
		}

		assertEquals(Integer.valueOf(5), jogador.getFichas());
	}

	@Test
	public void testeOjogo() throws Exception {
		Jogador jogador = new Jogador();
		Maquina maquina = new Maquina();
		jogador.setMoeda(10);
		maquina.colocarMoeda(jogador);

		while (jogador.getFichas() > 0) {
			System.out.println("Você possui: " + jogador.getFichas() + " fichas");

			maquina.puxarAlavanca(jogador);
			maquina.buscarCombinacaoVencedora(maquina.getN1(), maquina.getN2(), maquina.getN3());
		}

		assertEquals(Integer.valueOf(0), jogador.getFichas());
	}

}
