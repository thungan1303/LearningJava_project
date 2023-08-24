package day11_forLoop;

import java.util.Scanner;

public class Task8_FindNumberOfDayInAMonth {

	public static void main(String[] args) {
		// Write a program that can find the number of days in a month
	
		int a;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the month: ");
		
		a = scanner.nextInt();
		
		switch (a) {
		case 1:
			
		case 3:
			
		case 5:
			
		case 7:
			
		case 8:
			
		case 10:
			
		case 12:
			System.out.println("31 Days in this Month"); 
			break;
		case 2:
			System.out.println("28 or 29 Days in this Month"); 
			break;
		case 4:
			
		case 6:
			
		case 9:
			
		case 11:
			System.out.println("30 Days in this Month"); 
			break;
			default:
				System.out.println("Please enter valid month");
		}
		
		scanner.close();
		
	
	}

}
