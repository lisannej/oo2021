package w09_tunnirakenduse_lahendus;
public class Testcase1{
    public static void kuvaOlek(Voolujuht v){
        if(v.kasJuhib()){
            System.out.println("Poleb");
        } else {
            System.out.println("Ei pole");
        }
    }
    public static void main(String[] arg){
        Lyliti l1 = new Lyliti();
        Lyliti l2 = new Lyliti();
        Sisend s1 = new Sisend();
        Lyliti lamp = new Lyliti();
        
        s1.lisa(l1);
        s1.lisa(l2);
        s1.seisund(true);

        // Test1
        l1.seisund(false);
        l2.seisund(false);
        lamp.seisund(l1.kasJuhib() || l2.kasJuhib());
        kuvaOlek(lamp);

        // Test2
        l1.seisund(true);
        l2.seisund(false);
        lamp.seisund(l1.kasJuhib() || l2.kasJuhib());
        kuvaOlek(lamp);

        // Test3
        l1.seisund(false);
        l2.seisund(true);
        lamp.seisund(l1.kasJuhib() || l2.kasJuhib());
        kuvaOlek(lamp);

        // Test4
        l1.seisund(true);
        l2.seisund(true);
        lamp.seisund(l1.kasJuhib() || l2.kasJuhib());
        kuvaOlek(lamp);

        
    }
}