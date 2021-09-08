package br.ies.aula.jogo.advinhacao.visao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import br.ies.aula.jogo.advinhacao.controle.ControllerGUI;
import br.ies.aula.jogo.advinhacao.controle.ControllerToView;

public class ViewButtonClickListener implements ActionListener{

	private ControllerGUI myController;
	private ControllerToView myView;
	
	public ViewButtonClickListener(ControllerGUI myController,ControllerToView myView){
		this.myController = myController;
		this.myView = myView;
	}
	

	public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();  
        
        if( command.equals( "Entrar" )){
        	char guess = myView.getNextGuess();
        	myView.eraseGuess(String.valueOf(guess));
        	if(guess!=' '){
        		myController.guessGiven(guess);
        	}
        }else if(command.equals("Desistir")){
        	myView.playAgain(false, myController.getWord());
        }else if(command.equals("Sair")){
        	myView.endInterface();
        }else if(command.equals("Jogar Novamente")){ 
        	myController.playAgain();
        }else{
        	JButton buttonPushed = (JButton)e.getSource();
            buttonPushed.setEnabled( false );
        	myController.guessGiven(command.charAt(0));
        }
	}

}
