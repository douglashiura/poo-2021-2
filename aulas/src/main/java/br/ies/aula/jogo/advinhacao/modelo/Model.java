package br.ies.aula.jogo.advinhacao.modelo;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import br.ies.aula.jogo.advinhacao.controle.ControllerToModel;

public class Model implements ControllerToModel {
	private static ArrayList<String> SECRET_WORDS;
	private static final int MAX_BAD_GUESSES = 7;
	private int totalBadGuesses;

	private char correctLetters[];

	private char incorrectLetters[];

	private static int gameswon;
	private static int gamesplayed;

	public Model(String secretWordFile) throws IOException {
		totalBadGuesses = 0;
		gameswon = 0;
		gamesplayed = 0;
		SECRET_WORDS = new ArrayList<String>();

		Scanner fileReader = null;
		try {
			InputStream abc = Model.class.getResourceAsStream("palavras.txt");
			fileReader = new Scanner(abc);
			while (fileReader.hasNextLine()) {
				String line = fileReader.nextLine();
				SECRET_WORDS.add(line);
			}
		} catch (Exception e) {
			System.out.println("Encontrado um erro e entrada/saída.");
			throw e;
		} finally {
			if (fileReader != null)
				fileReader.close();
		}
	}

	public int getGamesWon() {
		return gameswon;
	}

	public int getGamesPlayed() {
		return gamesplayed;
	}

	public boolean previousGuess(char guess) {
		for (char letter : correctLetters) {
			if (letter == guess) {
				return true;
			}
		}
		for (char letter2 : incorrectLetters) {
			if (letter2 == guess) {
				return true;
			}
		}
		return false;
	}

	public int getTotalBadGuesses() {
		return totalBadGuesses;
	}

	public boolean maxBadGuessReached() {
		if (totalBadGuesses == MAX_BAD_GUESSES)
			return true;
		else
			return false;
	}

	public String getRandomWord() {
		Random randgen = new Random();
		String word = SECRET_WORDS.get(randgen.nextInt(SECRET_WORDS.size()));
		setCorrectLetters(word);
		setIncorrectLetters(word);
		totalBadGuesses = 0;
		gamesplayed++;
		return word;
	}

	private void setCorrectLetters(String word) {
		correctLetters = new char[word.length()];
		for (int i = 0; i < correctLetters.length; i++) {
			correctLetters[i] = '_';
		}
	}

	private void setIncorrectLetters(String word) {
		incorrectLetters = new char[MAX_BAD_GUESSES];
		for (int i = 0; i < incorrectLetters.length; i++) {
			incorrectLetters[i] = ' ';
		}

	}

	public void foundGuessInWord(String word, char guess, int i) {
		if (0 <= i && i < word.length() && word.charAt(i) == guess)
			correctLetters[i] = guess;
	}

	public boolean addBadGuess(char letterGuessed) {
		if (incorrectLetters[totalBadGuesses] == ' ') {
			incorrectLetters[totalBadGuesses] = letterGuessed;
			totalBadGuesses++;
		}

		if (incorrectLetters[incorrectLetters.length - 1] == ' ' && totalBadGuesses < MAX_BAD_GUESSES)
			return false;
		else
			return true;
	}

	public boolean wordGuessed() {
		boolean found = true;
		for (int i = 0; i < correctLetters.length; i++) {
			if (correctLetters[i] == '_')
				found = false;
		}
		if (found) {
			gameswon++;
		}
		return found;

	}

	public String incorrectGuessesToString() {
		String incorrectGuesses = "";
		for (int i = 0; i < incorrectLetters.length; i++) {
			incorrectGuesses += incorrectLetters[i] + " ";
		}
		return incorrectGuesses;
	}

	public String correctLettersToString() {
		String corrects = "";

		for (int i = 0; i < correctLetters.length; i++) {
			corrects += correctLetters[i] + " ";
		}
		return corrects;

	}

}
