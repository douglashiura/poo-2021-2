package tec.nnilux.model;

import java.util.ArrayList;

public class Equipamento {

	private Integer codEquipamento;
	private String nome;
	private String modelo;
	private Integer ano;
	private ArrayList<Item> itens = new ArrayList<Item>();
	private ArrayList<Marca> marcas = new ArrayList<Marca>();

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

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public ArrayList<Item> getItens() {
		return itens;
	}

	public void setItens(ArrayList<Item> itens) {
		this.itens = itens;
	}

	public ArrayList<Marca> getMarcas() {
		return marcas;
	}

	public void setMarcas(ArrayList<Marca> marcas) {
		this.marcas = marcas;
	}

}
