package w02_klass;

import java.io.Reader;

public class Calculation {
    public static void main(String[] args) {
        double num1;
        double num2;
        double ans;
        char op;
        System.out.println("\nEnter an operator (+, -, *, /): ");
        op = reader.next().charAt(0);
      switch(op) {
         case '+': ans = num1 + num2;
            break;
         case '-': ans = num1 - num2;
            break;
         case '*': ans = num1 * num2;
            break;
         case '/': ans = num1 / num2;
            break;
      default: System.out.printf("Error! Enter correct operator");
         return;
        }
    }
}
