import java.util.Scanner;

/*
 * exam1 tester class
 */
public class exam1 {
	public static void main(String[] args) {
		TimeOfDay t1 = new TimeOfDay(10, 20, 30);
		TimeOfDay t2 = new TimeOfDay(30, 40, 50); // Only show time in range 00:00:00 - 23:59:59

		// Print two time of day
		System.out.println("t1 is " + t1.getHours() + ":" + t1.getMinutes() + ":" + t1.getSeconds());
		System.out.println("t2 is " + t2.getHours() + ":" + t2.getMinutes() + ":" + t2.getSeconds());

		//Enter seconds to add
		System.out.print("Enter seconds to add: ");
		Scanner adds = new Scanner(System.in);
		int s = adds.nextInt();
		
		// Test addSeconds function
		TimeOfDay t3 = t2.addSeconds(s);
		// Print new time after adding seconds
		System.out.println("New time after adding " + s + " seconds is:" + t3.getHours() + ":" + t3.getMinutes() + ":" + t3.getSeconds());

		// Test secondsFrom function
		int t4 = t3.secondsFrom(t2);
		// Print seconds difference
		System.out.printf("Seconds difference:" + t4);
		
		adds.close();
	}

}