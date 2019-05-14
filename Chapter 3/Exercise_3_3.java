import java.util.Scanner;

/*
 * Matthew Shelley
 * 05/13/2019
 * Exercise 3-3 Cramer's Rule.
 */
public class Exercise_3_3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Welcome to this calculator that will solve two linear equations via Cramer's Rule.");

		//Asks user if they want to start.
		Boolean start = true;
		do
		{
			System.out.println("Would you like to start the program");
			System.out.println("Please enter yes or no.");
			String beginOrNo = input.next();

			//Closes the program
			if(beginOrNo.compareToIgnoreCase("No") == 0) {
				start = false;
			}
			//Begins the program
			else if(beginOrNo.compareToIgnoreCase("Yes") == 0) {


				System.out.println("Please input the value for a, b, c, d, e, and f.");

				Boolean running = true;
				do
				{
					//Asks user for variables.
					System.out.println("What is the value of a?");
					double a = input.nextDouble();
					System.out.println("What is the value of b?");
					double b = input.nextDouble();
					System.out.println("What is the value of c?");
					double c = input.nextDouble();
					System.out.println("What is the value of d?");
					double d = input.nextDouble();
					System.out.println("What is the value of e?");
					double e = input.nextDouble();
					System.out.println("What is the value of f?");
					double f = input.nextDouble();

					final double denominator = ((a * d) - (b * c));

					//Determines if possible to solve.
					if(denominator == 0) {
						System.out.println("Result is unsolvable. Please enter in valid integers.");
					}				
					else{
						//Solves via Cramer's Rule.
						double X = (((e * d) - (b * f)) / denominator);
						double Y = (((a * f) - (e * c)) / denominator);
						System.out.println("X = " + X + " Y = " + Y);

						//Asks if user wants to continue.
						Boolean repeat = true;
						do
						{
							System.out.println("Would you like to do another?");
							System.out.println("Please enter yes or no.");
							String yesOrNo = input.next();

							if(yesOrNo.compareToIgnoreCase("No") == 0) {
								repeat = false;
								running = false;
								//Confirms the closing of the program.
								System.out.println("Are you sure you want to quit?");
								System.out.println("Please enter yes or no.");
								String quit = input.next();
								if(quit.compareToIgnoreCase("yes") == 0) {
									start = false;
								}
							}
							//Continues the program.
							else if(yesOrNo.compareToIgnoreCase("Yes") == 0) {
								running = true;
								repeat = false;
							}
							else {
								System.out.println("Not understood, please try again.");
							}
						}while(repeat);

					}
				}while(running);

			}
			else {
				System.out.println("Not understood, please try again.");
			}
		}while(start);

	}
}