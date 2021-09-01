package br.ies.aula.jogo.advinhacao.visao;

import java.util.Scanner;

import br.ies.aula.jogo.advinhacao.controle.ControllerToView;

public class ViewTUI implements ControllerToView{

	private Scanner keyboard;
	
	
	public ViewTUI(){
		keyboard = new Scanner(System.in);
	}

	public void welcome(){
		System.out.println("Bem vindo ao jogo do advinha\n");
	}

	public void endInterface(){
		System.out.println("Adeus");
		keyboard.close();
	}

	public void gotCorrectLetter(){
		System.out.println("Bom palpite");
	}

	public void gotIncorrectLetter(){
		System.out.println("Palpite incorreto");
		
	}

	public char getNextGuess(){
		System.out.println("Advinhe uma letra:");
		String input = keyboard.next().toLowerCase();
		return input.charAt(0);
	}

	public boolean playAgain(boolean won, String word){
		if(won)
			System.out.println("Você venceu!");
		else{
			System.out.println("Muitos palpites incorretos, você perdeu!");
			System.out.println("A palavra correta era "+ word);
		}
		
		while(true){
			System.out.println("Gostaria de jogar novamente? S or N");
			char answer =  keyboard.next().charAt(0);
			if(answer == 'S' || answer =='s')
				return true;
			else if(answer == 'N' || answer == 'n')
				return false;
		}
		
	}
	

	public void printIncorrectGuesses(String incorrectGuesses) {
		System.out.printf("Palpites incorretos: %s\n",incorrectGuesses);
	}
	

	public void printCorrectLetters(String correctLetters){
		//System.out.println("*****************************");
		System.out.println("Sua palavra é ...");
		System.out.println(correctLetters);
	}

	public void repeatedGuess(){
		System.out.println("Você já advinhou essa!");
	}
	

	public void showMan(int badGuessesCount) {
		int poleLines = 6; 
		System.out.println("  ____");
		System.out.println("  |  |");
	
		if (badGuessesCount == 7) {
			System.out.println("  |  |");
			System.out.println("  |  |");
		}
	
		if (badGuessesCount > 0) {
			System.out.println("  |  O");
			poleLines = 5;
		}
	
		if (badGuessesCount > 1) {
			poleLines = 4;
			if (badGuessesCount == 2) {
				System.out.println("  |  |");
			} else if (badGuessesCount == 3) {
				System.out.println("  | \\|");
			} else if (badGuessesCount >= 4) {
				System.out.println("  | \\|/");
			}
		}
	
		if (badGuessesCount > 4) {
			poleLines = 3;
			System.out.println("  |  |");
		}
	
		if (badGuessesCount == 6) {
			poleLines = 2;
			System.out.println("  | /");
		} else if (badGuessesCount >= 7) {
			poleLines = 0;
			System.out.println("  | / \\");
		}
	
		for (int k = 0; k < poleLines; k++) {
			System.out.println("  |");
		}
		System.out.println("__|__");
		System.out.println("*****************************");
			
	}


	public void eraseGuess(String tobeerasedifapplicable) {

		
	}


	public void reset(String word) {
	
		
	}
	
}
