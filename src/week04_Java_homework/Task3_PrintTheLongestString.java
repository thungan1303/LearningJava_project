package week04_Java_homework;

import java.util.Scanner;

public class Task3_PrintTheLongestString {

	public static void main(String[] args) {
		// task 3
		
		System.out.println("Enter the first word!");
		
		Scanner scan1 = new Scanner(System.in);
		
		String firstWord = scan1.next();
		
		System.out.println("Enter the second word!");
		
		Scanner scan2 = new Scanner(System.in);
		
		String secondWord = scan2.next();
		
		if (firstWord.length() > secondWord.length()) {
			System.out.println("The longest word is: " + firstWord);}
			else if (firstWord.length() < secondWord.length()) {
				System.out.println("The longest word is: " + secondWord);	}
			else {
					System.out.println("The first word length is equal with the second word length!");
				}
			
		}
		
		

	}


