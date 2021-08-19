package tec.nnilux.model;

import java.util.ArrayList;

public class Equipamento {

	private Integer codEquipamento;
	private String nome;
	private String modelo;
	private Integer ano;
	private ArrayList<Item> itens = new ArrayList<Item>();
	private ArrayList<Marca> marcas = new ArrayList<Marca>();

}
