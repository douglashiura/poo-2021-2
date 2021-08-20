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

	public Integer valo() {
		
		Random gerador = new Random();

			return this.randomico = gerador.nextInt(100);

	}
}
