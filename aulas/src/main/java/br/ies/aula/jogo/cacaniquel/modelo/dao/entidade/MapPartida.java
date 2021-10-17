package br.ies.aula.jogo.cacaniquel.modelo.dao.entidade;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "partida")
public class MapPartida {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer id;
	@Column(nullable = true)
	private Integer id_jogador;
	@Column(nullable = true)
	private Integer reembolso;
	
	
	
	
	
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
	public Integer getReembolso() {
		return reembolso;
	}
	public void setReembolso(Integer reembolso) {
		this.reembolso = reembolso;
	}

}
