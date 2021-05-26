package w08_alamklassid;

public class Test {
    public static void main(String[] args) {
        Maa m = new Maa();
        System.out.println("Populatsioon Maal: " + m.getPopulatsioon()+ " Ümbermoot: " + m.umbermoot(m.diameeter));

        Saturn s = new Saturn();
        System.out.println("Ruumala Saturnil: " + s.ruumala(s.diameeter) + " Ümbermoot: " + s.umbermoot(s.diameeter) + " Rongaid on: " + s.getRongad());
    }
}
