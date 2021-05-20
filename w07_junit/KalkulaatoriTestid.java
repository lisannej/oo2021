

import org.junit.*;
import static org.junit.Assert.*;

public class KalkulaatoriTestid{
	Kalkulaator k=new Kalkulaator();
	@Test
	public void sisestus1(){
		assertEquals(9.0, k.liida(3,6), 0.001);
		assertEquals(4.5, k.liida(2.1, 2.4), 0.001);
	}
	@Test
	public void sisestus2(){
		assertEquals(-6, k.lahuta(4, 10), 0.001);
		assertEquals(5, k.lahuta(10, 5), 0.001);
	}
}