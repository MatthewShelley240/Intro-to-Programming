import static org.junit.Assert.*;

import org.junit.Test;

public class ReverseTest {

	@Test
	public void testReverse() {
		int userInput = 15151;
		
		boolean expected = true;
		boolean result = Reverse.isPalindrome(userInput);
		
		assertTrue(Reverse.isPalindrome(userInput));
	}
	
	@Test
	public void testReverse2() {
		int userInput = 12345;
		
		boolean expected = false;
		boolean result = Reverse.isPalindrome(userInput);
		
		assertFalse(Reverse.isPalindrome(userInput));
		
	}

}
