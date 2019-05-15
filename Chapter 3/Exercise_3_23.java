import java.util.Scanner;

/*
 * Matthew Shelley
 * 05/14/2019
 * Exercise 3-23, determines whether a point is located inside a rectangle.
 */
public class Exercise_3_23 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		//rectangle size
		final double widthStartingPoint = -5;
		final double widthEndingPoint = 5;
		final double lengthStartingPoint = -2.5;
		final double lengthEndingPoint = 2.5;

		//Inquires the point to be located
		Boolean start = true;
		do
		{
			System.out.println("What is the value of X and Y in your coordinate?");
			double pointX = input.nextDouble();
			double pointY = input.nextDouble();

			//Determines if point (X,Y) is in the rectangle.

			Boolean running = true;
			do
			{
				final Boolean invalid1 = pointX > widthEndingPoint;
				final Boolean invalid2 = pointX < widthStartingPoint;
				final Boolean invalid3 = pointY > widthEndingPoint;
				final Boolean invalid4 = pointY < widthStartingPoint;


				if(invalid1 || invalid2 || invalid3 || invalid4) {
					System.out.println("Point (" + pointX + ", " + pointY +") is not part of the rectangle.");
					System.out.println("Would you like to do another?");
					//Asks to restart program
					Boolean restart = true;
					do
					{
						String repeat = input.next();
						if(repeat.compareToIgnoreCase("Yes") == 0) {
							restart = false;
							running = false;
							start = true;
						}
						else if(repeat.compareToIgnoreCase("No") == 0) {
							running = false;
							restart = false;
							System.out.println("Farewell.");
							start = false;
						}
						else {
							System.out.println("Not understood, please try again.");
						}
					}while(restart);
				}
				else {
					System.out.println("Point (" + pointX + ", " + pointY +") is part of the rectangle.");
					System.out.println("Would you like to do another?");
					Boolean restart = true;
					do
					{
						String repeat = input.next();
						if(repeat.compareToIgnoreCase("Yes") == 0) {
							restart = false;
							running = false;
							start = true;
						}
						else if(repeat.compareToIgnoreCase("No")  == 0) {
							running = false;
							restart = false;
							System.out.println("Farewell.");
							start = false;
						}
						else {
							System.out.println("Not understood, please try again.");
						}
					}while(restart);

				}

			}while(running);

		}while(start);

	}
}
