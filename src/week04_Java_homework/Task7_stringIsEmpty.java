package week04_Java_homework;

import java.util.Scanner;

public class Task7_stringIsEmpty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	System.out.println("Please enter a word!");
	
	Scanner scan = new Scanner(System.in);
	
		String word = scan.nextLine();
		
		
		int length = word.length();
		
		if (length >3) {
			System.out.println(word.charAt(word.length()-2) + word.charAt(word.length()-1) + word.charAt(word.length())); //Print last 3 characters if the string has more than 3 characters
			
		} else {
			System.out.println(word);
		} 
		scan.close();
	}
	}


