package calculator.modelo;

public class CalculatorModel {

	private int calculationValue;

	// O modelorealiza as opera��es
	public void addTwoNumbers(int firstNumber, int secondNumber) {
		calculationValue = firstNumber + secondNumber;
	}

	// O modelomantem o resultadodasomadosn�merosingressadosna vista
	public int getCalculationValue() {
		return calculationValue;
	}
}
