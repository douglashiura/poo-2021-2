package calculator;

import calculator.controle.CalculatorController;
import calculator.modelo.CalculatorModel;
import calculator.visao.CalculatorView;

public class MVCCalculator {
	public static void main(String[] args) {
		CalculatorView theView = new CalculatorView();
		CalculatorModel theModel = new CalculatorModel();
		CalculatorController theController = new CalculatorController(theView, theModel);
		theView.setVisible(true);
		theView.setSize(650, 80);
	}
}
