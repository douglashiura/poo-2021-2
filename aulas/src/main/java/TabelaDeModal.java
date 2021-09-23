import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JLabel;
public class TabelaDeModal extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	public static void main(String[] args) {
		JFrameframe = newJFrame("HelloWorldSwing");
		finalJLabellabel = newJLabel("Hello World");
		botao = new JButton("Clique aqui");
	    botao.addActionListener(this);
		frame.getContentPane().add(label);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
	public static void main(String[] args) {
		HelloWorldFrame frame = new HelloWorldFrame();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
