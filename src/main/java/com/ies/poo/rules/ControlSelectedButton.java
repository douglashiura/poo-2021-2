package com.ies.poo.rules;

import java.awt.Color;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JButton;

public class ControlSelectedButton {
	private String buttonName;
	private Map<JButton, ButtonState> buttonsReference;
	
	public ControlSelectedButton () {
		this.buttonsReference = new HashMap<>();
	}
	
	public String getButtonName() {
		return buttonName;
	}
	
	public void setButtonName(String buttonName) {
		this.buttonName = buttonName;
	}
	
	public Map<JButton, ButtonState> getButtonsReference() {
		return buttonsReference;
	}
	
	public void setButtonsReference(Map<JButton, ButtonState> buttonsReference) {
		this.buttonsReference = buttonsReference;
	}
	
	public void addButton(JButton button) {
		this.buttonsReference.put(button, ButtonState.NORMAL);
	}
	
	public void alterButtonSelectedState(JButton button, ButtonState buttonStatus) {
		ButtonState selectedButton = this.buttonsReference.get(button);
		selectedButton = buttonStatus;
		changeButtonVisibility(button);
	}
	
	private void changeButtonVisibility(JButton button) {
		ButtonState buttonStatus = this.buttonsReference.get(button);
		switch(buttonStatus) {
			case NORMAL:
				button.setBackground(Color.GRAY);
				button.setText("Game");
				break;
			case SELECTED:
				button.setBackground(Color.GREEN);
				button.setText(this.buttonName);
				break;
			case EVEN_MATCH:
				button.setBackground(Color.MAGENTA);
				button.setText(this.buttonName);
				break;
		}
	}
	
	public void clearSelection() {
		this.buttonsReference.values().stream().forEach(button -> { 
			button = ButtonState.NORMAL; 
		});
	}
	
	public Boolean isAllButtonsSelected() {
		for(ButtonState button : this.buttonsReference.values()) {
			if(button != ButtonState.SELECTED) {
				return false;
			}
		}
		return true;
	}
	
}
