package calculadora.view;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalculatorView extends JFrame{

	private static final long serialVersionUID = 1L;
	private JTextField txtFirstNumber  = new JTextField(10);
	private JLabel lblAddition = new JLabel("+");
	private JTextField txtSecondNumber = new JTextField(10);
	private JButton botaoCalcular = new JButton("Calculate");
	private JLabel lblResult = new JLabel("Resultado:");
	private JTextField txtCalcSolution = new JTextField(10);
	
	public CalculatorView(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600, 200);
		
		JPanel calcPanel = new JPanel();
		calcPanel.add(txtFirstNumber);
		calcPanel.add(lblAddition);
		calcPanel.add(txtSecondNumber);
		calcPanel.add(botaoCalcular);
		calcPanel.add(lblResult);
		calcPanel.add(txtCalcSolution);
		this.add(calcPanel);
}


	// Se o botão é clicado, o controlador trata esse evento
	public void addListennerBotao(ActionListener l){
		botaoCalcular.addActionListener(l);
	}

	// Abre um popup que contem a mensagem de erro 
	public void displayErrorMessage(String errorMessage){
		JOptionPane.showMessageDialog(this, errorMessage);
	}
	
	public void setLabelResultado(int resultado){
		txtCalcSolution.setText(Integer.toString(resultado));
	}
	public int getFirstNumber(){
		return Integer.parseInt(txtFirstNumber.getText());
	}
	public int getSecondNumber(){  
		return Integer.parseInt(txtSecondNumber.getText());
	}
}


