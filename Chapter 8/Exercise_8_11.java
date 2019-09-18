import java.util.Scanner;

public class Exercise_8_11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		boolean running = true;
		do {
			System.out.println("Please enter an integer between 1 and 512.");
			int userInput = input.nextInt();

			if(userInput < 0 || userInput > 512) {
				System.out.println("Not understood, please try again.");

			}
			else {
				String b = "000000000" + Integer.toBinaryString(userInput);
				b = b.substring(b.length() - 9);
				System.out.println(b);

				int counter = 0;
				char[][] arrayUserInput = new char[3][3];
				for(int i = 0; i < 3; i++) {
					for(int j = 0; j < 3; j++) {
						arrayUserInput[i][j] = b.charAt(counter);
						counter++;
					}
				}

				for(int i = 0; i < 3; i++) {
					for(int j = 0; j < 3; j++) {
						if (arrayUserInput[i][j] == '1') {
							System.out.print("T ");
						}
						else {
							System.out.print("H ");
						}
					}
					System.out.print("\n");
				}


				running = false;
			}
		}while(running);
	}
}
