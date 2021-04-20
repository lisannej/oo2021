package w03_klassikomplekt;

public class Ladu {
    int pakkideArv = 0;
    int vabaRuumala = 0;
    int laoRuumala = 0;
    int pakiRuumala = 10;
    Pakk pakk = new Pakk(10, 3);

    public Ladu(int pakid){
        pakkideArv = pakid;
        laoRuumala = (pakid * pakk.ruumala);
        vabaRuumala = laoRuumala;
    }

    public int getKoguKaal(){
        return pakkideArv * pakk.kaal;
    }

    public void lisaPakke(int kogus){
        if (vabaRuumala >= (kogus * pakk.ruumala)){
            pakkideArv += kogus;
            vabaRuumala -= (kogus * pakk.ruumala);
            System.out.println("Lisati " + kogus + " pakki");
        }
        else{
            System.out.println("Pakid ei mahu lattu");
        }
    }
    
    public void eemaldaPakke(int kogus){
        if (kogus <= pakkideArv){
            pakkideArv -= kogus;
            vabaRuumala += (kogus * pakk.ruumala);
            System.out.println("Eemaldati " + kogus + " pakki");
        }
        else{
            System.out.println("Ei saa eemaldada " + kogus + " pakki, laos on " + pakkideArv + " pakki.");
        }
    }
}