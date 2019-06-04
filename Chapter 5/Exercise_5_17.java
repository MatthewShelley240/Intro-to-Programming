/*
 * Matthew Shelley
 * 6/03/2019
 * Exercise 5-17, froms a pyramind of numbers.
 */

import java.util.Scanner;

public class Exercise_5_17 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter an integer between 1 and 15.");
		int userInput = input.nextInt();
		int lineNumber = userInput;
		while (lineNumber >= 1 && lineNumber <= 15) {
			System.out.println(userInput - (lineNumber - 1));
			System.out.println();
			lineNumber--;
		}

	}

}
