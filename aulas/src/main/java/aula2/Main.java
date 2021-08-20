package aula2;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Main {
	Object[] options = {"Sim!", "Não", "Quem sabe?"};
	JFrame frame = new JFrame("Hello Word");
	int n = JOptionPane.showOptionDialog(
			frame, "Tem certeza?",
			"Confirmação",
			JOptionPane.YES_NO_CANCEL_OPTION,
			JOptionPane.QUESTION_MESSAGE,
			null,
			options,
			options[2]
	);
}
