package samples;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AdditionTest {

	@Test
	void test() {
		int expected=4;
		Addition addition=new Addition();
		int actual=addition.addition(1, 3);
		assertEquals(expected,actual,"add properly");
	
	}

}
