package w06_liides.nimeuuringud;

public class SoliidneEraldaja implements TekstistEraldaja{
	TekstistEraldaja esitaheEraldaja=new EsitaheEraldaja();
	TekstistEraldaja teiseSonaEraldaja=new SonaEraldaja(1);
	public String eralda(String s){
		return esitaheEraldaja.eralda(s)+". "+
		       teiseSonaEraldaja.eralda(s);
	}
}