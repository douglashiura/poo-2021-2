package Calculator;

import Calculator.Controller.CalculatorController;
import Calculator.Model.CalculatorModel;
import Calculator.View.CalculatorView;

public class MVCCalculator {
	public static void main(String[] args) {
		CalculatorView theView = new CalculatorView();
		CalculatorModel theModel = new CalculatorModel();
		CalculatorController theController = new CalculatorController(theView, theModel);
		theView.setVisible(true);
		theView.setSize(650, 80);
	}
}
