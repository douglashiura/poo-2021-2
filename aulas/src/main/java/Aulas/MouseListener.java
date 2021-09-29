package Aulas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MouseListener extends JFrame {
	private JPanel contentPane;
	
	public static void main(String[] args ) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MouseListener frame = new MouseListener();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public MouseListener() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
