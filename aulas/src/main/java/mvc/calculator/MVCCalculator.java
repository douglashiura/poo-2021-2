package mvc.calculator;

import mvc.calculator.controller.CalculatorController;
import mvc.calculator.model.CalculatorModel;
import mvc.calculator.view.CalculatorView;

public class MVCCalculator {
	public static void main(String[] args) {
		CalculatorView theView = new CalculatorView();
		CalculatorModel theModel = new CalculatorModel();
		CalculatorController theController = new CalculatorController(theView, theModel);
		theView.setVisible(true);
		theView.setSize(650, 80);
	}
}
