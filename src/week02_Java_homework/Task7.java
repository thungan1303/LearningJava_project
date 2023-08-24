package week02_Java_homework;


import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {
		
		// Task 7
		// prints the day of the week.
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a number between 1 to 7");
		
		
		int theDay = scanner.nextInt(8);
		
		
		switch (theDay) {
		
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;	
		case 3:
			System.out.println("Wednesday");
			break;	
		case 4:
			System.out.println("Thursday");
			break;	
		case 5:
			System.out.println("Friday");
			break;	
		case 6:
			System.out.println("Saturday");
			break;	
		case 7:
			System.out.println("Sunday");
			break;	
	   default:
			System.out.println("Invalid input");
		}
		}}
	


