package samples;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MathUtilsTest {

	@Test
	void testAddition() {
		int expected=4;
		MathUtils addition=new MathUtils();
		int actual=addition.addition(1, 3);
		assertEquals(expected,actual,"add properly");
	
	}

	@Test
	void testDivide() {
		MathUtils division=new MathUtils();
		assertThrows(ArithmeticException.class, ()->division.divide(1, 1));
	
	}
	
}
