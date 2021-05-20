package w06_liides;

public class Test {
    public static void main(String[] args) {
    
        Ruut ruut = new Ruut(5);
        System.out.println("Loodi ruut, mille külg on " + ruut.alus + ", pindala on: " + ruut.pindala() + ", umbermoot on: " + ruut.umbermoot());

        Kolmnurk kolmnurk = new Kolmnurk(5, 3);
        pindala(ruut);
        System.out.println("Loodi kolmnurk, mille alus on " + kolmnurk.alus + ", pindala on: " + kolmnurk.pindala() + ", umbermoot on: " + kolmnurk.umbermoot());
    }

    public static void pindala(Kujund K){
        System.out.println(K.pindala());
    }
}
