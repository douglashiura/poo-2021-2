package br.ies.aula.jogo.cacaniquel.modelo.dao.fachada;

import br.ies.aula.jogo.cacaniquel.modelo.Jogador;

public interface PremioDAO {
	
	public void enviarPremioAoBanco(Jogador jogador);

}
