package w09_tunnirakenduse_lahendus;
import java.util.*;
public class Jadayhendus extends Hulgiyhendus{
	public boolean kasJuhib(){
		for(Voolujuht v: hoidla){
			return v.kasJuhib();
		}
		return true;
	}  
}