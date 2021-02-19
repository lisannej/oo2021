package w02_klass;
import java.util.Scanner;

public class Calculator {
   public static void main(String[] args) {
      double num1;
      double num2;
      double ans;
      char op;
      Scanner reader = new Scanner(System.in);
      System.out.println("Enter a number: " + num1(6));
      System.out.println("Enter a number: " + num2(2));

      System.out.print("\nEnter an operator (+, -, *, /): ");
      
      System.out.print("\nThe result is given as follows:\n");
      System.out.printf(num1 + " " + op + " " + num2 + " = " + ans);
   }
}
    
