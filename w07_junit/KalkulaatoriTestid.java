
package w07_junit;

import junit.*;
import static junit.Assert.*;

public class KalkulaatoriTestid{
	Kalkulaator k=new Kalkulaator();
	@Test
	public void sisestus1(){
		assertEquals("9", k.liida(3, 6));
		assertEquals("4.5", k.liida(2.1, 2.4));
	}
	@Test
	public void sisestus2(){
		assertsEquals("-6", k.lahuta(4, 10));
		assertEquals("5", k.lahuta(10, 5));
	}
}