package UnitTest;

import static org.junit.Assert.assertEquals;

import org.junit.*;
import Test.Calculater;




public class firstTest{

	Calculater calc;
	
	@Before
	public void setup() {
		calc = new Calculater();
	}
	
	@After
	public void tearDown() {
		
	}
	
	
	@Test
	public void testCalcPlus() {		
		assertEquals("1+1=2",2,calc.calcPlus(1,1));
	}
	
	@Test (expected = ArrayIndexOutOfBoundsException.class)
	public void testGetLastResult() {
		calc.getLastResult();
	}
	
}
