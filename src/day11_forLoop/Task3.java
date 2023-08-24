package day11_forLoop;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		
		
		for (int num = 1; num <=100 ; num++) {
			
			if (num%3==0 ) {
				
				System.out.println("Divisible by 3: " + num + ",");
			}}
			
				for ( int num1 = 1; num1 <=100 ; num1++) {

				if (num1%5==0 ) {
					System.out.println("Divisible by 5: ");
					System.out.println(num1 + ",");

				}}
				
				for ( int num2 = 1; num2 <=100 ; num2++) {

				if (num2%3==0 && num2%5==0 ) {
					System.out.println("Divisible by 3 and 5: ");
						System.out.println( num2 + ",");
			}
		}
	
				}}


