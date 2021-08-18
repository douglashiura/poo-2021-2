package desenvolvimento;

import java.util.Random;

public abstract class Acao {
	private Integer fichas = 0;
	private Integer n1;
	private Integer n2;
	private Integer n3;
	private Integer reembolso;
	private boolean recompensa = false;
	
	
	
	public void colocarMoeda(Jogador jogador) {
		if (jogador.getMoeda() ==1) {
			jogador.setFichas(1);
			jogador.setMoeda(0);
		}
			else if (jogador.getMoeda() ==5) {
				jogador.setFichas(5);
				jogador.setMoeda(0);
			}
			else if (jogador.getMoeda() ==10) {
				jogador.setFichas(10);
				jogador.setMoeda(0);
			}	
			else {
				System.out.println("Moeda inválida! Sua moeda será devolvida.");
			}
		}
	
	
	public void puxarAlavanca(Jogador jogador) {
		if (jogador.getFichas() >0) {
			Random r1 = new Random();
			Random r2 = new Random();
			Random r3 = new Random();
			this.n1 = r1.nextInt(3);
			this.n2 = r2.nextInt(3);
			this.n3 = r3.nextInt(3);
			jogador.setFichas(jogador.getFichas()-1);

			System.out.println(n1 + " " + n2 + " " + n3);
		}
	}
			
	public void buscarCombinacaoVencedora(Integer n1, Integer n2, Integer n3) {
		
		if (n1 ==n2 && n2 == n3 ) {
			System.out.println("Venceu ");
			this.recompensa = true;
		}
		else {
			System.out.println("Tente novamente");
		}
	}
	
	
	public void setFichas(Integer fichas) {
		this.fichas = fichas;
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
