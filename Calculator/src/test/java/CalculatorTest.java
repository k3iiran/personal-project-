import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest {
	@Test
	public void multiplication() {
		Calculator calc=new Calculator();
		assertEquals("multiply failed",8, calc.multiply(2,4));
	}
	@Test
	public void addTest() {
		Calculator calc = new Calculator();
		assertEquals("Add failed",15,calc.add(7,8));
	}
}
