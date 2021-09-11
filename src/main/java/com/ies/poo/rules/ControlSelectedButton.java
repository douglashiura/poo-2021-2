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
	
	public void executeButtonAction(JButton button, ButtonState selected) throws InterruptedException {
		alterButtonSelectedState(button, selected);
		if(this.isAllButtonsSelected()) {
			changeAllButtonsState(ButtonState.EVEN_MATCH);
		} else {
			System.out.println("aqui");
			changeButtonVisibility(button);
		}
	}
	
	private void changeAllButtonsState(ButtonState buttonState) throws InterruptedException {
		for (JButton button : this.buttonsReference.keySet()) {
			alterButtonSelectedState(button, buttonState);
			changeButtonVisibility(button);
		}
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
		this.buttonsReference.put(button, buttonStatus);
	}
	
	private void changeButtonVisibility(JButton button) throws InterruptedException {
		ButtonState buttonStatus = this.buttonsReference.get(button);
		System.out.println(button);
		button.setOpaque(true);
		switch(buttonStatus) {
			case NORMAL:
				button.setBackground(null);
				button.setText(this.buttonName);
				button.setText("Game");
				break;
			case SELECTED:
				button.setBackground(Color.GREEN);
				button.setText(this.buttonName);
				break;
			case EVEN_MATCH:
				button.setBackground(Color.MAGENTA);
				button.setText(this.buttonName);
				button.setEnabled(false);
				break;
		}
	}
	
	public void clearSelection() throws InterruptedException {
		System.out.println("aqui2");
		changeAllButtonsState(ButtonState.NORMAL);
	}
	
	public static void setTimeout(Runnable runnable, int delay){
	    new Thread(() -> {
	        try {
	            Thread.sleep(delay);
	            runnable.run();
	        }
	        catch (Exception e){
	            System.err.println(e);
	        }
	    }).start();
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
