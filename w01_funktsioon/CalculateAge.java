package w01_funktsioon;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

 // inimese vanuse arvutamine
public class CalculateAge {
 
    public static void main(String[] args) throws Exception {
        System.out.print("Palun sisesta synniaeg YYYY-MM-DD: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();
 
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Calendar dob = Calendar.getInstance();
        dob.setTime(sdf.parse(input));
        System.out.println("Vanus on:" + getAge(dob));
    }
 
    // Returnin vanuse vaadates aega
    public static int getAge(Calendar dob) throws Exception {
        Calendar today = Calendar.getInstance();
 
        int curYear = today.get(Calendar.YEAR);
        int dobYear = dob.get(Calendar.YEAR);
 
        int age = curYear - dobYear;
 
        // kui kuupaev v kuu ei ole veel olnud vahenda 1 vorra vanust
        int curMonth = today.get(Calendar.MONTH);
        int dobMonth = dob.get(Calendar.MONTH);
        if (dobMonth > curMonth) { 
            age--;
        } else if (dobMonth == curMonth) { // kui on sama kuu, kontrollin paeva
            int curDay = today.get(Calendar.DAY_OF_MONTH);
            int dobDay = dob.get(Calendar.DAY_OF_MONTH);
            if (dobDay > curDay) { 
                age--;
            }
        }
 
        return age;
    }
}
