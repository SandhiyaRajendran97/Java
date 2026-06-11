package practiseMode.org;

import java.util.Scanner;

public class ScannerUsingSwitchCase {
	
	public void simplecalculator() {
	 Scanner sc = new Scanner(System.in);
	 
	 System.out.println("Enter first number: ");
     double num1 = sc.nextDouble();

     System.out.println("Enter second number: ");
     double num2 = sc.nextDouble();

     System.out.println("Enter operator (+, -, *, /): ");
     char operator = sc.next().charAt(0);
     
     switch (operator) {

     case '+':
         System.out.println("Result = " + (num1 + num2));
         break;

     case '-':
         System.out.println("Result = " + (num1 - num2));
         break;

     case '*':
         System.out.println("Result = " + (num1 * num2));
         break;

     case '/':
         if (num2 != 0) {
             System.out.println("Result = " + (num1 / num2));
         } else {
             System.out.println("Division by zero is not allowed.");
         }
         break;

     default:
         System.out.println("Invalid operator.");
 }
     
}

	public static void main(String[]args) {
		ScannerUsingSwitchCase obj= new ScannerUsingSwitchCase();
		obj.simplecalculator();
		
		
	}
}
