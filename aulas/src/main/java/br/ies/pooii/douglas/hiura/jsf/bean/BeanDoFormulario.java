package br.ies.pooii.douglas.hiura.jsf.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.ies.pooii.douglas.hiura.jogo.par.impar.modelo.dao.entidade.Pessoa;
import br.ies.pooii.douglas.hiura.jogo.par.impar.modelo.dao.hibernate.PessoaDAOHibernate;

@ManagedBean
@ViewScoped
public class BeanDoFormulario {

	private Pessoa pessoa;

	public BeanDoFormulario() {
		pessoa = new Pessoa();
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void salvar() {
		new PessoaDAOHibernate().inserir(pessoa);
	}

}
