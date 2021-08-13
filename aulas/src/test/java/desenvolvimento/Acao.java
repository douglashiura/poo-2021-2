package desenvolvimento;


public class Acao {
	private boolean acesso = false;
	private Integer fichas = 0;
	
	
	
	public void puxarAlavanca(Integer fichas) {
		if (this.fichas !=0) {
			
		}
	}
	
	
	
	public void colocarMoeda(Jogador moedaDoJogador) {
		switch (moedaDoJogador.getMoeda()) {
			case 1:
				System.out.print("Você tem 1 chance");
				this.fichas = 1;
				this.acesso = true;
				break;
			case 5:
				System.out.print("Você tem 5 chances");
				this.fichas = 5;
				this.acesso = true;
				break;
			case 10:
				System.out.print("Você tem 10 chances");
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
}
