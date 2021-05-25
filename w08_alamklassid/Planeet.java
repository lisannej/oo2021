package w08_alamklassid;

public class Planeet {
    private int diameeter = 0;

    public float ruumala(){
        return 4/3*3.14*(diameeter/2)*(diameeter/2);
    }
    public int umbermoot(){
        return 2*3.14*(diameeter/2);
    }
}
