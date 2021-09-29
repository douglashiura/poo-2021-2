package calculadora.model;

public class CalculatorModel {
	private int valorDaSoma;

	// O modelo realiza as operações
	public void somaDosNumeros(int firstNumber, int secondNumber){
		valorDaSoma = firstNumber + secondNumber;
	}

	// O Modelo mantem o resultado da soma dos números ingressados na vista
	public int getValorDaSoma() {
			return valorDaSoma;
	}
}