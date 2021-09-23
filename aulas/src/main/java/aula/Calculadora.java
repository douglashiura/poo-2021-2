package aula;

calculadora de pacote ;

import  calculator.controller.CalculatorController ;
import  calculator.model.CalculatorModel ;
import  calculator.view.CalculatorView ;

public  class  MVCCalculator {
	public  static  void  main ( String [] args ) {
		CalculatorView theView =  novo  CalculatorView ();
		CalculatorModel theModel =  new  CalculatorModel ();
		CalculatorController theController = novo
CalculatorController (theView, theModel);
		theView . setVisible ( true );
		theView . setSize ( 650 , 80 );
	}
}