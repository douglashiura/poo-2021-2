package com.github.pedrolucascorrea.poo.test.calculadora.controller;

import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;

import com.github.pedrolucascorrea.poo.test.calculadora.DAO.Historico;
import com.github.pedrolucascorrea.poo.test.calculadora.model.Expressao;

public class HistoricoController {
	private Historico historico;

	public HistoricoController() {
		try {
			this.historico = new Historico();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void add(Expressao ex) {
		historico.add(ex);
	}

	public Map<Integer, Expressao> list() {
		Map<Integer, Expressao> map = new HashMap<>();
		map = null;
		try {
			map = historico.listAll();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return map;
	}
}
