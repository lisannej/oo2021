package w02_klass;

public class Arvutus {
		public static int Arvuta(String mark, Integer a, Integer b ){
            int tulemus = 0;
            if(mark == "+") {
                tulemus = a + b;
            }
            else if(mark == "-"){
                tulemus = a- b;
            }
            else if(mark == "*"){
                tulemus = a * b;
            }
            else if(mark == "/"){
                tulemus = a / b;
            }
            return tulemus;
        }


}
