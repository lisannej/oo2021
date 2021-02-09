package w02_klass;

public class proov1 {
    public static void main(String[]arg){
        isikukood lisanne = new isikukood("49807076525");
        System.out.println(lisanne.kuuNumber());
        //Lisage kasklus kuupaeva kusimiseks
        System.out.println(lisanne.kuuPaev());
        System.out.println(lisanne.aastaNumber());
    }
}
