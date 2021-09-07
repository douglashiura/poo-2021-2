package com.ies.poo.rules;

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
