import java.util.Scanner;

public class Divisible {
   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a number :");
      String num = sc.nextLine();
      int digitSum = 0;
     
      for(int i = 0; i<num.length(); i++) {
         digitSum = digitSum + num.charAt(i)-'0';
      }
      if(digitSum % 3 == 0) {
         System.out.println("Given number is divisible by 3");
      } else if(digitSum % 2 == 0) {
        System.out.println("Given number is divisible by 2");
     } else if(digitSum % 3 == 0) {
         System.out.println("Given number is divisible by 3");
      } else if(digitSum % 5 == 0) {
            System.out.println("Given number is divisible by 5");
      } else if(digitSum % 7 == 0) {
            System.out.println("Given number is divisible by 7");
         } else {
        System.out.println("Given number is not divisible by 2 / 3 / 5 or 7");
     }
   }
}