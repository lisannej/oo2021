package w06_liides.nimeuuringud;

public class EsitaheEraldaja implements TekstistEraldaja{
	public String eralda(String s){
		return s.substring(0, 1);
	}
}