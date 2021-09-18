package calculator.modelo;

public class CalculatorModel {

	private int calculationValue;

	// O modelorealiza as operações
	public void addTwoNumbers(int firstNumber, int secondNumber) {
		calculationValue = firstNumber + secondNumber;
	}

	// O modelomantem o resultadodasomadosnúmerosingressadosna vista
	public int getCalculationValue() {
		return calculationValue;
	}
}
