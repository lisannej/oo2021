package w05_kontrolltoo1;
//Koosta funktsioon kolme arvu aritmeetilise keskmise leidmiseks. Katseta.

public class CalculateMean {
    public static void main(String args[]){
       //float mean;
       int sum, i;
       int n = 3;
       int a[] = {10,5,2};
       sum = 0;
 
       for(i = 0; i < n; i++) {
          sum+=a[i];
       }
       System.out.println("Mean ::"+ sum/(float)n);
    }
 }