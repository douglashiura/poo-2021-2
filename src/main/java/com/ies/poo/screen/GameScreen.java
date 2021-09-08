package com.ies.poo.screen;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import com.ies.poo.rules.ButtonState;
import com.ies.poo.rules.ControlSelectedButton;

public class GameScreen extends JFrame {
	private JButton button1;
	private JButton button2;
	private JPanel panel;
	private JButton buttonA;
	private JButton buttonB;
	
	private ControlSelectedButton controlButtons;
	private ControlSelectedButton controlA;
	
	public GameScreen () {
		super("Number memory game");
		
		ActionListener buttonAction = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				((JButton)	e.getSource()).setBackground(Color.green);
				controlButtons.executeButtonAction(((JButton) e.getSource()), ButtonState.SELECTED);
				((JButton)	e.getSource()).setText(controlButtons.getButtonName());
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
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}
