package br.com.exercicios.mvc.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import br.com.exercicios.mvc.model.CalculatorModel;
import br.com.exercicios.mvc.view.CalculatorView;


public class CalculatorController {
	private CalculatorView theView;
	private CalculatorModel theModel;
	
	public CalculatorController(CalculatorView theView, CalculatorModel theModel) {
		this.theView = theView;
		this.theModel = theModel;
		this.theView.addCalculateListener(new CalculateListener());
	}
	
	class CalculateListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			int firstNumber, secondNumber = 0;
			try{
				firstNumber = theView.getFirstNumber();
				secondNumber = theView.getSecondNumber();
				theModel.addTwoNumbers(firstNumber, secondNumber); 
				theView.updateView(theModel.getCalculationValue());
			}
			catch(NumberFormatException ex){
				System.out.println(ex);
				theView.displayErrorMessage("You Need to Enter 2 Integers");
			}
		}
	}
}
