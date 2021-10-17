package br.ies.aula.jogo.cacaniquel.modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import br.ies.aula.jogo.cacaniquel.modelo.dao.hibernate.PremioDAOHibernate;


public class Modelo {

	private List<Integer> listaValoresAleatorios;
	private Jogador jogador;
	private PremioDAOHibernate premioDAO;
	private String resultado;

	public boolean verificarSeJogadorTemFichas() {
		
		if (jogador.getFichas()>0) {
			return true;
		}else {
			return false;
		}
	}
	
	public List<Integer> gerarValoresAleatorios() {
		
		listaValoresAleatorios = new ArrayList<>();

		for (int i = 0; i < 3; i++) {
			listaValoresAleatorios.add(new Random().nextInt(3));
		}
		
		verificarSeTemVitoria(listaValoresAleatorios);
		removerUmaFichaDoJogador();
		
		return listaValoresAleatorios;
	}
	
	public void verificarSeTemVitoria(List<Integer> listaCombinacoes) {

		if (listaCombinacoes.get(0) == listaCombinacoes.get(1) & listaCombinacoes.get(1) == listaCombinacoes.get(2)) {
		
			setResultado("Parabéns, você ganhou R$60,00!");
			
			premioDAO = new PremioDAOHibernate();
			premioDAO.enviarPremioAoBanco(jogador);
			
		} else {
			setResultado("Perdeu. Tente novamente!");
		}
	}
	
	public void trocarDinheiroPorFicha(Integer dinheiro) {
		
		jogador.recebeFichas(dinheiro);
		jogador.zerarDinheiro();
	}
	
	public void removerUmaFichaDoJogador() {
		
		jogador.recebeFichas(jogador.getFichas()-1);
	}

	
	
	
	public void setJogador(Jogador j) {
		
		this.jogador = j;
	}
	
	public void setResultado(String resultado) {
		
		this.resultado = resultado;
	}
	public String getResultado() {
		
		return resultado;
	}



}
