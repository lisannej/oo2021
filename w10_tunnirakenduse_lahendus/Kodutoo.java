package w10_tunnirakenduse_lahendus;
public class Kodutoo {
    // generic method printArray
    public static < E > void printArray( E[] inputArray ) {
       // Display array elements
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
       // Create arrays of Integer, Double and Character
       Integer[] intArray = { 1, 2, 3, 4, 5 };
       Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
       Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };
 
       System.out.println("Array integerArray contains:");
       printArray(intArray);   // pass an Integer array

       System.out.println(" Jada umberpooramine: ");
       reverseArray(intArray);   // pass an Integer array
 
       System.out.println("\nArray doubleArray contains:");
       printArray(doubleArray);   // pass a Double array
 
       System.out.println("\n Double jada umberpooramine:");
       reverseArray(doubleArray);   // pass a Double array

       System.out.println("\nArray characterArray contains:");
       printArray(charArray);   // pass a Character array

       System.out.println("\n Tahemarkide jada umberpooramine: ");
       reverseArray(charArray);   // pass a Character array
    }
 } 
