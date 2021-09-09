package projeto;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.BorderFactory;

public class Bloco extends javax.swing.JPanel{
	
	private static final long serialVersionUID = 1L;
	
	private Boolean eBomba;
	
	public Bloco() {
		setBorder(BorderFactory.createLineBorder(Color.BLACK));
		setBackground(Color.YELLOW);
		this.eBomba = this.ehBomba();
		addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (Boolean.TRUE.equals(eBomba)) {
					setBackground(Color.RED);
				} else {
					setBackground(Color.BLACK);
				}
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}	
			});
	}
	
	public Boolean ehBomba(){
		int random = 1 + (int) (Math.random() * 100);
	    if (random%2 == 0){
	    	return true;
	    }
	    return false;
	}
}
