package mvc.calculator.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import mvc.calculator.model.CalculatorModel;
import mvc.calculator.view.CalculatorView;

public class CalculatorController {
	private CalculatorView theView;
	private CalculatorModel theModel;

	public CalculatorController(CalculatorView theView, CalculatorModel theModel) {
		this.theView = theView;
		this.theModel = theModel;
		this.theView.addFocusListener(new CalculateListener());
	}

	public class CalculateListener implements ActionListener, FocusListener {
		public void actionPerformed(ActionEvent e) {
			int firstNumber, secondNumber = 0;
			try {
				firstNumber = theView.getFirstNumber();
				secondNumber = theView.getSecondNumber();
				theModel.addTwoNumbers(firstNumber, secondNumber);
				theView.updateView(theModel.getCalculationValue());
			} catch (

			NumberFormatException ex) {
				System.out.println(ex);
				theView.displayErrorMessage("You Need to Enter 2 Integers");
			}
		}

		@Override
		public void focusGained(FocusEvent arg0) {
			// TODO Auto-generated method stub

		}

		@Override
		public void focusLost(FocusEvent arg0) {

		}
	}
	
}
