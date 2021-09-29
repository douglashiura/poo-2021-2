package moduloCinco;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Slider extends JFrame {

	private JSlider diameterJSlider;
	private OvalPanel myPanel;

	public Slider() {

		super("Slider Demo");

		myPanel = new OvalPanel();
		myPanel.setBackground(Color.YELLOW);

		diameterJSlider = new JSlider(SwingConstants.HORIZONTAL, 0, 200, 10);

		diameterJSlider.setMajorTickSpacing(10);

		diameterJSlider.setPaintTicks(true);

		diameterJSlider.addChangeListener(new ChangeListener() {

			public void stateChanged(ChangeEvent e) {

				myPanel.setDiameter(diameterJSlider.getValue());
				System.out.println(diameterJSlider.getValue());
			}

		});
		
		add(diameterJSlider, BorderLayout.SOUTH);
		
		add(myPanel, BorderLayout.CENTER);
	}
}
