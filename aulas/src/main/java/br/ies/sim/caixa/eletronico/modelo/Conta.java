package br.ies.sim.caixa.eletronico.modelo;

public class Conta {
	private int idConta;
	private String nomeCliente;
	private int numeroConta;
	private int senhaConta;
	private double saldoConta;

	public Conta() {

	}

	public Conta(String nomeCliente, int numeroConta, int senhaConta) {
		this.nomeCliente = nomeCliente;
		this.numeroConta = numeroConta;
		this.senhaConta = senhaConta;
		this.saldoConta = 0;
	}

	public int getIdConta() {
		return idConta;
	}

	public void setIdConta(int idConta) {
		this.idConta = idConta;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public int getSenhaConta() {
		return senhaConta;
	}

	public void setSenhaConta(int senhaConta) {
		this.senhaConta = senhaConta;
	}

	public double getSaldoConta() {
		return saldoConta;
	}

	public void setSaldoConta(double saldoConta) {
		this.saldoConta = saldoConta;
	}
}