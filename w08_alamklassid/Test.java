package w08_alamklassid;

public class Test {
    public static void main(String[] args) {
        Maa m = new Maa();
        System.out.println("Populatsioon maal: " + m.getPopulatsioon()+ "Umbermoot: " + m.umbermoot());

        Saturn s = new Saturn();
        System.out.println("Ruumala saturnil: " + s.ruumala() + "Umbermoot: " + s.umbermoot());
    }
}
