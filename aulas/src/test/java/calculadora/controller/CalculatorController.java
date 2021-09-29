package calculadora.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import calculadora.model.CalculatorModel;
import calculadora.view.CalculatorView;

public class CalculatorController {
	private CalculatorView theView;
	private CalculatorModel theModel;

	public CalculatorController(CalculatorView theView, CalculatorModel theModel) {
		this.theView = theView;
		this.theModel = theModel;
		
		// Aloca um listenner ao view, que será tratado no metodo actionPerformed no Controlador
		this.theView.addListennerBotao(new CalculateListener());
	}

	class CalculateListener implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			int firstNumber, secondNumber = 0;
			
			try{
				firstNumber = theView.getFirstNumber();
				secondNumber = theView.getSecondNumber();
				theModel.somaDosNumeros(firstNumber, secondNumber);// modifica o modelo
				theView.setLabelResultado(theModel.getValorDaSoma());// atualiza as vistas
			}
			catch(NumberFormatException ex){
				
				System.out.println(ex);
				theView.displayErrorMessage("You Need to Enter 2 Integers");
			}
		}
	}
}
		
	
	
	
	
