package testeJOptionPane;

import java.awt.Label;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Dialog {
	public static void main (String arg[]) {
		Object[] options = { "10", "20", "30", "40" };
		JFrame frame = new JFrame("Frame");
		frame.setVisible(Boolean.TRUE);
		int n = JOptionPane.showOptionDialog(frame, "Qual a sua idade?", "Idade", JOptionPane.YES_NO_CANCEL_OPTION,
		JOptionPane.QUESTION_MESSAGE, null, options, options[2]);
		frame.getContentPane().add(new Label(options[n].toString()));
		frame.setSize(300, 100);
	}
}
