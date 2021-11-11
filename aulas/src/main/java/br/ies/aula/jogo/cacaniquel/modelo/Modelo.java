 package br.ies.aula.jogo.cacaniquel.modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import br.ies.aula.jogo.cacaniquel.modelo.dao.hibernate.JogadorDAOHibernate;
import br.ies.aula.jogo.cacaniquel.modelo.dao.hibernate.PartidaDAOHibernate;
import br.ies.aula.jogo.cacaniquel.modelo.dao.hibernate.PremioDAOHibernate;


public class Modelo {

	private List<Integer> listaValoresAleatorios;
	private Jogador jogador;
	private String resultado;
	private JogadorDAOHibernate jogadorDAO;
	private PartidaDAOHibernate partidaDAO;
	private PremioDAOHibernate premioDAO;


	public boolean verificarSeJogadorTemFichas() {
		
		return jogador.getFichas() > 0;
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
		
			this.resultado = "Parabéns, você ganhou R$60,00!";
			premioDAO = new PremioDAOHibernate();
			premioDAO.enviarPremioAoBanco(jogador);
		}
		else {
			this.resultado = "Perdeu. Tente novamente!";
		}
	}
	
	public void trocarDinheiroPorFicha(Integer dinheiro) {
		
		jogador.recebeFichas(dinheiro);
		jogador.setDinheiro(0);
	}
	
	public void removerUmaFichaDoJogador() {
		
		jogador.recebeFichas(jogador.getFichas()-1);
	}

	public String cadastrarJogador(Jogador j) {
		
		this.jogador = j;
		jogadorDAO = new JogadorDAOHibernate();
		
		return jogadorDAO.cadastrarJogador(j);
	}
	
	public void reembolsarJogador(Jogador jogador2) {
		
		jogador.setReembolso(jogador.getFichas());
		
		partidaDAO = new PartidaDAOHibernate();
		partidaDAO.enviarPartidaAoBanco(jogador);
		jogador.setReembolso(0);
	}
	
	
	
	
	public String getResultado() {
		
		return resultado;
	}

	

	

	



}
