package teste.aula03;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class TestJOptionPaneIdade {
	public static void main(String[] args) {
		JFrame frame = new JFrame("TESTE DE FRAME");
		JButton button = new JButton("Clique aqui!");
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String n = JOptionPane.showInputDialog("Digite a sua idade:");
				frame.setTitle(n);
			}
		});
		frame.getContentPane().add(button);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(600, 600);
		frame.setVisible(true);
	}
}
