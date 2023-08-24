package day10_doWhileLoopAndForLoop;

import java.util.Random;
import java.util.Scanner;

public class RandomNumber {

	public static void main(String[] args) {
		// RANDOM NUMBERS 
		// datatype variableName = value;
		
		Random random = new Random(); // creating object of random class
		

		System.out.println(random.nextInt());
		System.out.println(random.nextInt(10)); // Generate any random number between 0 t0 10
		System.out.println(random.nextBoolean());
		System.out.println(random.nextInt(100)*(-1));
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("What is your name?");
		
		String name = keyboard.next();
		
		System.out.println("Hello "+name );
		
		System.out.println("How old are you?");
		
		keyboard.close();
		
	}

}
