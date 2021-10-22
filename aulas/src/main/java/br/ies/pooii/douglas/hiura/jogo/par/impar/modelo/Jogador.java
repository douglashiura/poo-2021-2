package br.ies.pooii.douglas.hiura.jogo.par.impar.modelo;

import br.ies.pooii.douglas.hiura.jogo.par.impar.modelo.dao.entidade.Pessoa;

public class Jogador {

	private Especulavel recebeResultado;
	private Pessoa pessoa;

	public Jogador(Especulavel recebeResultado, String nome, String senha) {
		this.recebeResultado = recebeResultado;
		pessoa = new Pessoa();
		pessoa.setNome(nome);
		pessoa.setSenha(senha);
	}

	public Especulavel obterSuaParteEspeculavel() {
		return recebeResultado;
	}

	public Pessoa comoPessoa() {
		return pessoa;
	}

}
