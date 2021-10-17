package br.ies.aula.jogo.cacaniquel.modelo.dao.entidade;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "premio")
public class MapPremio {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer id;
	@Column(nullable = false)
	private Integer id_jogador;
	@Column(nullable = false)
	private Integer valor;
	@Column(nullable = true)
	private String status;
	
	
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getId_jogador() {
		return id_jogador;
	}
	public void setId_jogador(Integer id_jogador) {
		this.id_jogador = id_jogador;
	}
	public Integer getValor() {
		return valor;
	}
	public void setValor(Integer valor) {
		this.valor = valor;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
