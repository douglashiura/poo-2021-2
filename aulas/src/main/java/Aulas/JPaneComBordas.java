package Aulas;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JPaneComBordas {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(300,200);
		JPanel panel = new JPanel();
		panel.setBorder(BorderFactory.createBevelBorder(3, Color.red, Color.cyan));
		JLabel label = new JLabel("Matheus Alborghetti Machado");
		label.setBorder(BorderFactory.createBevelBorder(3, Color.blue, Color.yellow));
		frame.getContentPane().add(panel);
		panel.add(label);
		frame.setVisible(true);
	}

}