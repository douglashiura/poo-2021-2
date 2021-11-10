package aulas.bibliotecaswing.exercicios;

import java.util.ArrayList;
import java.util.List;

public class ListaEncadeada {
	
	
	public static void main(String[] args) {
		
		Integer vetorNumerosAleatorios[] = {0,2,2};
		Integer vetorNumerosAleatorios2[] = {1,1,0};
		
		List<Integer[]> lista = new ArrayList<Integer[]>();
		
		lista.add(vetorNumerosAleatorios);
		lista.add(vetorNumerosAleatorios2);
		
		for(Integer[] vetor: lista) {
			for (Integer elemento: vetor) {
				System.out.println(elemento);
			}
		}
		
		
		
		
	}

}
