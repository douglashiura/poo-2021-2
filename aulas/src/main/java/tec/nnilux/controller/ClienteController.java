package tec.nnilux.controller;

import tec.nnilux.model.Cliente;

public class ClienteController {

	public void cadastrarCliente(String nome, String cpf, String email, String endereco) throws Exception {

		if (nome != null && nome.length() > 0 && validarCPF(cpf) && email != null && email.length() > 0
				&& endereco != null && endereco.length() > 0) {

			Cliente cliente = new Cliente(nome, cpf, email, endereco);
			cliente.cadastrarCliente(cliente);
		} else {
			throw new Exception("Preencha os dados corretamente");
		}
		

	}

	public boolean validarCPF(String cpf) {
		for (int i1 = 0; i1 < cpf.length(); i1++) {
			if (!Character.isDigit(cpf.charAt(i1))) {
				if ((!(i1 == 3) || i1 == 7 || i1 == 11))
					return false;
			}

		}
		return true;
	}

}
