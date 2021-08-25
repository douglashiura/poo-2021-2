package aula3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ModeloIdade {

	public static void main(String[] args) {
		Object[] options = { 10, 20, 30, 40};
		JFrame frame = new JFrame("Modal idade");
		JButton button = new JButton("Clique aqui, para abrir o modal");
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int n = JOptionPane.showOptionDialog(frame, "Qual sua idade?", "Pergunta",
						JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[2]);
				frame.setTitle(options[n].toString());

			}
		});
		frame.getContentPane().add(button);
		frame.setSize(600, 600);
		frame.setVisible(true);
	}

}
