package w02_klass;
import java.util.*;

import javax.management.RuntimeErrorException;
public class retsept {
    Hashtable<String, Double> ained=new Hashtable<String, Double>();
    public Set kysiAinenimed(){return ained.keySet();}
    public void lisa(String aine, double kogus){
        if(ained.containsKey(aine)){
            throw new RuntimeException(aine+"juba olemas");
        }
        ained.put(aine, kogus);
    }
    public double koguMass(){
    double summa=0;
    for(double kogus: ained.values()){
        summa+=kogus;
    }
    return summa;
}
}
