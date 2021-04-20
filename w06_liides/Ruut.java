package w06_liides;

public class Ruut implements Kujund {
    int alus = 0;
    int korgus = 0;

    public Ruut(int a){
        alus = a;
        korgus = a;
    }

    public int pindala(){
        return alus * alus;
    }

    public int umbermoot(){
        return 4 * alus;
    }
}
