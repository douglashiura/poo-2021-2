package com.github.pedrolucascorrea.poo.test.calculadora.controller;

import java.util.Locale;

import com.github.pedrolucascorrea.poo.test.calculadora.model.Expressao;

public class ExpressaoController {
	
	public String requestAnswer(Expressao ex) {
		Double resposta = ex.getResposta();
		if(resposta%resposta.intValue()==0) {
			return String.format(Locale.US,"%1.0f", ex.getResposta());
		}
		return String.format(Locale.US,"%1.3f", ex.getResposta());
	}
}
