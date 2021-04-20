package w06_liides;

// Eeldan et tegu on vordkulgse kolmnurgaga
public class Kolmnurk implements Kujund {
    int alus = 0;
    int korgus = 0;

    public Kolmnurk(int a, int b){
        alus = a;
        korgus = b;
    }

    public int pindala(){
        return (alus * korgus) / 2;
    }

    public int umbermoot(){
        return 3 * alus;
    }
}
