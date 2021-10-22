package br.ies.pooii.douglas.hiura.jogo.par.impar.modelo;

import br.ies.pooii.douglas.hiura.jogo.par.impar.modelo.dao.entidade.Pessoa;

public class Torcedor {

	private Especulavel recebeOResultado;
	private Pessoa pessoa;

	public Torcedor(Especulavel recebeOResultado, String nome, String senha) {
		this.recebeOResultado = recebeOResultado;
		pessoa = new Pessoa();
		pessoa.setNome(nome);
		pessoa.setSenha(senha);
	}

	public Especulavel obterSuaParteEspeculavel() {
		return recebeOResultado;
	}

	public Pessoa comoPessoa() {
		return pessoa;
	}

}
