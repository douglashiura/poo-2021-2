package desenvolvimento;
import org.junit.Test;
import static org.junit.Assert.*;

import javax.swing.JOptionPane;

public class Maquina extends Acao {
	private Integer continuar =1;
	
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
	public void testeOjogo() throws Exception {
		Jogador jogador = new Jogador();
		Maquina maquina = new Maquina();
		jogador.setMoeda(10);
		maquina.colocarMoeda(jogador);
		
		while (jogador.getFichas() >0) {
			System.out.println("Você possui: " + jogador.getFichas() + " fichas");
			
			maquina.puxarAlavanca(jogador);
			maquina.buscarCombinacaoVencedora(maquina.getN1(), maquina.getN2(), maquina.getN3());
		}
		
		assertEquals(Integer.valueOf(0), jogador.getFichas());
	}
	@Test
	public void testeDesistenciaNoMeioDaPartida() throws Exception {
		Jogador jogador = new Jogador();
		Maquina maquina = new Maquina();
		jogador.setMoeda(5);
		maquina.colocarMoeda(jogador);
		
		while (jogador.getFichas() >0 && continuar ==1 ) {
			System.out.println("Você possui: " + jogador.getFichas() + " fichas");
			
			continuar = Integer.parseInt(JOptionPane.showInputDialog("Digite '1' para rodar a alavanca, ou '0' para sair."));
				
			if (continuar ==1) {
				maquina.puxarAlavanca(jogador);
				maquina.buscarCombinacaoVencedora(maquina.getN1(), maquina.getN2(), maquina.getN3());
			}
		}
		
		assertEquals(Integer.valueOf(4), jogador.getFichas());
	}
	
	
}
