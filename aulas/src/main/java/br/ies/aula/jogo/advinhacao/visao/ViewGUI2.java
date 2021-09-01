package br.ies.aula.jogo.advinhacao.visao;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.*;

import br.ies.aula.jogo.advinhacao.controle.ControllerGUI;
import br.ies.aula.jogo.advinhacao.controle.ControllerToView;

public class ViewGUI2 implements ControllerToView{

	private final int fontSize = 23;
	private JFrame mainFrame; 
	private JPanel righthandside;
	private JPanel lefthandside;
	private JFrame secondaryFrame;
	
	private final JLabel wordToGuessMessage = new JLabel("Advinhe a palavra:",JLabel.LEFT);
	private final JLabel entercharhere = new JLabel("Escolha uma letra:",JLabel.LEFT);

	private JLabel message;
	private ArrayList<JButton> alphabetButtons = new ArrayList<JButton>();
	private JLabel incorrectLetters;
	private JLabel wordToGuess;
	private HangmanPanel hangman;
	
	private ControllerGUI myController;
	private String wordUserWillGuess;
	private final String alphabet = "qwertyuiopasdfghjklzxcvbnm";

	
	public ViewGUI2(ControllerGUI myController,String wordToGuess){
		this.myController = myController;
		wordUserWillGuess = wordToGuess;
		
		prepareGUI();
	}
	

	private void prepareGUI(){
		mainFrame = new JFrame("Bem vindo ao jogo do advinha");
	    mainFrame.setSize(1000,475);
	    mainFrame.setLayout(new GridLayout(1, 2));
	    mainFrame.setLocationRelativeTo(null);

	    createRightSide();
	    createLeftSide();
	    
	    mainFrame.addWindowListener(new WindowAdapter() {
		       public void windowClosing(WindowEvent windowEvent){
		          System.exit(0);
		       }        
		});
	    
	    mainFrame.add(lefthandside);
	    mainFrame.add(righthandside);
	    
	
	    mainFrame.setVisible(true);  
	}
	

	public void createLeftSide(){
		lefthandside = new JPanel();
	    lefthandside.setLayout(new BoxLayout(lefthandside,BoxLayout.Y_AXIS));

		hangman = new HangmanPanel(75, mainFrame.getHeight()-175);
	    incorrectLetters = createLabel("");       
	    
	    lefthandside.add((JPanel)hangman);
	    lefthandside.add(incorrectLetters);
	}
	

	public void createRightSide(){
	    righthandside = new JPanel();
	    righthandside.setLayout(new GridLayout(3,1));

	    JPanel wordStuff = createWordStuff();
	    JPanel charspanel = createAlphaButtons();
	    JPanel bottom = createBottomRight();
	    
	    righthandside.add(wordStuff);
	    righthandside.add(charspanel);
	    righthandside.add(bottom);
	}
	

	private JPanel createBottomRight()
	{
		JPanel bottom = new JPanel();
	    bottom.setLayout(new BoxLayout(bottom,BoxLayout.Y_AXIS));
	    
	    JLabel emptyline = createLabel("\n");
	    bottom.add(emptyline);
	    
	    message = createLabel("Bem vindo ao jogo do advinha");
	    message.setAlignmentX(Component.CENTER_ALIGNMENT);
	    bottom.add(message);
	    
	    JButton giveupbutton = createButton("Desiste");
	    giveupbutton.setSize(100, 100);
	    giveupbutton.setAlignmentX(Component.CENTER_ALIGNMENT);
	    bottom.add(giveupbutton);
	    
	    return bottom;
	}
	

	private JPanel createWordStuff(){
		JPanel wordStuff = new JPanel();
		wordStuff.setLayout(new GridLayout(3,1));
		entercharhere.setFont(new Font("Arial",Font.BOLD,fontSize));
		wordToGuessMessage.setFont(new Font("Arial",Font.BOLD,fontSize));
		wordToGuess = createLabel(wordUserWillGuess);
		
		wordStuff.add(wordToGuessMessage);
		wordStuff.add(wordToGuess);
		wordStuff.add(entercharhere);
		
		return wordStuff;
	}
	

	private JPanel createAlphaButtons(){
		JPanel alphabetrow1 = new JPanel();
		JPanel alphabetrow2 = new JPanel();
		JPanel alphabetrow3 = new JPanel();

		
		int j = 0;
		for(String letter: alphabet.split("")){
			JButton button = createButton(letter);
			alphabetButtons.add(button);
			if(j<10)
				alphabetrow1.add(button);
			else if(j<19)
				alphabetrow2.add(button);
			else
				alphabetrow3.add(button);
			j++;

		}
	    
	    JPanel temp = new JPanel();
	    temp.setLayout(new GridLayout(3,1));

	    temp.add(alphabetrow1);
	    temp.add(alphabetrow2);
	    temp.add(alphabetrow3);
		return temp;
	}
	

	private JLabel createLabel(String msg){
		JLabel label = new JLabel(msg,JLabel.CENTER);
	    label.setFont(new Font("Arial",Font.BOLD,fontSize));
	    return label;
	}
	

	private JButton createButton(String msg){
		JButton thisbutton = new JButton(msg);
	    thisbutton.setActionCommand(msg);
	    thisbutton.setFont(new Font("Arial",Font.BOLD,fontSize-5));
	    thisbutton.setEnabled(true);
	    thisbutton.addActionListener(new ViewButtonClickListener(myController,this)); 
	    return thisbutton;
	}
	

	public void eraseGuess(String guess){
		int index = alphabet.indexOf(guess);
		System.out.println(guess);
		if(index!=-1)
			alphabetButtons.get(index).setEnabled(false);
	}
	

	public void reset(String word){
		if(secondaryFrame!=null)
			secondaryFrame.dispose();
		hangman.reset();
		wordUserWillGuess = word;
	    mainFrame.dispose();
	    prepareGUI();
	}


	public void endInterface() {
		if(secondaryFrame!=null)
			secondaryFrame.dispose();
		mainFrame.dispose();
	}


	public void gotCorrectLetter() {
		message.setText("Palpite Certo!!");
	}

	public void gotIncorrectLetter() {
		message.setText("Palpite Errado!!");
		hangman.badGuess();
	}

	//do nothing
	public char getNextGuess() {

		return ' ';
	}


	public boolean playAgain(boolean won, String word) {
		secondaryFrame = new JFrame("Gostaria de jogar denovo?");
	    secondaryFrame.setSize(500,500);
	    secondaryFrame.setLayout(new GridLayout(4,1)); 
	    secondaryFrame.setLocationRelativeTo(null);

	    secondaryFrame.addWindowListener(new WindowAdapter() {
		       public void windowClosing(WindowEvent windowEvent){
		          System.exit(0);
		       }        
		});
	    
	    JLabel numgames = createLabel("Você venceu "+myController.getGamesWon()+"/"+myController.getGamesPlayed()+" jogos até agora.");
	    JLabel thismessage;
	    
	    if(won){
	    	thismessage = createLabel("Parabéns! Você venceu!");
		}
	    else{
	    	thismessage = createLabel("Lamento, você perdeu. A palavra era "+word+".");
	    }
	    secondaryFrame.add(thismessage);
	    secondaryFrame.add(numgames);
	    
	    JButton playagainbutton = createButton("Jogar novamente");
	    secondaryFrame.add(playagainbutton);
	    secondaryFrame.add(createButton("Sair"));
	    secondaryFrame.getRootPane().setDefaultButton(playagainbutton);

	    secondaryFrame.setVisible(true);

	    return true;
	}

	public void printIncorrectGuesses(String incorrectLetters) {
		this.incorrectLetters.setText(incorrectLetters);
	}

	public void printCorrectLetters(String correctLetters) {
		wordToGuess.setText(correctLetters);
	}


	public void repeatedGuess() {
		message.setText("Você já tentou essa. Tente novamente.");
	}



	public void showMan(int numbadguesses) {

		
	}

}
