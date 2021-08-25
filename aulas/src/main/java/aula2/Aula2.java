package aula2;
import java.awt.Label;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Aula2 {
	public static void main(String[] args) {
		Object[] options = {"10", "20", "30", "40"};
		JFrame frame = new JFrame("Qual a Sua Idade?");
		int n = JOptionPane.showOptionDialog(
				frame, "Tem certeza?",
				"Confirmação",
				JOptionPane.YES_NO_CANCEL_OPTION,
				JOptionPane.QUESTION_MESSAGE,
				null,
				options,
				options[2]
		);
		frame.getContentPane().add(new Label(options[n].toString()));
		frame.setSize(600, 400);
		frame.setVisible(true);
	}
}

