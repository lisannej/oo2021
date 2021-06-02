package w09_tunnirakenduse_lahendus;
public class Lyliti implements Lylitatav, Voolujuht{
    boolean yhendatud;
    public boolean kasJuhib(){return yhendatud;}
    public void seisund(boolean sees){yhendatud=sees;}
}