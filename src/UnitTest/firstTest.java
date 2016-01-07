package UnitTest;

import static org.junit.Assert.assertEquals;

import org.junit.*;
import Test.Calculater;


public class firstTest {

	@Test
	public void testCalcPlus() {
		Calculater tester = new Calculater();
		
		assertEquals("1+1=2",2,tester.calcPlus(1,1));
	}
	
}
