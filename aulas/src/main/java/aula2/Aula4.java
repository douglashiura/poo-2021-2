package aula2;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Aula4 {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		JPanel panel4 = new JPanel();
		JLabel Type = new JLabel("Hello World");
		JLabel Matéria = new JLabel("POO");
		JLabel Fase = new JLabel("Quarta Fase");
		GridLayout gridLayout1 = new GridLayout(2, 1);
		GridLayout gridLayout2 = new GridLayout(1, 2);
		
		frame.setSize(400,500);
		frame.getContentPane().setLayout(gridLayout1);
		frame.getContentPane().add(panel1);
		frame.getContentPane().add(panel2);
		panel1.setBackground(Color.RED);
		panel1.add(Type);
		panel1.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		panel2.setLayout(gridLayout2);
		panel2.setBackground(Color.yellow);
		panel2.add(panel3);
		panel2.add(panel4);
		panel2.setBorder(BorderFactory.createLineBorder(Color.CYAN));
		panel3.setBackground(Color.GRAY);
		panel3.add(Matéria);
		panel4.setBackground(Color.DARK_GRAY);
		panel4.add(Fase);
		frame.setVisible(true);
	}

}