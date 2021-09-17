package Calculator.Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Calculator.Model.CalculatorModel;
import Calculator.View.CalculatorView;

public class CalculatorController {
	private CalculatorView theView;
	private CalculatorModel theModel;
	
	public CalculatorController(CalculatorView theView, CalculatorModel theModel) 
	{
		this.theView = theView;
		this.theModel = theModel;
		// Aloca à vista um listener queserátratado no metodo actionPerformed no Controlador
		this.theView.addCalculateListener(new CalculateListener());
	}
	
	class CalculateListener implements ActionListener{
		public void actionPerformed(ActionEvent e) 
		{
			int firstNumber, secondNumber = 0;
			try
			{
				firstNumber = theView.getFirstNumber();
				secondNumber = theView.getSecondNumber();
				theModel.addTwoNumbers(firstNumber, secondNumber);
				// modifica o modelo
				theView.updateView(theModel.getCalculationValue());
				// atualiza as vistas
				}
			catch(NumberFormatException ex)
			{
				System.out.println(ex);
				theView.displayErrorMessage("You Need to Enter 2 Integers");
				}
			}
		}
	}
