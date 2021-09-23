package com.github.pedrolucascorrea.poo.test.calculatorMVC;

import com.github.pedrolucascorrea.poo.test.calculatorMVC.controller.CalculatorController;
import com.github.pedrolucascorrea.poo.test.calculatorMVC.model.CalculatorModel;
import com.github.pedrolucascorrea.poo.test.calculatorMVC.view.CalculatorView;

public class MVCCalculator {
	public static void main(String[] args) {
		CalculatorView theView = new CalculatorView();
		CalculatorModel theModel = new CalculatorModel();
		CalculatorController theController = new CalculatorController(theView, theModel);
		theView.setVisible(true);
		theView.setSize(650, 80);
	}
}