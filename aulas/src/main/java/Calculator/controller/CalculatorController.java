package Calculator.controller;

public class CalculatorController {
	public static String evaluate(String expression) {
      char[] array = expression.toCharArray();
      String operand1 = "";String operand2 = "";String operator = "";
      double result = 0;

      for (int i = 0; i < array.length; i++) {
         if (array[i] >= '0' && array[i] <= '9' || array[i] == '.') {
            if(operator.isEmpty()){
               operand1 += array[i];
            }else{
               operand2 += array[i];
            }
         }  

         if(array[i] == '+' || array[i] == '-' || array[i] == '/' || array[i] == '*') {
            operator += array[i];
         }
      }

      if (operator.equals("+"))
         result = (Double.parseDouble(operand1) + Double.parseDouble(operand2));
      else if (operator.equals("-"))
         result = (Double.parseDouble(operand1) - Double.parseDouble(operand2));
      else if (operator.equals("/"))
         result = (Double.parseDouble(operand1) / Double.parseDouble(operand2));
      else
         result = (Double.parseDouble(operand1) * Double.parseDouble(operand2));          
      return operand1 + operator + operand2 + "=" +result;
   }    
}
