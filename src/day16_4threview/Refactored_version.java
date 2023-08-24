package day16_4threview;

import java.util.Random;
import java.util.Scanner;

public class Refactored_version {

	public static void main(String[] args) {
		// refactored version

		Scanner scan = new Scanner(System.in);
	    Random random = new Random();
	    System.out.println("what is your name");
	    String name = scan.next();
	    System.out.println("Welcome, " + name + ", to my Secret Number Guessing Game");
	    System.out.println("What level of game do you wish to play? Enter (1) for easy, (2) for medium, or (3) for hard. ");
	    int guessedNum = 0;
	    int SecretNum = 0;
	    int numOfGuess = 0;
	    int level = scan.nextInt();

	    int min = 1;
	    int max = 0;

	    if (level == 1) max = 10;
	    else if (level == 2) max = 50;
	    else if (level == 3) max = 100;
	    else System.out.println("You must enter a valid number between 1 and 3");

	    SecretNum = random.nextInt(max);
	    System.out.println(SecretNum);
	    System.out.printf("You have choosen an easy level. " +
	        "Let's play. Pick a number between %d-%d. Good luck!!",
	        min, max);

	    System.out.println();

	    do {
	      System.out.printf("Enter number between %d-%d\n", min, max);
	      guessedNum = scan.nextInt();
	      numOfGuess++;
	      if (guessedNum > SecretNum) {
	        System.out.println("Too high. Try again");
	        max = guessedNum -1;
	      }
	      if (guessedNum == SecretNum) {
	        System.out.println("Way to go! You guessed my Secret Number");
	      }
	      if (guessedNum < SecretNum) {
	        System.out.println("Too low. Try again");
	        min = guessedNum + 1;
	      }
	      if (guessedNum > max || guessedNum < min)
	        System.out.println("Invalid number try again");
	    } while (guessedNum != SecretNum);

	    System.out.println("It took you " + numOfGuess + "guesses");

	    scan.close();
	}

}
