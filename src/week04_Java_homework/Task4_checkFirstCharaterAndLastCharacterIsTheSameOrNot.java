package week04_Java_homework;

import java.util.Scanner;

public class Task4_checkFirstCharaterAndLastCharacterIsTheSameOrNot {

	public static void main(String[] args) {
		// TASK 4
		
		System.out.println("Enter the word!");
		
		Scanner scan = new Scanner(System.in);
		
		String word = scan.next();
	
		char a = word.charAt(0);
		
		char b = word.charAt(word.length()-1);
		
		if (a==b) {
			System.out.println("The first character is the same with the second character!");
			
		}
		else {System.out.println("The first character and the second character is not the same!");
		}
		
		

	}

}
