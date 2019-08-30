package samples;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MathUtilsTest {
	
	MathUtils utils;
	
	
	@BeforeAll
	static void beforeInit()
	{
		System.out.println("in before init method");
		
	}
	@BeforeEach
	void init() {
		
		 utils=new MathUtils();

	}

	@Test
	void testAddition() {
		int expected=4;
		int actual=utils.addition(1, 3);
		assertEquals(expected,actual,"add properly");
	
	}

	@Test
	void testDivide() {
		assertThrows(ArithmeticException.class, ()->utils.divide(1, 1));
	
	}
	
	@AfterEach
	void clear()
	{
		System.gc();
	}
	
	@BeforeAll
	static void afterInit()
	{
		System.out.println("in after init method");
		
	}
	
}
