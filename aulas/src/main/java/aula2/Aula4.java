package aula2;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Aula4 {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JLabel label = new JLabel("Hello World");
		label.setBorder(BorderFactory.createLineBorder(Color.blue));
		frame.getContentPane().add(panel);
		frame.setSize(400,300);
		panel.add(label);
		frame.setVisible(true);
	}
}	