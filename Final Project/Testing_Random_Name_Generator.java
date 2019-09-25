import static org.junit.Assert.*;

import org.junit.Test;

public class Testing_Random_Name_Generator {

	@Test
	/**
	 * Junit testing for the method randomSyllables
	 */
	public void testFinal_Project_Name_Generator() {
		char[] temp1 = {'a'};
		char[] temp2 = {'a', 'b'};
		char[] temp3 = {'b', 'a'};
		assertArrayEquals(Final_Project_Name_Generator.randomSyllables(1), temp1);
		assertArrayEquals(Final_Project_Name_Generator.randomSyllables(2), temp2);
		assertArrayEquals(Final_Project_Name_Generator.randomSyllables(3), temp3);
		
		//ssertTrue( Arrays.equals(birdList1.getMostOfSpecies("SOBI"), yourSightingArray)
		}

}
