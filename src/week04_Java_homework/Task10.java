package week04_Java_homework;

import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {
		// Enter a word. If the word ends with "ly", print "really???", otherwise, print "=never mind"
		
		System.out.println("Enter a word!");
		
		Scanner scan = new Scanner(System.in);
		
		String str = scan.nextLine();
		
		
		if (str.endsWith("ly")) {
			System.out.println("Really!");
		}else {
			System.out.println("Never mind!");
		}
		scan.close();
	} 
	}


