package calculator;

import calculator.controller.CalculatorController;
import calculator.model.CalculatorModel;
import calculator.view.CalculatorView;

public class MVCCalculator {
	public static void main(String[] args) {
		CalculatorView theView = new CalculatorView();
		CalculatorModel theModel = new CalculatorModel();
		CalculatorController theController=new
CalculatorController(theView,theModel);
		theView.setVisible(true);
		theView.setSize(650,80);
	}
}
