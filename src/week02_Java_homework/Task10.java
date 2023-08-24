package week02_Java_homework;



public class Task10 {

	public static void main(String[] args) {
		// Task10:
		//Write a Java program and compute the sum of the digits 
		//of an integer.
		
		int i = 25;
		
		int x = i%10; //5
		int y= i/10; //2
		System.out.println("Input an integer: " + i);
		
		System.out.println("First digit: " + y);
		
		System.out.println("Second digit: "+ x);
		
		System.out.println("The sum of the digits is: " + (x+y));
	}
}
