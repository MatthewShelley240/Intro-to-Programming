/*
 * Matthew Shelley
 * 05/03/2019
 * Solves the equation found in Exercise 1-13
 */
public class Exercise_1_13 {

	public static void main(String[] args) {
		//Solves for 3.4x + 50.2y = 44.5
		double X = ((44.5 * 0.55) - (50.2 * 5.9)) / ((3.4 * 0.55) - (50.2 * 2.1));
		
		//Solves for 2.1x + 0.55y = 5.9
		double Y = ((3.4 * 5.9) - (44.5 * 2.1)) / ((3.4 * 0.55) - (50.2 * 2.1));
		System.out.print("If 3.4x + 50.2y = 44.5 ");
		System.out.print("and 2.1x + 0.55y = 5.9,");
		System.out.println(" then x = " + X);
		System.out.println("and y = " + Y);
		
	}

}
