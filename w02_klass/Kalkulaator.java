package w02_klass;


public class Kalkulaator {
      public static void main(String[] args){
        //Arvutus uusArvutus=new Arvutus();
        //uusArvutus.Arvuta("+",5,3);
        //uusArvutus.Arvuta("*", 4, 5);

        System.out.println("Esimese tehte vastus on: " + Arvutus.Arvuta("+", 5, 3));
        System.out.println("Teise tehte vastus on: " + Arvutus.Arvuta("*", 4, 5));
      }



  }
