package w06_liides.nimeuuringud;

public class Proov2{
	public static void main(String[] arg){
		EraldusteYhendaja initsiaalid=new EraldusteYhendaja();
		initsiaalid.lisa(new EsitaheEraldaja());
		initsiaalid.lisa(new StringiEsitaja("."));
		
		EraldusteJarjestKaivitaja perekonnanimeEsitaht=new EraldusteJarjestKaivitaja();
		perekonnanimeEsitaht.lisa(new SonaEraldaja(1));
		perekonnanimeEsitaht.lisa(new EsitaheEraldaja());

		initsiaalid.lisa(perekonnanimeEsitaht);
		initsiaalid.lisa(new StringiEsitaja("."));
		
		System.out.println(initsiaalid.eralda("Juku Kaalikas"));
	}
}