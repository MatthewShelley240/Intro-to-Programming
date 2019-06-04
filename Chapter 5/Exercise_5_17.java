/*
 * Matthew Shelley
 * 6/03/2019
 * Exercise 5-17, froms a pyramind of numbers.
 */

import java.util.Scanner;

public class Exercise_5_17 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);


		//Prompts the user to input a integer between 1 and 15.
		System.out.println("Enter an integer between 1 and 15.");
		int userInput = input.nextInt();
		int lineNumber = 1;
		
		//Outer loop
		boolean outerLoop = true;
		do {
		System.out.println(lineNumber);
		
		
		//This is the 3rd loop done. Counts the right half of the pyramid.
				boolean running = true;
				do {
					int count = userInput;
					
					 int loop3 = userInput - (userInput - 1) + 1;
					boolean running2 = true;
					do {
						System.out.print(loop3 + " ");
						loop3++;
						if(loop3 > userInput)
							running2 = false;
					}while(running2);
					System.out.println();
		
					
		//continuation of outer loop 
		System.out.println();
		lineNumber++;
		if(lineNumber > 15)
			outerLoop = false;
		}while(outerLoop);
		
		



	//	}while(running);

		System.out.print("End of Program");


		
		//while (lineNumber >= 1 && lineNumber <= 15) {
		// 1st Inner loop

		//System.out.printf("%3d", userInput);
		
	}
}


/* Code for loop 3
 * int start = 2
 * while (start == 2 && start <= 15) {
 * 		System.out.print(start + " ");
 * 		start++;
 * }
 * System.out.println();
 */
