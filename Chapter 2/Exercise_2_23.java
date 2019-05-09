/*
 * Matthew Shelley
 * 05/07/2019
 * Cost of driving Exercise 2-23
 */
import java.util.Scanner;

public class Exercise_2_23 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//Asks user for details pertaining to their trip
		System.out.println("How many people will pay for gas?");
		double people = input.nextDouble();
		System.out.println("How far are you traveling?");
		double distance = input.nextDouble();
		System.out.println("How many mile per gallon is your vehicle?");
		double milesPerGallon = input.nextDouble();
		System.out.println("What is the current price per gallon of gas?");
		double pricePerGallon = input.nextDouble();
		//Calculates total price of trip
		double totalTripPrice = ((distance / milesPerGallon) * pricePerGallon) / people;
		System.out.println(totalTripPrice);


	}

}
