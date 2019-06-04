/*
 * Matthew Shelley
 * 6/03/2019
 * Exercise 5-11, finds all numbers between 100-200 that are divisible by 5 or 6.
 */

public class Exercise_5_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int tally = 100;
		int count = 0;
		//Loop for to count from 100 - 200.
		while (tally <= 200) {
			int divideBy5 = tally % 5;
			int divideBy6 = tally % 6;
			if (divideBy5 == 0 ^ divideBy6 == 0) {
				System.out.print(tally + " ");
				count++;
				if(count == 10) {
					System.out.println();
					count = 0;
				}

			}
			tally++;
		}
	}

}


