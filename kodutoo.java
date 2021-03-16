public class kodutoo{
    //funktsioon arvutab hinna koos käibemaksuga, sisestatakse käibemaksuta hind
    public static double kaibemaks(double h){
            double d = h*1.2;
            double roundDbl = Math.round(d*100.0)/100.0;
            return roundDbl;
        }

public static void main(String[] arg){
    System.out.println(kaibemaks((Double.parseDouble(arg[0]))));
}
}