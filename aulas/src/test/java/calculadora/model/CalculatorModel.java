package calculadora.model;

public class CalculatorModel {
	private int valorDaSoma;

	// O modelo realiza as opera��es
	public void somaDosNumeros(int firstNumber, int secondNumber){
		valorDaSoma = firstNumber + secondNumber;
	}

	// O Modelo mantem o resultado da soma dos n�meros ingressados na vista
	public int getValorDaSoma() {
			return valorDaSoma;
	}
}