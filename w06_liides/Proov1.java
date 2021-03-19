package w06_liides;

public class Proov1{
	public static void main(String[] arg){
//		Hoidla h=new LihtneHoidla();
		Hoidla h=new TalletavHoidla(5);
		for(int i=0; i<arg.length; i++){
			h.lisa(Integer.parseInt(arg[i]));
		}
		System.out.println(h.kysiSumma());
		if(h instanceof TalletavHoidla){
			TalletavHoidla th=(TalletavHoidla)h;
			if(th.kysiArvud().length>0){
				System.out.println(
				 "esimene arv oli "+th.kysiArvud()[0]);
			}
		}
	}
}