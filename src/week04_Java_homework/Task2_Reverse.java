package week04_Java_homework;

import java.util.Scanner;

public class Task2_Reverse {

	public static void main(String[] args) {
		// TASK 2 - REVERSE
		
		System.out.println("Enter a String with only 5 characters long");

		Scanner scanner = new Scanner(System.in);
			
			String str =  scanner.nextLine();
			
			
			System.out.println();
			
			
			String reverse = "";
			
			if (str.length()==5) {
					
			for (int i=str.length()-1; i >= 0; i--)    
			{
				
				reverse += str.charAt(i);	}
			
			System.out.println(reverse);
			
			
			
		}
			else if (str.length()>5) {
				System.out.println("Too long!");
			}
			else
				System.out.println("Too short!");
			
			scanner.close();
		}

	}

