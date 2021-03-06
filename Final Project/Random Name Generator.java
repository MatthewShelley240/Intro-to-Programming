/*
 * Matthew Shelley
 * 09/24/2019
 * Final Project, Random Name Generator
 */


import java.util.Scanner;

public class Final_Project_Name_Generator {

	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);

		String orcs = "orcs";
		String elves = "elves";
		//int syllables = 0;

		//determines if the user input is valid or not.
		boolean running = true;
		do { 
			System.out.println("What race would you like to generate a name for?");
			System.out.println("Valid answers are 'Orcs' or 'Elves'");

			String userInput = input.next();
			if (userInput.compareToIgnoreCase(orcs) == 0) {
				orcs();
				running = false;
			}
			else if (userInput.compareToIgnoreCase(elves) == 0 ) {
				elves();
				running = false;
			}
			else {
				System.out.println("Not understood, please type 'Orcs' or 'Elves'");
			}
			boolean repeat = true;
			do {
				System.out.println("Would you like to do another?");
				System.out.println("Please enter yes or no");
				String userInputRepeat = input.next();
				if (userInputRepeat.compareToIgnoreCase("yes") == 0) {
					running = true;
					repeat = false;
				}
				else if (userInputRepeat.compareToIgnoreCase("no") == 0) {
					running = false;
					repeat = false;
				}
				else {
					System.out.println("Not understood, please say yes or no.");
				}
			}while(repeat);

		}while(running);






	}
	/**
	 * Prints a random Orcish name.
	 * Based on the output from randomSyllables, 
	 * this program uses an array to determine which letters need to be vowels, 
	 * and which need to be consonants. 
	 * It then chooses a random letter and prints that letter out.
	 */

	// Generates an orcish name.
	public static void orcs() {
		char[] consonants = {'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z'};
		char[] vowels = {'a', 'e', 'i', 'o', 'u', 'y'};
		//int charNameLength = 0;

		System.out.println("How many names would you like to generate?");
		int numberOfNames = input.nextInt();

		while(numberOfNames > 0) {
			System.out.println("how many syllables do you want?");
			int userInputSyllables = input.nextInt();

			while(userInputSyllables > 0) {

				int syllableNumber = (int)Math.round(Math.random() * ((4 - 1 ) + 1)); 
				char[] syllableSize = randomSyllables(syllableNumber);

				//charNameLength += charNameLength + syllableSize.length;
				for(int i = 0; i < syllableSize.length; i++) {
					if(Character.compare(syllableSize[i], 'a') == 0) { // Determines if the character is a vowel.
						int vows = (int)Math.round(Math.random() * (6 - 1));
						syllableSize[i] = vowels[vows];
					}
					else if(Character.compare(syllableSize[i], 'b') == 0) { // Determines if the character is a consonant.
						int cons = (int)Math.round(Math.random() * (21 - 1));
						syllableSize[i] = consonants[cons];
					}

				}
				//char[] finalName = new char[charNameLength];
				for(int j = 0; j < syllableSize.length; j++) {
					System.out.print(syllableSize[j]);
				}
				userInputSyllables--;
			}
			numberOfNames--;
			System.out.println("\n");
		}
	}

	/**
	 * Prints a random Elvish name. 
	 * Based on the output from randomSyllables, 
	 * this program uses an array to determine which letters need to be vowels, 
	 * and which need to be consonants. 
	 * It then chooses a random letter and prints that letter out.
	 */

	// Generates an elvish name.
	public static void elves() {
		char[] consonants = {'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z'};
		char[] vowels = {'a', 'e', 'i', 'o', 'u', 'y'};
		//int charNameLength = 0;

		System.out.println("How many names would you like to generate?");
		int numberOfNames = input.nextInt();

		while(numberOfNames > 0) {
			System.out.println("How many syllables do you want?");
			int userInputSyllables = input.nextInt();

			while(userInputSyllables > 0) {


				// Source: https://stackoverflow.com/questions/363681/how-do-i-generate-random-integers-within-a-specific-range-in-java
				int syllableNumber = (int)Math.round(Math.random() * ((4 - 1 ) + 1)); 
				char[] syllableSize = randomSyllables(syllableNumber);

				//charNameLength += charNameLength + syllableSize.length;
				for(int i = 0; i < syllableSize.length; i++) {
					if(Character.compare(syllableSize[i], 'a') == 0) { // Determines if the character is a vowel.
						int vows = (int)Math.round(Math.random() * (6 - 1));
						syllableSize[i] = vowels[vows];
					}
					else if(Character.compare(syllableSize[i], 'b') == 0) { // Determines if the character is a consonant.
						int cons = (int)Math.round(Math.random() * (21 - 1));
						syllableSize[i] = consonants[cons];
					}

				}
				//char[] finalName = new char[charNameLength];
				for(int j = 0; j < syllableSize.length; j++) {
					System.out.print(syllableSize[j]);
				}

				userInputSyllables--;
			}
			numberOfNames--;
			System.out.println("\n");
		}
	}

	// Determines what kind of syllable is to be used.
	/** 
	 * Doesn't have an input, merely an output, which is one of four possible arrays.
	 * arrayA = {'a'}, 
	 * arrayAB = {'a', 'b'}, 
	 * arrayBA = {'b', 'a'}, 
	 * arrayBAB = {'b', 'a', 'b'},
	 * @return There are four possible returns, each one dictating an array of a specific size and type: arrayA = {'a'}, arrayAB = {'a', 'b'}, arrayBA = {'b', 'a'}, arrayBAB = {'b', 'a', 'b'},
	 */
	public static char[] randomSyllables(int temp) {

		int syllableNumber = temp;

		if(syllableNumber == 1) {
			char[] syllableA = {'a'};
			return syllableA;
		}
		else if(syllableNumber == 2) {
			char[] syllableAB = {'a', 'b'};
			return syllableAB;
		}
		else if(syllableNumber == 3){
			char[] syllableBA = {'b', 'a'};
			return syllableBA;
		}
		else {
			char[] syllableBAB = {'b', 'a', 'b'};
			return syllableBAB;
		}
	}

	/*
	 * Saving this for later. Ignore.
	public static void letters() {
		char[] consonants = {'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z'};
		char[] vowels = {'a', 'e', 'i', 'o', 'u', 'y'};		
	}


						if(Character.compare(syllableSize[i], 'q') == 0) { //My intention for this is to 
							syllableSize[i + 1] = 'u';
							i++;
							int vows = (int)Math.round(Math.random() * (6 - 1));
							syllableSize[i] = vowels[vows];
						}
						else {
							continue;
						}

		while(numberOfNames > 0) {


		System.out.println("How many names would you like to generate?");
		int numberOfNames = input.nextInt();

		numberOfNames--;
		System.out.print("\n");
			}
	 */
}
