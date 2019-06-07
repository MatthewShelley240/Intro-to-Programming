/*
 * Matthew Shelley
 * 6/07/2019
 * Exercise 5-17, forms a pyramid of numbers.
 */

import java.util.Scanner;

public class Exercise_5_17 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		//Prompts the user to input a integer between 1 and 15.
		System.out.println("Enter an integer between 1 and 15.");
		int userInput = input.nextInt();

		//Determines if integer is valid
		if (userInput <= 1 || userInput >= 15) {
			System.out.println("Not understood, please try again.");
		}

		//If integer is valid prints the pyramid.
		else {
			int lineNumber = 1;

			//Outer loop
			boolean outerLoop = true;
			do {
				int counter = 0;

				//This part of the code controls how many spaces happen at the beginning of each line.
				for(int spacesCounter = lineNumber; spacesCounter < 15; spacesCounter++) 
					System.out.print("   ");

				//This part of the code controls the left side of the counting on the pyramid.
				//For example, 15-1, or 5-1.
				do {
					System.out.printf("%3d", lineNumber - counter);
					counter++;

				}while(counter < lineNumber);

				//This part of the code controls the counting of the right side of the pyramid.
				//For example, 2-15, or 2-5.
				if (lineNumber > 1) {
					int counter2 = 2;
					do {
						System.out.printf("%3d", counter2);
						counter2++;
					}while (counter2 <= lineNumber);
				}


				//continuation of outer loop 
				System.out.println();
				lineNumber++;
				if(lineNumber > userInput)
					outerLoop = false;
			}while(outerLoop);
		}

		System.out.print("End of Program");

	}
}
