package w02_klass;
import java.util.Scanner;

public class Calculator {

      public static void main(String[] args) {
      Scanner reader = new Scanner(System.in);

      System.out.println("Enter a number: " );
      Double num1 = reader.nextDouble();// scanner loeb j'rgmist esinevat double tuupi v''rtust'

      System.out.println("Enter a number: " );
      Double num2 = reader.nextDouble();
      reader.nextLine(); // j'rgmine scanner ei tootaks muidu Double ja String tuupi vahe p'rast

      System.out.println("\nEnter an operator (+, -, *, /): ");
      String op = reader.nextLine();

      // close the scanner
      System.out.println(" ");
      reader.close();
      System.out.println(" ");

      System.out.println("\nThe result is given as follows:\n");
      System.out.println(num1 + " " + op + " " + num2 + " =" + ans);
   }
}
