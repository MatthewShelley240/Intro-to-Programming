/*
 * Matthew Shelley
 * 05/07/2019
 * Calculates the compound interest of a saving account over six months
 */
import java.util.Scanner;


public class Exercise_2_13 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("What is the monthly savings?");
		double monthlySavings = input.nextDouble();
		//IR is short for Interest Rate
				final double IR = 1.00417;
		//Calculating the total savings over six months
		double monthOne = monthlySavings * IR;
		double monthTwo = (monthlySavings + monthOne) * IR;
		double monthThree = (monthlySavings + monthTwo) * IR;
		double monthFour = (monthlySavings + monthThree) * IR;
		double monthFive = (monthlySavings + monthFour) * IR;
		double monthSix = (monthlySavings + monthFive) * IR;
		double totalSavings = monthSix; 
		System.out.println(totalSavings);

	}

}