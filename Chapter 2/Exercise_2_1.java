import java.util.Scanner;

/*
 * Matthew Shelley
 * 05/07/2019
 * Convets Celsius to Fahrenheit and vice versa.
 */


public class Exercise_2_1 {

	public static void main(String[] args) {
		//Determine if Celsius or Fahrenheit
		Scanner input = new Scanner(System.in);
		System.out.println("What is the temperture in Celsius?");
		double tempertureCel = input.nextDouble();
		double fahrenheitTemp = (9.0/5) * tempertureCel + 32;
		System.out.println(tempertureCel + " Celsius in Fahrenheit is " + fahrenheitTemp);

	}
}