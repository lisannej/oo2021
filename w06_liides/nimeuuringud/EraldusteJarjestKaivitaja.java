package w06_liides.nimeuuringud;

import java.util.*;
//Paneb eraldused üksteise järgi
public class EraldusteJarjestKaivitaja implements TekstistEraldaja{
	List<TekstistEraldaja> osad=new ArrayList<TekstistEraldaja>();
	public void lisa(TekstistEraldaja t){
		osad.add(t);
	}
	public String eralda(String s){
		for(TekstistEraldaja te: osad){
			s=te.eralda(s);
		}
		return s;
	}
}