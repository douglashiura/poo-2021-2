package teste.aula04;

import java.awt.Container;

import javax.swing.*;

public class TestSpringLayout {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Spring Layout");
		SpringLayout layout = new SpringLayout();
		Container contentPane = frame.getContentPane();
		JLabel label = new JLabel("Digite seu nome: ");
        JTextField textField = new JTextField("", 15);
        
        contentPane.setLayout(layout);
        contentPane.add(label);
        contentPane.add(textField);
        
        layout.putConstraint(SpringLayout.WEST, label, 5, SpringLayout.WEST, contentPane);
        layout.putConstraint(SpringLayout.NORTH, label, 5, SpringLayout.NORTH, contentPane);
        
        layout.putConstraint(SpringLayout.WEST, textField, 5, SpringLayout.EAST, label);
        layout.putConstraint(SpringLayout.NORTH, textField, 5, SpringLayout.NORTH, contentPane);
		
        layout.putConstraint(SpringLayout.EAST, contentPane, 5, SpringLayout.EAST, textField);
        layout.putConstraint(SpringLayout.SOUTH, contentPane, 5, SpringLayout.SOUTH, textField);
        
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
}
