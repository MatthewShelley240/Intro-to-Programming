import java.util.Scanner;

public class Exercise_07_5 {

	//private static Scanner input;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int n = 10;
		//counts the distinct numbers. There should always be at least one.
		int counterDN = 0;
		//array that the user inputs
		int[] arrayUserInput = new int[10];
		//array of distinct numbers
		int[] arrayDistinctNumbers = new int[10];

		int zeroCounter = 0;

		//prompts the user to input the initial value of the first array.
		System.out.println("Enter 10 integers seperated by spaces.");
		for (int i = 0; i < n; i++) {
			arrayUserInput[i] = input.nextInt();
		}
		int countAUI = 0;
		boolean exists;
		for(int countADN = 0; countADN < 10; countADN++) { //counter for arrayDistinctNumbers
			exists = false;
			for(countAUI = 0; countAUI < 10; countAUI++) { //counter for arrayUserInput
				if (arrayUserInput[countADN] == arrayDistinctNumbers[countAUI]) {
					exists = true;
					break;
					/*if(arrayUserInput[countAUI] == 0) {
						zeroCounter++;
					}*/
				}
				/*else {
					//System.out.println(counterDN + " " + countADN);
					arrayDistinctNumbers[countADN] = arrayUserInput[countAUI];
					System.out.println(arrayDistinctNumbers[countADN]);
				}*/
			}
			if(exists == false) {
				arrayDistinctNumbers[counterDN] = arrayUserInput[countADN];
				counterDN++;
				
			}
		}
		
		System.out.println("The number of distinct numbers is " + counterDN);
		for(int i = 0; i < counterDN; i++) {
			System.out.print(arrayDistinctNumbers[i] + " ");
		}
	}
}

/*
 * 
		for(int i = 0; i < 10; i++) {
			if (arrayDistinctNumbers[i] != 0) {
				counterDN++;
			}
			
			
*/

/*
 * 
*/