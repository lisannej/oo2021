package w11_proovikontrolltoo;

public class Joogipudel {
    double maht;
    String pudelityyp;
    double mass;
    double taara;
    Jook jook;

    Joogipudel(double maht, String tyyp, double mass, double taara, Jook jook){
        this.maht = maht;
        this.pudelityyp = tyyp;
        this.mass = mass;
        this.taara = taara;
        
        if (jook != null){
            this.jook = jook;
        }
        else {
            jook = null;
        }     
    }

    public double getPudeliMass(){
        if (this.jook != null){
            return this.mass + this.jook.kaal;
        }
        else{
            return 0;
        }
    }

    public double getPudeliHind(){
        if (this.jook != null){
            return this.jook.liitri_hind*this.maht + this.taara;
        }
        else{
            return 0;
        }
    }

}
