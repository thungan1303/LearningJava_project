package week04_Java_homework;

import java.util.Scanner;

public class Task6_getInitials {

	public static void main(String[] args) {
		// Task 6 - Write a program that can return the initials of the user
		
		
	  System.out.println("Please enter the user name!");
		
		Scanner scan = new Scanner(System.in);
		
		String str = scan.nextLine();
		
		char firstInitial = str.charAt(0);
		
		int space = str.lastIndexOf("");
		
		char lastInitial = str.charAt(space + 1);
		
		System.out.println(Character.toUpperCase(firstInitial) + "." + Character.toUpperCase(lastInitial));
		
		
		scan.close();
		
		
		
	}

}
