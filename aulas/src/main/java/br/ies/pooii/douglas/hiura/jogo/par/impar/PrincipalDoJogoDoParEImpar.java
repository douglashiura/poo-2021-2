package br.ies.pooii.douglas.hiura.jogo.par.impar;

import java.util.Arrays;

import br.ies.pooii.douglas.hiura.jogo.par.impar.controle.ControleDoJogoParEImpar;
import br.ies.pooii.douglas.hiura.jogo.par.impar.modelo.ModeloDoJogoParEImpar;
import br.ies.pooii.douglas.hiura.jogo.par.impar.visao.TelaDoJogoParEImpar;

public class PrincipalDoJogoDoParEImpar {

	public static void main(String[] args) {
		TelaDoJogoParEImpar visaoDoJogadoDouglas = new TelaDoJogoParEImpar();
		TelaDoJogoParEImpar visaoDoJogadoLucas = new TelaDoJogoParEImpar();
		ModeloDoJogoParEImpar modelo = new ModeloDoJogoParEImpar();
		new ControleDoJogoParEImpar(modelo, Arrays.asList(visaoDoJogadoDouglas, visaoDoJogadoLucas));
		visaoDoJogadoDouglas.setVisible(true);
		visaoDoJogadoLucas.setVisible(true);
	}

}
