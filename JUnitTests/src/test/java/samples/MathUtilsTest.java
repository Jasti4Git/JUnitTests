package samples;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.JRE;

@DisplayName("When Running MathUtils")
class MathUtilsTest {

	MathUtils utils;

	@BeforeAll
	static void beforeInit() {
		System.out.println("in before init method");

	}

	@BeforeEach
	void init() {

		utils = new MathUtils();

	}

	@Nested
	class addtest {

		@Test
		@DisplayName("Testing Add Method with positives")
		void testAdditionwithpositives() {
			int expected = 4;
			int actual = utils.addition(1, 3);
			assertEquals(expected, actual, "add properly");

		}

		@Test
		@DisplayName("Testing Add Method with negatives")
		void testAdditionwithNegatives() {
			int expected = -4;
			int actual = utils.addition(-1, -3);
			assertEquals(-4, actual, "add properly");

		}

	}

	@Test
	@DisplayName("Mutiplymethod")
	void testmultiplication() {
		
		assertAll(()->assertEquals(3,utils.muliplication(1, 3)),()->assertEquals(4,utils.muliplication(1, 4)));
		
	}
	

	@Test
	void testDivide() {
		assertThrows(ArithmeticException.class, () -> utils.divide(1, 0));

	}

	@Test
	@EnabledOnJre(JRE.JAVA_8)
	void testForJava() {
		System.out.println("Java 8 testcase");

	}

	@AfterEach
	void clear() {
		System.gc();
	}

	@AfterAll
	static void afterInit() {
		System.out.println("in after init method");

	}

}
