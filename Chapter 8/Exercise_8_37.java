/*
* Matthew Shelley
* 09/17/2019
* Exercise 8-37, tests the user's knowledge of states and capitals.
*/

import java.util.Scanner;

public class Exercise_8_37 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// array of states and their capitals
		String[][] statesAndCapitals = {
				{"Utah", "Salt Lake City"},
				{"Arizona", "Pheonix"},
				{"Arkansas", "Little Rock"},
				{"Alaska", "Juneau"},
				{"California", "Sacramento"},
				{"Colorado", "Denver"},
				{"Connecticut", "Hartford"},
				{"Delaware", "Dover"},
				{"Florida", "Tallahasse"},
				{"Georgia", "Atlanta"},
		};

		//int state = (int)Math.round(Math.random() * 10);
		//System.out.println(state);

		int state = 0;
		int totalCorrect = 0;

		boolean running = true;
		do {
			// Asks the user to input the name of the capital
			System.out.println("What is the capital of "  + statesAndCapitals[state][0]);
			String capital = input.nextLine();

			// Tests the user's input
			if(statesAndCapitals[state][1].compareToIgnoreCase(capital) == 0 && state <= 9) {
				System.out.println("That is correct");
				state++;
				totalCorrect++;
			}
			else {
				System.out.println("That is incorrect");
				state++;
			}

			if (state > 9)
				running = false;
			
		}while(running);
		
		System.out.println("The number you got correct is: " + totalCorrect);
		
	}
}
