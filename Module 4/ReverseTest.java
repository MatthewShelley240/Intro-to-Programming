import static org.junit.Assert.*;

import org.junit.Test;

public class ReverseTest {

	@Test
	public void testReverse() {
		int userInput = 15151;
		
		boolean expected = true;
		
		
		assertTrue(Reverse.isPalindrome(userInput));
	}
	
	@Test
	public void testReverse2() {
		int userInput = 12345;
		
		boolean expected = false;
		
		assertFalse(Reverse.isPalindrome(userInput));
		
	}
	
	@Test
	public void testReverse3() {
		int userInput = 99;
				
		boolean expected = true;
		
		assertTrue(Reverse.isPalindrome(userInput));
		
	}
	

}
