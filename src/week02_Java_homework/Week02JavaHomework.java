package week02_Java_homework;

public class Week02JavaHomework {

	public static void main(String[] args) {

// Task 1 : Write a program that takes a user's age as input 
// and prints out if the user is an adult or a minor. 
// The legal age of adulthood is 18 years
		System.out.println("Task 1:");
		int age = 18;
		System.out.println("The user age is "+age);
		if (age < 18) {
			System.out.println("The user is a minor");
		}else {
			System.out.println("The user is an adult");
			System.out.println();
		}

// Task2:
// Write a program that takes a user's score as input and prints out
// their letter . grade based on the following scale: 
//  A = 90-100 B = 80-89 C = 70-79 D = 60-69 F = 0-59

		System.out.println("Task 2:");
		int x = 80;
		System.out.println("The user's score is " + x);
		if (90<=x && x<=100) {
			System.out.println("Grade: A");
			}else if (80<=x && x<=89) {
				System.out.println("Grade: B");
			}else if (70<=x && x<=79) {
			System.out.println("Grade: C");
			}else if (60<=x && x<=69) {
			System.out.println("Grade: D");
			}else if (0<=x && x<=59) {
			System.out.println("Grade: F");
		} else {
		System.out.println("Invalid score"); 
		
	}
		
		//Task3:
			//Write a program that takes two integers as input and prints "The numbers are 
			//equal" if they are equal, "The first number is greater" if the first number is 
			//greater, and "The second number is greater" if the second number is greater.
		System.out.println();
		System.out.println("Task 3:");
		int x1 = 33;
		int x2 = 333;
		System.out.println("First number= " + x1);
		System.out.println("Second number= " + x2);
		if (x1==x2) {
			System.out.println("The numbers are equal");
		}else if (x1>x2) {
			System.out.println("The first number is greater");
		}else {
			System.out.println("The second number is greater");
		}
		
		
		
	}
}


