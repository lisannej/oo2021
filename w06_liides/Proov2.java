package w06_liides;

import java.io.*;
public class Proov2{
	public static void main(String[] arg) throws IOException{
		Hoidla h=null;
		BufferedReader br=new BufferedReader(new FileReader(arg[0]));
		String rida=br.readLine();
		while(rida!=null){
			h.lisa(Integer.parseInt(rida));
			rida=br.readLine();
		}
		System.out.println(h.kysiSumma());
	}
}