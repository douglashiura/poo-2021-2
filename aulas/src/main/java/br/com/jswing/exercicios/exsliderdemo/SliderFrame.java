// NOMES: LUIZ FERNANDO E NILO J COELHO NETO

package br.com.jswing.exercicios.exsliderdemo;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class SliderFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JSlider diameterJSlider;
	private OvalPanel myPanel;

	public SliderFrame() {
		super("Ex Slider Demo");

		myPanel = new OvalPanel();
		myPanel.setBackground(Color.YELLOW);

		diameterJSlider = new JSlider(SwingConstants.HORIZONTAL, 0, 200, 10);
		diameterJSlider.setMajorTickSpacing(10);
		diameterJSlider.setPaintTicks(true);
		diameterJSlider.addChangeListener(new ChangeListener() {

			@Override
			public void stateChanged(ChangeEvent evt) {
				myPanel.setDiameter(diameterJSlider.getValue());

			}
		});

		add(diameterJSlider, BorderLayout.SOUTH);
		add(myPanel, BorderLayout.CENTER);
	}

}
