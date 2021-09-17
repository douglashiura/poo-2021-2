package mvc.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mvc.model.CalculatorModel;
import mvc.visao.CalculatorView;

public class CalculatorController {
	private CalculatorView theView;
	private CalculatorModel theModel;
	
	public CalculatorController(CalculatorView theView, CalculatorModel theModel) {
		this.theView = theView;
		this.theModel = theModel;
		this.theView.addCalculateListener(new CalculateListener());
	}
	
	class CalculateListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			int firstNumber, secondNumber = 0;
			try{
				firstNumber = theView.getFirstNumber();
				secondNumber = theView.getSecondNumber();
				theModel.addTwoNumbers(firstNumber, secondNumber);
			}
			
			catch(NumberFormatException ex){
				System.out.println(ex);
				theView.displayErrorMessage("You Need to Enter 2 Integers");
			}
		}
	}
}
		
	
	
	
	
