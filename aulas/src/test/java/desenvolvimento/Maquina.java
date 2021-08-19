package desenvolvimento;

import org.junit.Test;
import static org.junit.Assert.*;

import java.awt.BorderLayout;
import java.lang.Object;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Maquina extends Acao {
	private Integer continuar = 1;

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

			continuar = Integer
					.parseInt(JOptionPane.showInputDialog("Digite '1' para rodar a alavanca, ou '0' para sair."));

			if (continuar == 1) {
				maquina.puxarAlavanca(jogador);
				maquina.buscarCombinacaoVencedora(maquina.getN1(), maquina.getN2(), maquina.getN3());
			}
		}
		
		assertEquals(Integer.valueOf(3), jogador.getFichas());
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

	@Test
	public void testeJOptionPane() throws Exception {
		// mostrar mensagem
		JOptionPane.showMessageDialog(null, "Digite '1' para rodar a alavanca, ou '0' para sair.");
		continuar = Integer
				.parseInt(JOptionPane.showInputDialog("Digite '1' para rodar a alavanca, ou '0' para sair."));
	}
		
	public static void main(String[] args) {
		// camadas de janelas
		
		//janela main
		JFrame jframe = new JFrame("Titulo");
		//janela secundaria
		JLabel label = new JLabel("Conteúdo da frame");
		
		jframe.getContentPane().add(label, BorderLayout.CENTER);
		jframe.setDefaultCloseOperation(jframe.EXIT_ON_CLOSE);
		jframe.pack();
		jframe.setVisible(true);
		
		}
	
	
	
	
	
	
	
	
	
}
