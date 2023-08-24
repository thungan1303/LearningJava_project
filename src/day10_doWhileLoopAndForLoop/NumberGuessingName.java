package day10_doWhileLoopAndForLoop;

import java.util.Random;
import java.util.Scanner;



public class NumberGuessingName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Random random = new Random();
		
		int secretNumber = random.nextInt(5);
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Welcome to number guessing game!");
		
		System.out.println("Enter your guess (0 ~ 5)");
		
		int num = keyboard.nextInt();
		secretNumber=4;
		
		if (num > secretNumber) {
			System.out.println("Too high");
		}else if (num == secretNumber) {
			System.out.println("Congrats! you won!");
		}else {
			System.out.println("Too low");
		} 
	while (num!=secretNumber);
		System.out.println(secretNumber);
		keyboard.close();
		
		
			
		
	}

}
