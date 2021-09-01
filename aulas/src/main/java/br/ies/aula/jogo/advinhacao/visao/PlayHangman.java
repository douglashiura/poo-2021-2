package br.ies.aula.jogo.advinhacao.visao;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import br.ies.aula.jogo.advinhacao.controle.ControllerGUI;
import br.ies.aula.jogo.advinhacao.controle.ControllerTUI;

public class PlayHangman {

	public static void main(String[] args) {
		//Pega as palavras no arquivo
		Scanner input = new Scanner(System.in);
		System.out.println("Insira o nome do arquivo com a palavras: ");
		String filename = input.nextLine();
		
		
		System.out.println("Qual interface gostaria de usar?");
		System.out.println("0 - TUI");
		System.out.println("1 - GUI1 com escrita");
		System.out.println("2 - GUI2 com bot�es");
		
		ViewMode vmode = ViewMode.TUI; //default TUI
		try
		{
			int v = input.nextInt();
			if(v==ViewMode.GUI2.getValue())
			{
				vmode = ViewMode.GUI2;
				ControllerGUI myController = new ControllerGUI(filename);
				myController.go(vmode);
			}
			else if(v==ViewMode.GUI1.getValue())
			{
				vmode = ViewMode.GUI1;
				ControllerGUI myController = new ControllerGUI(filename);
				myController.go(vmode);
			}
			else
			{
				ControllerTUI myController = new ControllerTUI(filename);
				myController.go();
			}
			
		}
		catch(InputMismatchException ime)
		{ 
			System.out.println("Entrada Inv�lida.");
		}
		catch(IOException ioe)
		{
			System.out.println("O arquivo n�o existe.");
		}
		catch(Exception e)
		{
			System.out.println("Erro Desconhecido");
		}
		
		input.close();
	}
}
