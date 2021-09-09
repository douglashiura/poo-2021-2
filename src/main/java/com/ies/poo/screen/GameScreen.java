package com.ies.poo.screen;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import com.ies.poo.rules.ButtonState;
import com.ies.poo.rules.ControlSelectedButton;

public class GameScreen extends JFrame {
	private static final int PLAY_QUANTITIES_LIMIT = 2;
	private Integer plays = 0;
	
	private JButton button1;
	private JButton button2;
	private JPanel panel;
	private JButton buttonA;
	private JButton buttonB;
	
	private ControlSelectedButton controlButtons;
	private ControlSelectedButton controlA;
	private List<ControlSelectedButton> controlList;
	private List<ControlSelectedButton> selectedButtonList;
	
	public GameScreen () {
		super("Number memory game");
		
		controlList = new ArrayList<>();
		selectedButtonList = new ArrayList<>();
		
		ActionListener buttonAction = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JButton button = (JButton) e.getSource();
				
				for (ControlSelectedButton control : controlList) {
					if(control.getButtonsReference().get(button) != null) {
						plays++;
						control.executeButtonAction(button, ButtonState.SELECTED);
						if(!selectedButtonList.contains(control)) {
							selectedButtonList.add(control);
						}
						if(plays == PLAY_QUANTITIES_LIMIT) {
							if(selectedButtonList.size() > 1) {
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
		
		controlButtons = new ControlSelectedButton();
		controlButtons.setButtonName("Flop");
		
		controlA = new ControlSelectedButton();
		controlA.setButtonName("River");
		
		panel = new JPanel();
		this.add(panel);
		panel.setLayout(null);
		
		button1 = new JButton("Game");
		panel.add(button1);
		button1.setBounds(10, 10, 100, 100);
		
		button1.addActionListener(buttonAction);
		
		button2 = new JButton("Game");
		panel.add(button2);
		button2.setBounds(120, 10, 100, 100);
		button2.addActionListener(buttonAction);

		this.setBounds(250, 250, 350, 350);
		
		buttonA = new JButton("Game");
		panel.add(buttonA);
		buttonA.setBounds(10, 110, 100, 100);
		
		buttonA.addActionListener(buttonAction);
		
		buttonB = new JButton("Game");
		panel.add(buttonB);
		buttonB.setBounds(120, 110, 100, 100);
		
		buttonB.addActionListener(buttonAction);
		
		this.controlButtons.addButton(button1);
		this.controlButtons.addButton(button2);
		this.controlA.addButton(buttonA);
		this.controlA.addButton(buttonB);
		
		this.controlList.add(controlButtons);
		this.controlList.add(controlA);
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}
