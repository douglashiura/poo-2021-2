package br.ies.sim.caixa.eletronico.controle;

import java.util.List;
import br.ies.sim.caixa.eletronico.modelo.Conta;
import br.ies.sim.caixa.eletronico.modelo.ContaDAO;

public class ControleUsuario {
	public static Conta logarUsuario(String nmr, String sen) {
		int nmrConta = 0;
		int senha = 0;
		if (nmr.isEmpty() || sen.isEmpty() || nmr == null || sen == null) {
			return null;
		}
		if (verificaNumeros(nmr) && verificaNumeros(sen)) {
			nmrConta = Integer.parseInt(nmr);
			senha = Integer.parseInt(sen);
		} else {
			return null;
		}
		if (ContaDAO.logarConta(nmrConta, senha)) {
			return ContaDAO.getInfoConta(nmrConta);
		}
		return null;
	}

	public static Conta criarConta(String nome, String senha) {
		try {
			if (nome.isEmpty() || senha.isEmpty() || nome == null || senha == null) {
				return null;
			}
			int senhaUser = 0;
			if (verificaNumeros(senha)) {
				senhaUser = Integer.parseInt(senha);
				Conta conta = new Conta(nome, criarNumConta(), senhaUser);
				if (verificaDados(conta)) {
					ContaDAO.criarConta(conta);
					return conta;
				}
			}
			return null;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public static Conta getInfoConta(int nmrConta) {
		if (nmrConta > 99999) {
			return ContaDAO.getInfoConta(nmrConta);

		}
		return null;
	}

	public static boolean verificaDados(Conta conta) {
		if (conta.getNumeroConta() > 99999 && conta.getSenhaConta() > 99999) {
			if (!conta.getNomeCliente().isEmpty() && conta.getNomeCliente() != null) {
				return true;
			}
		}
		return false;
	}

	public static int criarNumConta() {
		int min = 100000;
		int max = 999999;
		int numGerado = (int) (Math.random() * (max - min + 1) + min);
		List<Integer> numeros = (List<Integer>) ContaDAO.getNmrConta();
		if (numeros != null) {
			for (int nmConta : ContaDAO.getNmrConta()) {
				if (nmConta == numGerado) {
					criarNumConta();
				}
			}
		}
		return numGerado;
	}

	public static double sacarConta(Conta conta, double valor) {
		if (conta.getSaldoConta() >= valor) {
			double novoValor = conta.getSaldoConta() - valor;
			conta.setSaldoConta(novoValor);
			if (ContaDAO.atualizarValor(conta, novoValor)) {
				return novoValor;
			}
		}
		return -1;
	}

	public static double depositar(Conta conta, double valor) {
		double novoValor = conta.getSaldoConta() + valor;
		if (ContaDAO.atualizarValor(conta, novoValor)) {
			conta.setSaldoConta(novoValor);
			return novoValor;
		}
		return -1;
	}

	public static boolean verificaNumeros(String input) {
		for (int ctr = 0; ctr < input.length(); ctr++) {
			if ("1234567890".contains(Character.valueOf(input.charAt(ctr)).toString())) {
				continue;
			} else {
				return false;
			}
		}
		return true;
	}
}