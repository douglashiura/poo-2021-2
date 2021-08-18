package aulas;

import java.util.Random;

public class GeradorDeContas {

	 private Integer questao;
	 private Integer randomico;


	public Integer getQuestao() {
		return questao;
	}

	public void setQuestao(Integer questao) {
		this.questao = questao;
	}
	
	
	
	
	public Integer getRandomico() {
		return randomico;
	}

	public void setRandomico(Integer numero) {
		
		
		Random gerador = new Random();

		for (int i = 0; i < 1; i++) {
			numero = gerador.nextInt(100);
			System.out.println(numero+"testest");
		}
	}

	
	

}
