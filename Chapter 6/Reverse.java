/*
 * Matthew Shelley
 * 08/22/2019
 * Intro to Java Programming Exercise 6-3. Determines if an integer is a palindrome.
*/

import java.util.Scanner;

public class Reverse {

	private static Scanner input;



	public static void main(String[] args) {

		input = new Scanner(System.in);

		System.out.println("What is the number you wish to test?");
		int userInput = input.nextInt();
		if (isPalindrome(userInput) == true)
				System.out.println(userInput + " is a palindrome!");
		else {
			System.out.println(userInput + " is not a palindrome!");
			}
	}


	//Inverses userInput into intInverseUI.
	public static int reverse(int number) {
		String stringOfUI = Integer.toString(number);
		int letterCount = stringOfUI.length() - 1;
		int temp = letterCount;

		String inverseUI = "";

		while(temp >= 0) {
			inverseUI = inverseUI + stringOfUI.charAt(temp);
			temp--;
		}
		int intInverseUI = Integer.parseInt(inverseUI, 10);
		return(intInverseUI);
	}

	//Tests if userInput is a palindrome.
	public static boolean isPalindrome(int userInput) {
		int inverseUI = reverse(userInput);
		
		if (userInput == inverseUI)
			return(true);
		else {return(false);}
	}
}





/*
 * //Determines if userInput is a valid Integer.
		int palindromeBala = isPalindrome(userInput, inverseUI);
		//Bala is a word from the Filipino dialect Hiligaynon, it's literally a spoken question mark.


		if (palindromeBala == 0)
			System.out.println(userInput + " is a palindrome!");
		else {
			System.out.println(userInput + " is not a palindrome!");
		}

 */
