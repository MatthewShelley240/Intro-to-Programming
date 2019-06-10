/*
 * Matthew Shelley
 * 6/07/2019
 * Exercise 5-49. Counts the number of vowels and consonants in a word inputed by a user.
 */
import java.util.Scanner;

public class Exercise_5_49 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		//Prompts user to input a word
		System.out.println("Enter a word.");
		String userInput = input.next();
		String capitalUI = userInput.toUpperCase();
		
		int numOfCons = 0;
		int numOfVows = 0;
		int letterCount = 0;

		int terminate = capitalUI.length();
		do {
			if (letterCount <= terminate) {
				
				char c = capitalUI.charAt(letterCount);
				if (Character.isAlphabetic(c)) {
				if(c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')
					numOfVows++;
				else
					numOfCons++;
				
				letterCount++;
				}

				
			}
			else {
				System.out.println("End of program.");
				break;
			}
		}while(letterCount < terminate);
		
		//Tells the user how many vowels and consonants a word has.1
		System.out.println("The word " + userInput + " has " + numOfCons + " consonant/s.");
		System.out.println("It also has " + numOfVows  + " vowel/s.");
	}

}

