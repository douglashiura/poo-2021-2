package desenvolvimento;

import java.util.Random;

public class Acao {
	private boolean acesso = false;
	private Integer fichas = 0;
	private Integer n1;
	private Integer n2;
	private Integer n3;

	
	
	
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
			
			
	
	
	public void colocarMoeda(Jogador moedaDoJogador) {
		switch (moedaDoJogador.getMoeda()) {
			case 1:
				this.fichas = 1;
				this.acesso = true;
				break;
			case 5:
				this.fichas = 5;
				this.acesso = true;
				break;
			case 10:
				this.fichas = 10;
				this.acesso = true;
				break;
		}
		
	}
	
	public void setAcesso() {
		this.acesso = true;
	}
	public boolean getAcesso() {
		return acesso;
	}
	
	public Integer getFichas() {
		return fichas;
	}


	public Integer getN1() {
		return n1;
	}
	public void setN1(Integer n1) {
		this.n1 = n1;
	}

	public Integer getN2() {
		return n2;
	}
	public void setN2(Integer n2) {
		this.n2 = n2;
	}

	public Integer getN3() {
		return n3;
	}
	public void setN3(Integer n3) {
		this.n3 = n3;
	}





}
