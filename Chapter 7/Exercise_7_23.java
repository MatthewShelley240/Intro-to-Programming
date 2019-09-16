
public class Exercise_7_23 {

	public static void main(String[] args) {

		//give that true means open locker, and false means closed locker
		boolean[] l100 = new boolean[100];

		int counterLocker = 1; //counts how many lockers

		for(int s = 0; s < 100; s++) { //tracks the student number
			for(int l = s; l < l100.length; l += counterLocker) { //counts the locker number.
				if (l100[l] == true) {
					l100[l] = false;
				}
				else {
					l100[l] = true;
				}
			}
			counterLocker++;
		}

		for(int i = 0; i < l100.length; i++) {
			if(l100[i] == true)
				System.out.println("locker " + (i + 1) + " is open");
		}
	}
}