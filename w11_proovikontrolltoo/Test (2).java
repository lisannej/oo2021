package w11_proovikontrolltoo;

public class Test {
    public static void main(String[] args) {
        Jook jook1 = new Jook("Piim", 1, 0.5);
        Joogipudel piimapudel = new Joogipudel(1, "piim", 0.3, 0.1, jook1);
        System.out.println("Piima mass pudeliga on: " + piimapudel.getPudeliMass() + ", piima hind on: " + piimapudel.getPudeliHind());

        Joogipudel tyhi_pudel = new Joogipudel(1, "vesi", 0.5, 2, null);
        System.out.println("Tühja pudeli mass: " + tyhi_pudel.getPudeliMass() + ", hind on: " + tyhi_pudel.getPudeliHind());
    }
}
