import java.util.Scanner;

/*
 * Matthew Shelley
 * 05/13/2019
 * Exercise 3-13, determines if triangle is valid and if so determines its perimeter.
 */
public class Exercise_3_13 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		Boolean start = true;
		do
		{
			//Promts the user to begin program
			System.out.println("This program is to caculate the perimeter of a triangle.");
			System.out.println("Would you like to begin?");
			System.out.println("Please enter yes or no.");
			String beginOrNo = input.next();
			if(beginOrNo.compareToIgnoreCase("Yes") == 0) {
				//Prompts user for information.
				Boolean triangleCalc = true;
				do
				{
					System.out.println("Please input the values for Side A, B and C.");
					System.out.println("What is the value of side A?");
					double sideA = input.nextDouble();
					System.out.println("What is the value of side B?");
					double sideB = input.nextDouble();
					System.out.println("What is the value of side C?");
					double sideC = input.nextDouble();

					final boolean invalid1 = sideA + sideB <= sideC;
					final boolean invalid2 = sideB + sideC <= sideA;
					final boolean invalid3 = sideC + sideA <= sideB;

					//Determines if triangle is valid
					
						//If not valid, this is what happens
					if((invalid1) || (invalid2) || (invalid3)) {
						Boolean restart = true;
						do
						{
							System.out.println("Triangle is invalid, please try again.");
							System.out.println("Would you like to do another.");
							System.out.println("Please enter yes or no.");
							String quit = input.next();
							if(quit.compareToIgnoreCase("Yes") == 0) {
								restart = false;
								triangleCalc = true;
								start = true;
							}
							else if(quit.compareToIgnoreCase("No") == 0) {
								restart = false;
								triangleCalc = false;
								start = false;
							}
							else {
								System.out.println("Not understood, please try again.");
							}
						}while(restart);
					}

						//If valid, this is what happens
					else {
						Boolean perimeterOfTriangle = true;
						do
						{
							System.out.println("The perimeter of the triangle is " + (sideA + sideB + sideC));
							triangleCalc = false;
							System.out.println("Would you like to do another?");
							System.out.println("Please enter yes or no");
							String another = input.next();
							if(another.compareToIgnoreCase("Yes") == 0) {
								perimeterOfTriangle = false;
								triangleCalc = true;
							}
							else if (another.compareToIgnoreCase("No") == 0) {
								perimeterOfTriangle = false;
								triangleCalc = false;
								start = false;
							}
							else {
								System.out.println("Not understood, please try again.");
							}
						}while(perimeterOfTriangle);
					}

				}while(triangleCalc);


			}
			else if(beginOrNo.compareToIgnoreCase("No") == 0){
				start = false;
			}
			else {
				System.out.println("Not understood, please try again");

				start = true;
			}

		}while(start);
	}
}
