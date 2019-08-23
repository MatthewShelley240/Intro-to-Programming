import java.util.Scanner;

public class Converting_Milliseconds {

	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		System.out.println("Enter the number of Milliseconds you wish to count.");
		Long time = input.nextLong();
		convertMillis(time);

	}

	public static String convertMillis(long time) {
		// TODO Auto-generated method stub
		long milliseconds = time;
		long totalSeconds = milliseconds / 1000;
		long currentSecond = totalSeconds % 60;
		long totalMinutes = totalSeconds / 60;
		long currentMinute = totalMinutes % 60;
		long totalHours = totalMinutes / 60;
		System.out.println(totalHours + ":" + currentMinute + ":" + currentSecond);
		
		return null;
	}

}
