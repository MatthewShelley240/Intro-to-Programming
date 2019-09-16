import java.util.Scanner;

public class Exercise_7_15 {
	
		//private static Scanner input;

		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);

			
			//array that the user inputs
			int[] arrayUserInput = new int[10];
			//Counts the distinct number
			
			
			
			//prompts the user to input the initial value of the first array.
			System.out.println("Enter 10 integers seperated by spaces.");
			for (int i = 0; i < arrayUserInput.length; i++) {
				arrayUserInput[i] = input.nextInt();
			}
			
			//array that is returned from the method eliminateDuplicates.
			int[] arrayDistinctNumbers = eliminateDuplicates(arrayUserInput);
			
			System.out.println("The number of distinct numbers is " + arrayDistinctNumbers.length);
			for(int i = 0; i < arrayDistinctNumbers.length; i++) {
				System.out.print(arrayDistinctNumbers[i] + " ");
			}
		}
	
	public static int[] eliminateDuplicates(int[] list) {
	
		
		//counts the distinct numbers. There should always be at least one.
		int counterDN = 0;
		//array of distinct numbers
		int[] arrayDistinctNumbers = new int[10];
		//array for user input.
		int[] arrayUserInput = list;
		//counts zeros
		int zeroCounter = 0;


		int countAUI = 0;
		boolean exists;
		for(int countADN = 0; countADN < 10; countADN++) { //counter for arrayDistinctNumbers
			exists = false;
			for(countAUI = 0; countAUI < 10; countAUI++) { //counter for arrayUserInput
				if (arrayUserInput[countADN] == arrayDistinctNumbers[countAUI]) {
					if (arrayUserInput[countADN] == 0) { //this if statement merely checks for zeros in the original array.
						zeroCounter++;
						exists = true;
						break;
					}
					else {
					exists = true;
					break;
					}
				}
			}
			if(exists == false) {//this adds a distinct number to the array
				arrayDistinctNumbers[counterDN] = arrayUserInput[countADN];
				counterDN++;
				
			}
		}
		if (zeroCounter > 0) {
			counterDN++;
		}
		
		int[] arrayReturn = new int[counterDN]; //removes all extra zeros found in the array that the user inputs.
		for(int a = 0; a < arrayReturn.length; a++) {
			arrayReturn[a] = arrayDistinctNumbers[a];
		}
		
		return arrayReturn;
	}
}
