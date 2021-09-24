package tec.nnilux.model;

import tec.nnilux.dao.EquipamentoDAO;
import tec.nnilux.dao.ExceptionDAO;

public class Equipamento {

	private Integer codEquipamento;
	private String nome;
	private String tipo;
	
	public Equipamento() {
		
	}
	
	public Equipamento(String nome, String tipo) {
		this.nome = nome;
		this.tipo = tipo;
	}


	public Integer getCodEquipamento() {
		return codEquipamento;
	}

	public void setCodEquipamento(Integer codEquipamento) {
		this.codEquipamento = codEquipamento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public void cadastrarEquipamento(Equipamento equipamento) throws ExceptionDAO{
		new EquipamentoDAO().cadastrarEquipamento(equipamento);
		
		
	}

}
