package w02_klass;

import javax.management.RuntimeErrorException;

public class isikukood {
    String sisu;
    //public isikukood(String string) {
	//}
	public isikukood(String uusSisu){
        sisu=uusSisu;
        if(sisu.length()!=11){
            throw new RuntimeErrorException(null, "vigane pikkus");

        }
    }
    public String kuuNumber(){
        return sisu.substring(3,5);
    }
    public String kuuPaev(){
        return sisu.substring(6,7);
    }
    public String sugu(){
        int nr=Integer.parseInt(sisu.substring(0,1));
        if(nr % 2 == 0){return "n";}
        return "m";
    }
    //Koosta funktsioon neljakohalise aastaarvu leidmiseks
    public String aastaNumber(){
        int nr=Integer.parseInt(sisu.substring(0,1));
        String sajand = "00";
        if(nr == 3 || nr == 4){
            sajand = "19";
        }
        if(nr == 1 || nr == 2){
            sajand = "18";
        }
        if(nr == 5 || nr == 6){
            sajand = "20";
        }
        
        String aasta=sisu.substring(1,3);
        String taisAasta = sajand + aasta;
        return taisAasta;
    }
}
