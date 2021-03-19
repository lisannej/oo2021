package w06_liides.nimeuuringud;

public class Proov1{
	public static void main(String[] arg){
		TekstistEraldaja te=new SonaEraldaja(1);
		TekstistEraldaja se=new SoliidneEraldaja();
		System.out.println(te.eralda("Juku Juurikas"));
		System.out.println(se.eralda("Juku Juurikas"));
	}
}