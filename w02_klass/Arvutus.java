package w02_klass;
import java.lang.Math;

public class Arvutus {
		public static int arvuta(String mark, Integer a, Integer b ){
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
