package com.ies.poo.screen;

import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import com.ies.poo.rules.ButtonState;
import com.ies.poo.rules.ControlSelectedButton;

public class GameScreen extends JFrame {

	private static final long serialVersionUID = 1L;
	private static final int PLAY_QUANTITIES_LIMIT = 2;
	private Integer plays = 0;

	private JPanel panel;

	private List<ControlSelectedButton> controlList;
	private List<ControlSelectedButton> selectedButtonList;
	private ActionListener buttonAction;

	public GameScreen() {
		super("Number memory game");

		controlList = new ArrayList<>();
		selectedButtonList = new ArrayList<>();

		buttonAction = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JButton button = (JButton) e.getSource();

				for (ControlSelectedButton control : controlList) {
					if (control.getButtonsReference().get(button) != null) {
						plays++;
						control.executeButtonAction(button, ButtonState.SELECTED);
						if (!selectedButtonList.contains(control)) {
							selectedButtonList.add(control);
						}
						if (plays == PLAY_QUANTITIES_LIMIT) {
							if (selectedButtonList.size() > 1) {
								for (ControlSelectedButton selectedControl : selectedButtonList) {
									selectedControl.clearSelection();
								}
							}
							plays = 0;
							selectedButtonList.clear();
						}
						break;
					}
				}
			};
		};

		panel = new JPanel();
		this.add(panel);
		panel.setLayout(null);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		createGame(6);
		this.setBounds(250, 250, 500, 500);
		this.setVisible(true);
	}
	
	private void createGame(int pairQuantities) {
		ControlSelectedButton control = null;
		
		List<Rectangle> positions = new ArrayList<>();
		int xPosition = 10;
		int yPosition = 10;
		
		Random random = new Random();
		
		Integer buttonNumber = 0;
		Integer buttonPosition = 0;
		
		for (int i = 0; i < (pairQuantities * 2); i++) {
			Rectangle rectangle = new Rectangle(xPosition, yPosition, 75, 75);
			positions.add(rectangle);
			if(i % 5 == 0 && i > 0) {
				
				yPosition += 80;
				xPosition = 10;
			} else {
				xPosition += 80;
			}
		}
		
		for (int i = 0; i < (pairQuantities * 2); i++) {
			if(i % 2 == 0) {
				control = new ControlSelectedButton();
				control.setButtonName("Button " + buttonNumber++);
				this.controlList.add(control);
			}
			JButton button = new JButton("Game");
			this.panel.add(button);
			button.addActionListener(this.buttonAction);
			int position = random.nextInt((positions.size() - 1) > 0 ? positions.size() - 1 : 1);
			button.setBounds(positions.get(position));
			positions.remove(position);
			
			control.addButton(button);
		}
	}
}
