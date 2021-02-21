package w02_klass;

import java.util.Scanner;
   public class Calculation {
         double num1;
         double num2;
         double ans;
         char op;

      op = reader.nextLine().charAt(0);
      if (op == '+') {
            ans = (num1 + num2);
            System.out.println("Answer:" + ans);
            } 
      if (op == '-') {
            ans = (num1 - num2);
            System.out.println("Answer:" + ans);
            } 
      if (op == '*') {
            ans = (num1 * num2);
            System.out.println("Answer:" + ans);
            } 
      if (op == '/') {
            ans = (num1/num2);
            System.out.println("Answer:" + ans);
            } 
      else {
            System.out.println("not implemented yet. Sorry!");
      }
   }
   
