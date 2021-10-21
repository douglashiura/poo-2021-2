package br.ies.poo.deiwid.petry.jogo.par.impar.main.jogo.par.impar;

import java.util.Arrays;

import br.ies.poo.deiwid.petry.jogo.par.impar.main.jogo.par.impar.controle.ControleDoJogoParEImpar;
import br.ies.poo.deiwid.petry.jogo.par.impar.main.jogo.par.impar.modelo.ModeloDoJogoDeParEImpar;
import br.ies.poo.deiwid.petry.jogo.par.impar.main.jogo.par.impar.visao.TelaDoJogoParEImpar;

public class PrincipalDoJogoDoParEImpar {

	public static void main(String[] args) {
		TelaDoJogoParEImpar visaoDoJogadoDouglas = new TelaDoJogoParEImpar();
		TelaDoJogoParEImpar visaoDoJogadoLucas = new TelaDoJogoParEImpar();
		ModeloDoJogoDeParEImpar modelo = new ModeloDoJogoDeParEImpar();
		new ControleDoJogoParEImpar(modelo, Arrays.asList(visaoDoJogadoDouglas, visaoDoJogadoLucas));
		visaoDoJogadoDouglas.setVisible(true);
		visaoDoJogadoLucas.setVisible(true);
	}

}
