package com.github.pedrolucascorrea.poo.test.calculadora.model;

import java.util.Locale;

import org.mariuszgromada.math.mxparser.Expression;

public class Expressao {
	private Expression exp;
	private Double resposta;
	
	public Expressao(String exp) {
		this.exp = new Expression(exp);
		this.resposta = this.exp.calculate();
	}
	
	public Expressao(String exp,String resposta) {
		this.exp = new Expression(exp);
		this.resposta = Double.valueOf(resposta);
	}

	public Expression getExp() {
		return exp;
	}
	
	public Double getResposta() {
		return resposta;
	}
	
	@Override
	public String toString() {
		return String.format(Locale.US,"%s %f", exp.getExpressionString(),resposta);
	}
}
