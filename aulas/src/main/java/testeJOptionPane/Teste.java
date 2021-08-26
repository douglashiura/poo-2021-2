package testeJOptionPane;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Teste {
	public static void main (String arg[]) {
		JFrame frame = new JFrame("Frame");
		
		BoxLayout boxLayout = new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS);
		frame.setLayout(boxLayout);
		
		JLabel label1 = new JLabel("Label 1", JLabel.CENTER);
		JLabel label2 = new JLabel("Label 2", JLabel.CENTER);
		JLabel label3 = new JLabel("Label 3", JLabel.CENTER);
		JLabel label4 = new JLabel("Label 4", JLabel.CENTER);
		JLabel label5 = new JLabel("Label 5", JLabel.CENTER);
		
		label1.setAlignmentX(JLabel.CENTER_ALIGNMENT);
		label2.setAlignmentX(JLabel.CENTER_ALIGNMENT);
		label3.setAlignmentX(JLabel.CENTER_ALIGNMENT);
		label4.setAlignmentX(JLabel.CENTER_ALIGNMENT);
		label5.setAlignmentX(JLabel.CENTER_ALIGNMENT);
		
		frame.add(label1);
		frame.add(label2);
		frame.add(label3);
		frame.add(label4);
		frame.add(label5);
				
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.pack();
	}
}
