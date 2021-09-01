package aula5;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TestWindowListener {
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("Window Listener");
		JLabel label = new JLabel("Clique aqui!");
		frame.setSize(200,300);
		frame.getContentPane().add(label);
		frame.addMouseListener(new MouseListener() {
		@Override
		public void mouseClicked(MouseEvent e) {
			System.out.print("\nClicou");
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			System.out.print("\nSaiu");
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			System.out.print("\nPressionou");
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}	
		});
		
		frame.setVisible(true);
	}

}
