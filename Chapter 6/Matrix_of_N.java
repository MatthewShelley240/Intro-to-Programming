/*
 * Matthew Shelley
 * 08/22/2019
 * Exercise 6-17, creates a N by N matrix of ones and zeros.
 */

import java.util.Scanner;

public class Matrix_of_N {

	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		System.out.println("Enter a valid integer.");
		int userInput = input.nextInt();
		printMatrix(userInput);

	}
	//Creates the matrix.
	private static void printMatrix(int userInput) {

		int columns = userInput;
		int rows = userInput;
		int rowsCounter = rows;

		//This first while loop controls how many rows are made.
		while(rowsCounter > 0) {
			int columnsCounter = columns;
			//This second while loop controls how many columns are made.
			while (columnsCounter > 0) {
				int randomNumber = (int)(Math.random() * 2);
				System.out.print(randomNumber + " ");
				columnsCounter--;

			}
			System.out.print("\r");
			rowsCounter--;
		}		
	}

}
