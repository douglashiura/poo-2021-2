package moduloCinco;

import javax.swing.JFrame;

public class TestModuloCincoSwing {

	public static void main(String args[]) {

		Table fr = new Table();
		fr.setVisible(true);

		Pane paneFrame = new Pane();
		paneFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		paneFrame.setSize(250, 200);
		paneFrame.setVisible(true);

		Slider sliderFrame = new Slider();
		sliderFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		sliderFrame.setSize(220, 270);
		sliderFrame.setVisible(true);
	}
}
