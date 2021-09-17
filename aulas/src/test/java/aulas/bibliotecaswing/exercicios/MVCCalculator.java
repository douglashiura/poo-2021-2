package aulas.bibliotecaswing.exercicios;

import java.sql.SQLException;

import mvc.controller.CalculatorController;
import mvc.model.CalculatorModel;
import mvc.visao.CalculatorView;

public class MVCCalculator {
	
	
		public static void main(String[] args) {
			CalculatorView theView = new CalculatorView();
			CalculatorModel theModel = new CalculatorModel();
			CalculatorController theController = new CalculatorController(theView,theModel);
			theView.setVisible(true);  
			theView.setSize(650,80);}

}
