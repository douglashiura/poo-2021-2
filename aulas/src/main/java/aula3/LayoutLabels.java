package aula3;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class LayoutLabels {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Age");
		frame.setSize(600,600);
		
		JLabel labelOne = new JLabel("Label One");
		JLabel labelTwo = new JLabel("Label Two");
		JLabel labelThree = new JLabel("Label Three");
		JLabel labelFour = new JLabel("Label Four");
		JLabel labelFive = new JLabel("Label Five");
		JLabel labelSix = new JLabel("Label Sex");
		
		frame.getContentPane().setLayout(new GridLayout(2,3));		
		
		frame.getContentPane().add(labelOne);
		frame.getContentPane().add(labelTwo);
		frame.getContentPane().add(labelThree);
		frame.getContentPane().add(labelFour);
		frame.getContentPane().add(labelFive);
		frame.getContentPane().add(labelSix);
		
		frame.setVisible(true);
	}

}
