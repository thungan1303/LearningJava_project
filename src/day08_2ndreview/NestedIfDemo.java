package day08_2ndreview;

import java.util.Random;

public class NestedIfDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// nested 
		// if (condition A) {
		// if (condition B) {
		// if (condiition C) {
		// code block
		// }
		// }
		// }

		// Task 1 - Lucky Number

//A four-digit number ABCD is called lucky if A + B = C + D

//Write a program that asks the user to enter a four-digit number and tell if the number is a lucky
//number or not. if it's a lucky number print Yay, <number> is a lucky number, otherwise
//print Nah, <number> is not a lucky number

//Task 2 - Weird Number

//Given an integer n , perform the following conditional actions:

//If n is odd, print Weird
//If n is even and in the inclusive range of 2 to 5 , print Not Weird
//If n is even and in the inclusive range of 6 to 20 , print Weird
//If n is even and greater than 20, print Not Weird

		// int n = new Random().nextInt(20) +1; // random number
		// System.out.println("n= " + n);
		
	//	Random random = new Random();
	//	int rdInt = random.nextInt(10); // random number between 0-9
		// int rdInt = random.nextInt(20)+1; // random number between 0-19 (1-20)
	//	System.out.println(rdInt);
		
		//int n = new Random().nextInt(20) +1; // random number
				 //System.out.println("n= " + n);
		
		//int n = 34;
		//boolean isEven = n % 2 == 0;

		//if (!isEven)  // is odd
			//System.out.println("Weird");

		//else {
		//if (n >= 2 && n <= 5) { // 2 , 4
		//		System.out.println("Not Weird");
			//}

			//else if (n >= 6 && n <= 20) { // 6, 8, 10,...,20
			//	System.out.println("Weird");
			//}else if (n > 20) { // 22, 24, ... and more even numbers
				//System.out.println("Not Weird");
		//}}}}

// MIN to MAX
// -2147483648 to 2147483647
Random random = new Random();
//int rdInt = random.nextInt(20)+1; // random number btw 0-19 (1-20)
//int rdInt = random.nextInt(5); // random number btw 0-4

// i want random btw 1-20
//System.out.println(rdInt);



int n = random.nextInt(100)+1; // random number btw 1-100
System.out.println("n = " + n);


//int n = 4;
boolean isOdd = n % 2 != 0;

if (isOdd)
    System.out.println("weird");
else {
    if (n >= 2 && n <= 5) // 2, 4
        System.out.println("not weird");
    else if (n >= 6 && n <= 20) // 6, 8, 10, ... , 20
        System.out.println("weird");
    else if (n > 20) // 22 and more (even)
        System.out.println("not weird");
}
	}}

