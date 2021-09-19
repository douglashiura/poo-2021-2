package mvc.calculator.view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import mvc.calculator.controller.CalculatorController.CalculateListener;

public class CalculatorView extends JFrame {
	private JTextField txtFirstNumber = new JTextField(10);
	private JLabel lblAddition = new JLabel("+");
	private JTextField txtSecondNumber = new JTextField(10);
	private JButton calculateButton = new JButton("Calculate");
	private JLabel lblResult = new JLabel("Valor do Modelo");
	private JTextField txtCalcSolution = new JTextField(10);

	public CalculatorView() {
		JPanel calcPanel = new JPanel();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600, 200);
		calcPanel.add(txtFirstNumber);
		calcPanel.add(lblAddition);
		calcPanel.add(txtSecondNumber);
		calcPanel.add(calculateButton);
		calcPanel.add(lblResult);
		calcPanel.add(txtCalcSolution);
		this.add(calcPanel);
	}

	public int getFirstNumber() {
		return Integer.parseInt(txtFirstNumber.getText());
	}

	public int getSecondNumber() {
		return Integer.parseInt(txtSecondNumber.getText());
	}

	public int getCalcSolution() {
		return Integer.parseInt(txtCalcSolution.getText());
	}

	public void updateView(int solution) {
		txtCalcSolution.setText(Integer.toString(solution));
	}

	public void displayErrorMessage(String string) {

	}

}
