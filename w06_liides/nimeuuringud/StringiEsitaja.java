package w06_liides.nimeuuringud;

public class StringiEsitaja implements TekstistEraldaja{
	String sisu;
	public StringiEsitaja(String sisu){
		this.sisu=sisu;
	}
	public String eralda(String s){
		return sisu;
	}
}