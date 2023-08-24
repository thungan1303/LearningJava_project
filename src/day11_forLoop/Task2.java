package day11_forLoop;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		// Multiplication Table
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Multiplication table (up to 10) of a given number");
		System.out.println("Please enter a number");
		
		
		int j = keyboard.nextInt();
		
		for (int i=1; i<11 ; i++) {
			
				System.out.println(i + "*" + j + "=" + i*j);
			}
		keyboard.close();
		
		}
	}


