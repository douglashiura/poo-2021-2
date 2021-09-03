package Aulas;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ListenerTecla implements KeyListener, ActionListener {

	JFrame frame;
	JTextField text;
	JLabel label;
	JButton button;

	public ListenerTecla() {

		frame = new JFrame();
		frame.setTitle("Teste Teclado");
		label = new JLabel();
		text = new JTextField(15);
		text.addKeyListener(this);
		button = new JButton("Limpar");
		button.addActionListener(this);
		JPanel panel = new JPanel();
		panel.add(text);
		panel.add(button);

		frame.setLayout(new BorderLayout());
		frame.add(label, BorderLayout.NORTH);
		frame.add(panel, BorderLayout.SOUTH);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 100);
		frame.setVisible(true);
	}

	@Override
	public void keyTyped(KeyEvent ke) {
		label.setText("Você digitou: " + ke.getKeyChar());
	}

	@Override
	public void keyPressed(KeyEvent ke) {
		label.setText("Você pressionou: " + ke.getKeyChar());
	}

	@Override
	public void keyReleased(KeyEvent ke) {
		label.setText("" + ke.getKeyChar());

	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		text.setText("");
	}

	public static void main(String args[]) {
		new ListenerTecla();
	}
} 
