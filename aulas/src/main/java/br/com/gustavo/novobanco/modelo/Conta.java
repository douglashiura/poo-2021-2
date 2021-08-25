package br.com.gustavo.novobanco.modelo;

public class Conta {
	
	private Cliente titular;
	private Double saldo;
	private String agencia;
	private String numero;

	public Conta(String agencia, String numero) {
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = 0.0;
	}
	
	public Cliente getTitular() {
		return this.titular;
	}
	
	public Double getSaldo() {
		return this.saldo;
	}

	public String getNumero() {
		return this.numero;
	}
	
	public String getAgencia() {
		return this.agencia;
	}
	
	public void depositar(Double valor) {
		this.saldo = this.saldo + valor;
	}

	public void sacar(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
		}
	}
	
	public boolean transferir(Double valor, Conta destino) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			destino.depositar(valor);
			return true;
		}
		return false;
	}
	
}
