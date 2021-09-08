package br.ies.aula.jogo.advinhacao.controle;

import java.io.IOException;

import br.ies.aula.jogo.advinhacao.modelo.Model;
import br.ies.aula.jogo.advinhacao.visao.ViewGUI1;
import br.ies.aula.jogo.advinhacao.visao.ViewGUI2;
import br.ies.aula.jogo.advinhacao.visao.ViewMode;

public class ControllerGUI implements ViewToController {
	
	private Model myModel;
	private ControllerToView myView;
	private String word;
	
	public ControllerGUI(String filename) throws IOException
	{
		myModel = new Model(filename);
			
	}	
	
	
	public void go(ViewMode viewMode){
		word = myModel.getRandomWord();
		
		switch(viewMode)
		{
		case GUI2:
			myView = (ControllerToView) new ViewGUI2(this,myModel.correctLettersToString());
			break;
		case GUI1:
			myView = (ControllerToView) new ViewGUI1(this, myModel.correctLettersToString());
			break;
		default:
			return; 
			
		}
	}
	
	
	private boolean fillInGuess(String word, char guess) {
		boolean found = false;
		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) == guess) {
				found = true;
				myModel.foundGuessInWord(word,guess,i);
			}
		}
		if (!found) {
			myModel.addBadGuess(guess);
		}
	
		return found;
	}
	
	public int getGamesWon(){
		return myModel.getGamesWon();
	}
	
	public int getGamesPlayed(){
		return myModel.getGamesPlayed();
	}

	
	public void guessGiven(char guess){
		if (!myModel.maxBadGuessReached() && !myModel.wordGuessed()){
			boolean previous = myModel.previousGuess(guess);
			
			if(previous){
				myView.repeatedGuess();
			}else{
				boolean correct = fillInGuess(word, guess);
				if (correct){
					myView.gotCorrectLetter();
					myView.printCorrectLetters(myModel.correctLettersToString());
				}else {
					myView.gotIncorrectLetter();
					myView.printIncorrectGuesses(myModel.incorrectGuessesToString());
				}
			}
		}
		boolean won = myModel.wordGuessed();

		if (won) {
			myView.playAgain(true,word);
		}
		else if(myModel.maxBadGuessReached()){
			myView.playAgain(false, word);
		}
		
	}
	
	public String getWord(){
		return word;
	}
	
	
	public void playAgain(){
		word = myModel.getRandomWord();
		myView.reset(myModel.correctLettersToString());
	}
	
	

}