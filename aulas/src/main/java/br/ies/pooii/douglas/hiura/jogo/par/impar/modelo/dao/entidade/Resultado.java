package br.ies.pooii.douglas.hiura.jogo.par.impar.modelo.dao.entidade;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Resultado {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@ManyToOne
	private Pessoa vencedor;
	@ManyToOne
	private Rodada rodada;

	public Integer getId() {
		return id;
	}

	public Pessoa getVencedor() {
		return vencedor;
	}

	public void setVencedor(Pessoa vencedor) {
		this.vencedor = vencedor;
	}

	public Rodada getRodada() {
		return rodada;
	}

	public void setRodada(Rodada rodada) {
		this.rodada = rodada;
	}

}
