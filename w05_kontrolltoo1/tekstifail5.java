package w05_kontrolltoo1;
import java.io.*;

public class tekstifail5 {
    public static double akeskm(String[] sisend){
        double summa =0;
        for(int i=0; i<sisend.length; i++){
            summa+=Integer.parseInt(sisend[i]);
        }
        return summa/sisend.length;
    }
    public static void main(String argumendid[])
    throws IOException{
        BufferedReader sisse=new BufferedReader(new FileReader("arvud2.txt"));
        String rida1=sisse.readLine();
            double k1=akeskm(rida1.split(" "));
            double k2=akeskm(sisse.readLine().split(" "));
            System.out.println(k1 +" "+k2+" "+(k1>k2));
        sisse.close();
    }
}
