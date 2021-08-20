package aula2;

import java.awt.Component;

import javax.swing.JOptionPane;

public class Main {
	Object[] options = {"Sim!", "Não", "Quem sabe?"};
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
