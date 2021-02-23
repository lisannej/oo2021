package w05_kontrolltoo1;
import java.io.*;

public class tekstifail4 {
  public static void main(String argumendid[]) throws IOException{
    BufferedReader sisse=new BufferedReader(
      new FileReader("arvud1.txt")
    );
    int summa = 0;
    int i =0;
    String rida=sisse.readLine();
    while(rida!=null){
     System.out.println(rida);
     int arv = Integer.parseInt(rida);
     summa+=arv;
     i+=1;
     rida=sisse.readLine();
    }
    sisse.close();
    System.out.println(summa);
    System.out.println(summa*1/1.0);
  }
}

