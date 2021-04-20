package w03_klassikomplekt;

public class Test {
    public static void main(String[] args) {
        System.out.println("Loome lao");
        Ladu ladu = new Ladu(20);
        System.out.println("Lao ruumala on " + ladu.laoRuumala + ", laos on " + ladu.pakkideArv + " pakki.");
        System.out.println("Eemaldame 13 pakki");
        ladu.eemaldaPakke(13);
        System.out.println("Pakke laos alles: " + ladu.pakkideArv + " kogukaaluga " + ladu.getKoguKaal());
        System.out.println("Eemaldame veel 13 pakki");
        ladu.eemaldaPakke(13);
        System.out.println("Pakke laos alles: " + ladu.pakkideArv + " kogukaaluga " + ladu.getKoguKaal());
        System.out.println("Lisame 23 pakki");
        ladu.lisaPakke(23);
        System.out.println("Pakke laos alles: " + ladu.pakkideArv + " kogukaaluga " + ladu.getKoguKaal());
        System.out.println("Lisame veel 33 pakki");
        ladu.lisaPakke(33);
        System.out.println("Pakke laos alles: " + ladu.pakkideArv + " kogukaaluga " + ladu.getKoguKaal());
    }
}
