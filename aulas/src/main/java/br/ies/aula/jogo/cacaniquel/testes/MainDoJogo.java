package br.ies.aula.jogo.cacaniquel.testes;


import br.ies.aula.jogo.cacaniquel.controle.Controlador;
import br.ies.aula.jogo.cacaniquel.modelo.Modelo;
import br.ies.aula.jogo.cacaniquel.visao.Visao;

public class MainDoJogo {

	public static void main(String[] args) throws Exception {
				
		Modelo modelo = new Modelo();
		Visao visao = new Visao();
		Controlador controlador = new Controlador(visao, modelo);
		
	}
	
	
}