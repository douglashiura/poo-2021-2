package calculator.model;

public class CalculatorModel {
	
	private int calculationValue;
	
	// O modelo realiza as operações
	public void addTwoNumbers(int firstNumber, int secondNumber)
{
		calculationValue = firstNumber + secondNumber;
	}
	
	// O Modelo mantem o resultado da soma dos números ingressados na vista
		public int getCalculationValue() {
			return calculationValue;
		}
}
