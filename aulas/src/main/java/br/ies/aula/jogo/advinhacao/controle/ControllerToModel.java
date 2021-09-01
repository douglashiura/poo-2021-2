package br.ies.aula.jogo.advinhacao.controle;


public interface ControllerToModel {
	
	public boolean previousGuess(char guess);

	public int getTotalBadGuesses();

	public boolean maxBadGuessReached();
	
	public String getRandomWord();

	public void foundGuessInWord(String word,char guess,int i);

	public boolean addBadGuess(char letterGuessed);

	public boolean wordGuessed();

	public String incorrectGuessesToString();

	public String correctLettersToString();
	
}
