package desenvolvimento;

import java.util.Random;

public class Acao {
	private Integer fichas = 0;
	private Integer n1;
	private Integer n2;
	private Integer n3;
	private boolean recompensa = false;
	
	public void colocarMoeda(Jogador moedaDoJogador) {
		switch (moedaDoJogador.getMoeda()) {
			case 1:
				this.fichas = 1;
				break;
			case 5:
				this.fichas = 5;
				break;
			case 10:
				this.fichas = 10;
				break;
		}
		
	}
	
	public void puxarAlavanca(Integer fichas) {
		if (fichas >0) {
			Random r1 = new Random();
			Random r2 = new Random();
			Random r3 = new Random();
			this.n1 = r1.nextInt(3);
			this.n2 = r2.nextInt(3);
			this.n3 = r3.nextInt(3);

			System.out.println(n1 + " " + n2 + " " + n3);
		}
	}
			
	public void buscarCombinacaoVencedora(Integer n1, Integer n2, Integer n3) {
		
		if (n1 == n2 && n2 == n3) {
			System.out.println("Venceu ");
			this.recompensa = true;
		}
		else {
			System.out.println("Tente novamente");
		}
	}
	
	
	
	public Integer getFichas() {
		return fichas;
	}
	public Integer getN1() {
		return n1;
	}
	public Integer getN2() {
		return n2;
	}
	public Integer getN3() {
		return n3;
	}
	public boolean getRecompensa() {
		return recompensa;
	}
	
	




}
