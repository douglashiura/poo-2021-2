package tec.nnilux.model;

import java.util.ArrayList;

public class Marca {

	private Integer codMarca;
	private String nome;
	private ArrayList<Equipamento> equipamentos = new ArrayList<Equipamento>();

	public Integer getCodMarca() {
		return codMarca;
	}

	public void setCodMarca(Integer codMarca) {
		this.codMarca = codMarca;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ArrayList<Equipamento> getEquipamentos() {
		return equipamentos;
	}

	public void setEquipamentos(ArrayList<Equipamento> equipamentos) {
		this.equipamentos = equipamentos;
	}

}
