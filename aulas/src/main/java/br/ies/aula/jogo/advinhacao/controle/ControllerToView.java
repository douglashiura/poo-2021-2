package br.ies.aula.jogo.advinhacao.controle;


public interface ControllerToView {

	public void endInterface();

	public void gotCorrectLetter();

	public void gotIncorrectLetter();

	public boolean playAgain(boolean won, String word);

	public void printIncorrectGuesses(String incorrectLetters);

	public void printCorrectLetters(String correctLetters);

	public void repeatedGuess();

	public void showMan(int numbadguesses);

	public void eraseGuess(String tobeerasedifapplicable);

	public void reset(String word);

	public char getNextGuess();
	

}
