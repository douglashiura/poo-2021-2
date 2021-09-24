package tec.nnilux.controller;

import tec.nnilux.model.Equipamento;

public class EquipamentoController {

	public void cadastrarEquipamento(String nome, String tipo) throws Exception {
		if (nome != null && nome.length() > 0 && tipo != null && tipo.length() > 0) {
			Equipamento equipamento = new Equipamento(nome, tipo);
			equipamento.cadastrarEquipamento(equipamento);
		} else {
			throw new Exception("Preencha os campos corretamente");
		}
	}

}
