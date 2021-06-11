package w10_tunnirakenduse_lahendus;

public class Kodutoo {
    // geneerika meetod jada tegemine
    public static < E > void printArray( E[] inputArray ) {
       // Naita elemente
       for(E element : inputArray) {
          System.out.printf("%s ", element);
       }
       System.out.println();
    }
    
    public static < A > void reverseArray( A[] inputArray ) {
        
        for(int i = 0; i < (inputArray.length/2); i++) {
            A temp = inputArray[i];
            inputArray[i]= inputArray[(inputArray.length)-1-i];
            inputArray[(inputArray.length)-1-i] = temp;
        }
        printArray(inputArray); 
     }
 
    public static void main(String args[]) {
       // Jadad
       Integer[] intArray = { 1, 2, 3, 4, 5 };
       Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
       Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };
 
       System.out.println("Jada:");
       printArray(intArray);   

       System.out.println(" Jada umberpooramine: ");
       reverseArray(intArray);  
 
       System.out.println("\n Topeltjada:");
       printArray(doubleArray);  
 
       System.out.println("\n Topeltjada umberpooramine:");
       reverseArray(doubleArray);  

       System.out.println("\nTahemargid:");
       printArray(charArray);  

       System.out.println("\n Tahemarkide jada umberpooramine: ");
       reverseArray(charArray);   
    }
 } 
