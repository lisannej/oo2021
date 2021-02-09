package w01_funktsioon;

    public class second {
        public static void main(String[] args){
            System.out.println(myname());
            System.out.println(add(5, 6));
    
            //käivitan funktsioonid
            myMath();
            myEqual();
            areStringsEqual();
    
            System.out.println(fullName("Lisanne", "Jarv"));
            System.out.println(checkEqual(2, 6));
            System.out.println();
        }
        
        private static void myEqual() {
        }

        private static char[] myname() {
            return null;
        }

        public static String myName() {
            return "Lisanne";
        }
        public static int add(int number1, int number2){
            return number1 + number2;
        }
    
        public static String fullName(String firstName, String lastName) {
            return firstName + " " + lastName + " ! ";
        }
    
        public static boolean checkEqual(int number1, int number2){
            return number1 == number2;
        }
    
        public static boolean notEqual(int number1, int number2){
            return number1 != number2;
        }
    
        public static void myMath(){
            System.out.println(Math.pow(5, 4));
            
            int number = (int) Math.pow(5, 4); // casting
            System.out.println(number);
    
        }
    
        public static void myLogical(){
            System.out.println(5 < 10 & 5 > 4 );
            System.out.println(6 < 8 , 3 == 3);
        }
    
        public static void areStringsEqual(){
            String name1 = "Raimo";
            String name2 = "Raimo";
            
            System.out.println(name1 == name2);
    
            String newName1 = new String("Raimo"); // uus objekt ehk New
            String newName2 = new String("Raimo");
    
            System.out.println(newName1 == newName2);
        }
    }
    
    //function add(number1, number)
