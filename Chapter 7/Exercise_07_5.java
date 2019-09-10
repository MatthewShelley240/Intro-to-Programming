import java.util.Scanner;

public class Exercise_07_5 {

	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);

		int n = 10;
		//counts the distinct numbers. There should always be at least one.
		int counterDN = 0;
		//array that the user inputs
		int[] arrayUserInput = new int[10];
		//this is the array of distinct numbers
		int[] arrayDistinctNumbers = new int[10];
		//this is the number of distinct numbers
		int distinctNumbers = counterDN;


		//prompts the user to input the initial value of the first array.
		System.out.println("Enter 10 integers seperated by spaces.");
		for (int i = 0; i < n; i++) {
			arrayUserInput[i] = input.nextInt();
		}

		//THis loop is to print out the user input array.
		Boolean running3 = true;
		do {
			for(int counter1 = 0; counter1 < 10; counter1++) {
				System.out.print(arrayUserInput[counter1] + " ");
			}
			System.out.print(" This is the Array arrayUserInput ");
			System.out.println();
			running3 = false;
		}while(running3);

		
		/*My intent for this code was to set the first value of the second array to
		 *the same value as the first value of the first array. So this is also why
		 *counterDN is set to the value of one.
		 */
		//arrayUserInput[counterDN] = arrayDistinctNumbers[counterDN];
		//counterDN++;
		
		//This is to print out the first value of arrayUserInput
		//System.out.println(arrayUserInput[counterDN] + " first value of arrayUserInput.");

		//prints the first value of array distinctNumbers
		//System.out.print(arrayDistinctNumbers[0]);
		//System.out.print(" The is printing the first value of arrayDistinctNumbers");
		//System.out.println();
		

		//begins the process of copying arrayUserInput to arrayDistinctNumbers
		Boolean running = true;
		do {
			int distinctNumberCounter = 0;
			for(int counter1 = 0; counter1 < 10; counter1++) {
				/*
				 * My intent for this second for loop was to determine if the next value in
				 * arrayUserInput was a repeat of a previously inserted number.
				 */
				for(int counter2 = 0; counter2 < counter1; counter2++) {
					//meant to test that.
					if (arrayUserInput[counter1] == arrayDistinctNumbers[counter2]) {
						counter2++;
					}
					/*if it wasn't a duplicate, it was supposed to insert the number into
					 *the next available point in arrayDistinctNumbers, it's also meant
					 *to increment counterDN by one so that it would display the new amount
					 *of distinct numbers
					 */
					else {
						arrayUserInput[counter1] = arrayDistinctNumbers[distinctNumberCounter];
						counterDN++;
						distinctNumberCounter++;
					}
				}
				//prints out the array for the print bug finding process.
				//Delete later
				System.out.print(arrayDistinctNumbers[counter1] + " ");
			}
			//also irrelevant, delete later when finished.
			System.out.println("arrayDistinNumbers");
			running = false;
		}while(running);

		//Prints the number of Distinct Numbers
		System.out.println(counterDN + " CounterDN");

		//final array that is printed
		int[] arrayFinal = new int [distinctNumbers];


		//prints the array arrayFinal. Which should house all the distinct numbers.
		Boolean running2 = true;
		do {
			for(int counter1 = 0; counter1 < distinctNumbers; counter1++) {
				arrayDistinctNumbers[counter1] = arrayFinal[counter1];
				System.out.print(arrayFinal[counter1] + " ");
			}
			System.out.println("This is the final array");
			running2 = false;
		}while(running2);

	}

}


/*
for(int count1 = 0; count1 < 10; count1++) {
	int count2 = 0;
	while(count2 < 10) {
		if(arrayOne[count1] == arrayOne[count2]) {
			distinctNumbers++;
			count2++;
		}
		else count2++;
	}
}
System.out.println(distinctNumbers);
 */

/*
String numbersInArray = "";
int distinctNumbers = 0;

for(int temp = 0; temp < 10; temp++) {
	numbersInArray += arrayOne[temp] + " ";
}	

boolean compareArray = true;
do
{
	for(int tester = 0; tester < 10; tester++) {
		int tester2 = 1;
		while(tester2 < 9) {
			 if(arrayOne[tester] == arrayOne[tester2]) {
			 	distinctNumbers++;
			 	break;
			 }
			 else {
				 tester2++;
			 }

		}
	}
}while(compareArray);


System.out.println(numbersInArray);
System.out.println("distinctNumbers");
System.out.println("Array without duplicates");
 */