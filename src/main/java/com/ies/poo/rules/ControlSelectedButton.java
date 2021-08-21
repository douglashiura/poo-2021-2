package com.ies.poo.rules;

import java.util.HashMap;
import java.util.Map;

import javax.swing.JButton;

public class ControlSelectedButton {
	private String buttonName;
	private Map<JButton, Boolean> buttonsReference;
	
	public ControlSelectedButton () {
		this.buttonsReference = new HashMap<>();
	}
	
	public String getButtonName() {
		return buttonName;
	}
	
	public void setButtonName(String buttonName) {
		this.buttonName = buttonName;
	}
	
	public Map<JButton, Boolean> getButtonsReference() {
		return buttonsReference;
	}
	
	public void setButtonsReference(Map<JButton, Boolean> buttonsReference) {
		this.buttonsReference = buttonsReference;
	}
	
	public void addButton(JButton button) {
		this.buttonsReference.put(button, Boolean.FALSE);
	}
	
	public void alterButtonSelectedState(JButton button, Boolean buttonStatus) {
		Boolean selectedButton = this.buttonsReference.get(button);
		selectedButton = buttonStatus;
	}
	
	public void clearSelection() {
		this.buttonsReference.values().stream().forEach(button -> { 
			button = false; 
		});
	}
	
	public Boolean isAllButtonsSelected() {
		for(Boolean button : this.buttonsReference.values()) {
			if(!button) {
				return false;
			}
		}
		return true;
	}
	
}
