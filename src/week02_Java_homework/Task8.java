package week02_Java_homework;

import java.util.Scanner;

public class Task8 {

	public static void main(String[] args) {
		// TASK 8
		
		//Write a Java Program to print the following message.
		//Good Morning
		//5< 12
		//Good Afternoon
		//12 — 17
		//Good Evening
		//17—24
		//*/
		//When do the greetings (Good morning, afternoon, and evening) change?
		//● Good morning. 5:00 AM — 11:59 AM.
		//● Good afternoon. 12:00 PM — 4:59 PM.
		//● Good evening. 5:00 PM — 4:59 AM.	

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the time: ");
		
		double hr;
		
		hr = scanner.nextDouble();
		
		if (hr>5 && hr<12) {
			System.out.println("Good Morning");
		} else if (hr>12 && hr<17) {
			System.out.println("Good Afternoon");
		
		} else if (hr>17 && hr<24) {
			System.out.println("Good Evening");
		} else 
				System.out.println("Invalid input");
	}

}
