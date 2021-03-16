
public class Divisible {
        public static void main(String args[]) {

         int digitSum = 0;
         String num = "";
         public Divisible {
         for(int i = 0; i<num.length(); i++) {
              digitSum = digitSum + num.charAt(i)-'0';
           }
           if(digitSum % 2 == 0) {
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
        public PrimeNumber {
         boolean flag = false;
         for (int i = 2; i <= num / 2; ++i) {
           // condition for nonprime number
           if (num % i == 0) {
             flag = true;
             break;
           }
         }
     
         if (!flag)
           System.out.println(num + " is a prime number.");
         else
           System.out.println(num + " is not a prime number.");
        }
     }
   
