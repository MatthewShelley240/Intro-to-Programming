import java.util.Scanner;

/*
 * Matthew Shelley
 * 05/14/219
 * Exercise 4-1, calculates the area of a pentagon
 */
public class Exercise_4_1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		final double pi = 3.14159;
		
		//Prompts the user to input the value of r.
		System.out.println("What is the distance from the center to a vertex of a pentagon?");
		double radius = input.nextDouble();
		
		//Calculates the area and side length of the pentagon
		double side = (2 * radius) * Math.sin(pi / 5);
		double area =  ((5 * Math.pow(side, 2)) / (4 * Math.tan(pi / 5)));
		
		//Prints area of Pentagon
		System.out.println("The area of this pentagon is " + area);
	}

}
