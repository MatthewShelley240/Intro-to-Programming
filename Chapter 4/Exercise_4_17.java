/*
 * Matthew Shelley
 * 5/20/2019
 * Exercise 4-17, determines the number of days in a given month.
 */
import java.util.Scanner;

public class Exercise_4_17 {

	public static void main(String[] args) {
		//prompts the user for the date.

		Scanner input = new Scanner(System.in);

		System.out.println("Enter a year.");
		double year = input.nextDouble();
		System.out.println("Enter a month.");
		String month = input.next();

		//Determines the month
		Boolean running = true;
		do
		{
			// All months that have 31 days
			if(month.compareTo("Jan") == 0) {
				System.out.println(month + " " + year + " has 31 days.");
				running = false;
			}
			else if(month.compareTo("Mar") == 0) {
				System.out.println(month + " " + year + " has 31 days.");
				running = false;
			}
			else if(month.compareTo("Jul") == 0) {
				System.out.println(month + " " + year + " has 31 days.");
				running = false;
			}
			else if(month.compareTo("Aug") == 0) {
				System.out.println(month + " " + year + " has 31 days.");
				running = false;
			}
			else if(month.compareTo("Oct") == 0) {
				System.out.println(month + " " + year + " has 31 days.");
				running = false;
			}
			else if(month.compareTo("Dec") == 0) {
				System.out.println(month + " " + year + " has 31 days.");
				running = false;
			}
			//February
			else if(month.compareTo("Feb") == 0) {
				//Determines if year is a leap year.
				Boolean leapYearOrNo = true;
				do
				{
					if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
						System.out.println(month + " " + year + " has 29 days.");
						running = false;
						leapYearOrNo = false;
					}
					else {
						System.out.println(month + " " + year + " has 28 days.");
						running = false;
						leapYearOrNo = false;
					}
				}while(leapYearOrNo);

			}
			//All months with 30 days
			else {
				System.out.println(month + " " + year + " has 30 days.");
				running = false;
			}

		}while(running);

	}
}