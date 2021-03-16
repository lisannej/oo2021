import java.util.Scanner;

public class mainCalc {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args){

        Fraction fraction1 = new Fraction();
        Fraction fraction2 = new Fraction();

        introduction();

        calculateOrEndByChoice(fraction1, fraction2);

        outro();
    }

    public static void introduction(){

        System.out.println("\nThis program is a fraction calculator. " +
                "\nIt will add fractions until you type Q to quit " +
                "\nPlease enter your fractions in the form, a/b where a and b are Integers. " +
                "\n----------------------------------------------------------------------------------------");
    }


    public static String getValidOperationChoice(){

        System.out.print("Please enter an operation (+ or Q to quit): ");
        String x = input.nextLine();
        while(!x.matches("[+qQ]")){
            System.out.print("Invalid Input (+ or Q to quit): ");
            x = input.nextLine();
        }

        return x;
    }



    public static boolean isValidFraction(String x) {

        int index = x.indexOf('/'); // search the '/' separator
        if ( index == -1 )
        {
            // there is NO separator, a signed integer is allowed
            try
            {
                Integer.parseInt(x);
            }
            catch( NumberFormatException e )
            {
                return false;
            }
        }
        else
        {
            // there is the separator, just a positive integer divisor is allowed
            int d;
            try
            {
                Integer.parseInt( x.substring(0, index) );
                d = Integer.parseInt( x.substring(index+1));

                if ( d <= 0) return false;
            }
            catch( NumberFormatException e )
            {
                return false;
            }
        }
        return true;
    }


    public static Fraction getFraction(){

        System.out.print("Please enter a fraction (a/b) or an integer (a) : ");
        String x = input.nextLine();
        while(!isValidFraction(x)){
            System.out.print("Invalid Input. Please enter a fraction (a/b) or an integer (a), " +
                    "where a and b are Integers and b is greater than 0 : ");
            x = input.nextLine();
        }

        String[] strArray = x.split("/");
        int[] intArray = new int[strArray.length];
        for(int i = 0; i < strArray.length; i++) {
            intArray[i] = Integer.parseInt(strArray[i]);
        }
        if(intArray.length == 1) {
            int num = intArray[0];
            Fraction fraction = new Fraction(num);
            return fraction;
        }else{
            int num = intArray[0];
            int den = intArray[1];
            Fraction fraction = new Fraction(num, den);
            return fraction;
        }
    }


    public static void calculateOrEndByChoice(Fraction fraction1, Fraction fraction2) {

        String x = getValidOperationChoice();
        x = x.toUpperCase();
        while(!x.equals("Q")) {
            if (x.equals("+")) {
                fraction1 = getFraction();
                fraction2 = getFraction();
                System.out.println(fraction1.toString() + " + " + fraction2.toString() +
                        fraction1.add(fraction2).toString() +
                        "\n---------------------------------------------------------------------------");
                x = getValidOperationChoice();
                x = x.toUpperCase();
            }

        }
    }


    public static void outro(){

        System.out.println("\n---------------------------------------------------------------------------" +
                "\nThank you for using \"Fraction Calculator.\" Have a great day! Goodbye!");
    }
}