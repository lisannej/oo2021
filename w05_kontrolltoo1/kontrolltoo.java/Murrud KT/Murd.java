public class Murd {
    private int lugeja;
    private int nimetaja;

    public Murd(int lugeja, int nimetaja){
        this.lugeja = lugeja;
        this.nimetaja = nimetaja;
    }

    // testing method, not to be used
    public int getLugeja(){
        return this.lugeja;
    }

    public void Segaarv(){
        int taisosa = 0;
        if (lugeja > nimetaja){
            taisosa = (int) lugeja/nimetaja;
            lugeja = lugeja - (taisosa * nimetaja);
        }
        if (taisosa > 0){
            System.out.format("Segaarvuna on: %d %d/%d%n", taisosa, lugeja, nimetaja);
        } else {
            System.out.format("Vastus on: %d/%d%n", lugeja, nimetaja);
        }
    }

    public void Liitmine(int lugeja1, int nimetaja1, int lugeja2, int nimetaja2){
        int nimetaja = nimetaja1;
        int lugeja_total = 0;
        int taisosa = 0;

        // uhisele nimetajale viimine
        lugeja1 = lugeja1 * nimetaja2;
        nimetaja1 = nimetaja1 * nimetaja2;
        lugeja2 = lugeja2 * nimetaja;
        nimetaja2 = nimetaja2 * nimetaja;

        // liitmine
        lugeja_total = lugeja1 + lugeja2;
        System.out.format("%d/%d + %d/%d = %d/%d%n", lugeja1, nimetaja1, lugeja2, nimetaja2, lugeja_total, nimetaja2);

        // taandamine
        for(int i = Math.min(nimetaja2, lugeja_total); i > 0; i--){
            if (lugeja_total % i == 0 && nimetaja2 % i == 0)
            {
                lugeja_total = lugeja_total / i;
                nimetaja2 = nimetaja2 / i;
            }
        }

        // segaarvuks tegemine
        if (lugeja_total > nimetaja2){
            taisosa = (int) lugeja_total/nimetaja2;
            lugeja_total = lugeja_total - (taisosa * nimetaja2);
        }
        if (taisosa > 0){
            System.out.format("Liitmise tulemus on: %d %d/%d%n", taisosa, lugeja_total, nimetaja2);
        } else {
            System.out.format("Liitmise tulemus on: %d/%d%n", lugeja_total, nimetaja2);
        }
    }
}
