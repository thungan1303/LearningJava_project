package week04_Java_homework;

import java.util.Scanner;

public class Task11 {

	public static void main(String[] args) {
		// If the word starts with x, print the word without x
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a word!");
		
		String word = scan.next();
		
		if (word.startsWith("x")) {
			String noX = word.substring(1);
			System.out.println(noX);
		} else {
			System.out.println(word);
		}

		scan.close();
		
	}

}
