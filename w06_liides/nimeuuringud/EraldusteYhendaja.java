package w06_liides.nimeuuringud;

import java.util.*;
//Paneb eraldused üksteise järgi
public class EraldusteYhendaja implements TekstistEraldaja{
	List<TekstistEraldaja> osad=new ArrayList<TekstistEraldaja>();
	public void lisa(TekstistEraldaja t){
		osad.add(t);
	}
	public String eralda(String s){
		StringBuffer sb=new StringBuffer();
		for(TekstistEraldaja te: osad){
			sb.append(te.eralda(s));
		}
		return sb.toString();
	}
}