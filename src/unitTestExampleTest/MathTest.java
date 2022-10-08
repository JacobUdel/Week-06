package unitTestExampleTest;

import static org.junit.jupiter.api.Assertions.*;
import unitTestExample.Math;

import org.junit.jupiter.api.Test;

class MathTest {
	Math math = new Math();
	
	@Test
	void testMustiplyReturnsCorrectAnswer() {
		int product = math.multiply(2, 5);
		assertEquals(10, product);
	}

//	@Test
//	void testDivideReturnsCorrectAnswer() {
//		double result = math.divide(5.0, 2.0);
//		assertEquals(2.5, result);
//	}
//	
	@Test
	void testIsPositiveReturnsTrueIfArgIsPositive() {
		int a = 5;
		assertTrue(math.isPositiveNumber(a));
	}
	
	@Test
	void testDivideThrowsExceptionDivideBy0() {
		assertThrows(ArithmeticException.class, ()-> math.divide(5, 0));
	}
}
