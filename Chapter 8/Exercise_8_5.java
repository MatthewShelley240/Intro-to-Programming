/*
 * Matthew Shelley
 * 09/16/19
 * Exercise 8-5, adding matricies.
 */

import java.util.Scanner;

public class Exercise_8_5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("How many rows are in the matricies?");
		int matrixSizeRow = input.nextInt(); // determines the size of the matricies

		System.out.println("How many columns are in the matricies?");
		int matrixSizeColumn = input.nextInt();

		// The Matricies.
		double[][] matrixA = new double[matrixSizeRow][matrixSizeColumn];
		double[][] matrixB = new double[matrixSizeRow][matrixSizeColumn];

		// Prompts users for Matrix A
		System.out.println("What are the values of the Matrix a? Please seperate numbers by a space.");
		for(int row = 0; row < matrixSizeRow; row++) {
			System.out.println("What are the values of row " + (row + 1));
			for(int column = 0; column < matrixSizeColumn; column++) {
				matrixA[row][column] = input.nextDouble();
			}
		}

		// Prompts users for Matrix B
		System.out.println("What are the values of the Matrix B? Please seperate numbers by a space.");
		for(int row = 0; row < matrixSizeRow; row++) {
			System.out.println("What are the values of row " + (row + 1));
			for(int column = 0; column < matrixSizeColumn; column++) {
				matrixB[row][column] = input.nextDouble();
			}
		}

		// Prints Matrix A
		System.out.println("Matrix A is: ");
		for(int row = 0; row < matrixSizeRow; row++) {
			for(int column = 0; column < matrixSizeColumn; column++) {
				System.out.print(matrixA[row][column] + " ");
			}
			System.out.print("\n");
		}

		System.out.print("\n");


		// Prints Matrix B
		System.out.println("Matrix B is: ");
		for(int row = 0; row < matrixSizeRow; row++) {
			for(int column = 0; column < matrixSizeColumn; column++) {
				System.out.print(matrixB[row][column] + " ");
			}
			System.out.print("\n");
		}

		double[][] matrixC = new double[matrixSizeRow][matrixSizeColumn];
		matrixC = addMatrix(matrixA, matrixB);

		// Prints Matrix C
		System.out.println("\n" + "Matrix C is: ");
		for(int row = 0; row < matrixSizeRow; row++) {
			for(int column = 0; column < matrixSizeColumn; column++) {
				System.out.print(matrixC[row][column] + " ");
			}
			System.out.print("\n");
		}




	}

	// Simply adds two matricies together.
	public static double[][] addMatrix(double[][] a, double[][] b) {
		double[][] matrixC = a;
		double[][] matrixD = b;
		double[][] matrixReturn = new double[a.length][b.length];

		for(int column = 0; column < a.length; column++) {
			for(int row = 0; row < a.length; row++) { 
				matrixReturn[row][column] = matrixC[row][column] + matrixD[row][column];

			}
		}
		return matrixReturn;
	}

}
