/*
 * Matthew Shelley
 * 08/22/2019
 * Exercise 6-37. Formats an integer.
 */
import java.util.Scanner;

public class Format_An_Integer {

	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		System.out.println("What is the number you want to format?");
		int numberUI = input.nextInt();
		System.out.println("What is the number you want the width to be?");
		int widthUI = input.nextInt();
		
		format(numberUI, widthUI);
		
		
		
		
		
		//int word = 12;
		//System.out.printf("%9d", word);

	}

	private static void format(int numberUI, int widthUI) {
		// TODO Auto-generated method stub
		String userInput = Integer.toString(numberUI);
		int X = userInput.length();
		int Y = widthUI;
		int Z = Y - X;
		
		if (X >= Y) {
			System.out.println(numberUI);
		}
		else {
			while(Z > 0) {
				System.out.print(0);
				Z--;
			}
			System.out.print(numberUI);
		}
		
	}

}
/*
 * if x >= y, then print x. If x < y. Count characters, set to variable z. y - z = number of zeros. Print x
 */
