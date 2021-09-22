package Calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Calculator.controller.CalculatorController;
import Calculator.view.CalculatorView;

public class Calculator implements ActionListener {
   

   public Calculator(){}
   public static void main(String[] args) {
      CalculatorView.createWindow();
   }

   public void actionPerformed(ActionEvent e) {
      String command = e.getActionCommand();
      if (command.charAt(0) == 'C') {                      
         CalculatorView.inputBox.setText("");
      }else if (command.charAt(0) == '=') {                    
         CalculatorView.inputBox.setText(CalculatorController.evaluate(CalculatorView.inputBox.getText()));
      }else {                                
         CalculatorView.inputBox.setText(CalculatorView.inputBox.getText() + command);
      }
   }
 
} 