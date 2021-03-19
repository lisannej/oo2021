package w06_liides.nimeuuringud;

public class SonaEraldaja implements TekstistEraldaja{
	int koht;
	public SonaEraldaja(int koht){
		this.koht=koht;
	}
	public String eralda(String s){
		String[] m=s.split(" ");
		if(koht>=0 && koht<m.length){return m[koht];}
		if(koht<0 && -koht<=m.length){return m[m.length+koht];}
		return "xxx";
	}
}