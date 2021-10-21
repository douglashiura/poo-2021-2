package br.ies.poo.deiwid.petry.jogo.par.impar.main.jogo.par.impar.modelo.dao.fachada;

import br.ies.poo.deiwid.petry.jogo.par.impar.main.jogo.par.impar.modelo.dao.entidade.Rodada;

public interface RodadaDAO {

	void inserir(Rodada rodada);

	Rodada encontar(Integer id);
}
