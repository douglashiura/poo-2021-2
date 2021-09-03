package testeJOptionPane;

import java.awt.Color;
import java.awt.Component;
import java.awt.TextField;
import java.awt.Window;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class FlamengoVasco {
	public static void main(String[] args) {
	    JFrame frame = new JFrame("Frame");
	    Window window = new Window(frame);
	    JButton jbutton = new JButton("Botão");
		JLabel label = new JLabel("Times", JLabel.CENTER);
		TextField jTextFild = new TextField("Flamengo");
		
		label.setOpaque(true);
		
		frame.getContentPane().add(label);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 200);
		frame.setVisible(true);
		
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				label.setForeground(Color.RED);
			}
			
			public void mouseEntered(MouseEvent e) {
				label.setBackground(new Color(255, 255, 255)); 
			}
		});
		
		jbutton.setLocation(20, 20);
		jbutton.setSize(100, 100);
		jTextFild.setSize(100, 100);
		jTextFild.setLocation(200, 200);
		jTextFild.addTextListener(new TextListener() {

			@Override
			public void textValueChanged(TextEvent e) {
				System.out.println(e.toString());
				jTextFild.setText("vasco");
			}
			
		});
		jTextFild.addKeyListener(new KeyListener() {

			public void keyTyped(KeyEvent e) {
				System.out.println(e.getKeyChar());
				if(e.getKeyChar() == 'S') {
					jTextFild.setText("São Paulo");
				}
			}

			public void keyPressed(KeyEvent e) {
				if(e.getKeyChar() == 'a') {
					jTextFild.setText("São Caetano");
				}
				
			}

			public void keyReleased(KeyEvent e) {
				if(e.getKeyChar() == 'S') {
					jTextFild.setText("São José");
				}
				
			}
			
		});
		frame.setLayout(null);
		frame.setSize(400, 400);
		//frame.getContentPane().add(button);
		//frame.getContentPane().add(label);
		frame.getContentPane().add(jTextFild);
		//frame.getContentPane().add(textField2);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.addWindowListener(null);
	}

}
