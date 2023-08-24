package week02_Java_homework;

import java.util.Scanner;

public class Task9 {

	public static void main(String[] args) {
		// TASK 9
		
// Create a calculator that can calculate basic operators
// like addition, subtraction, 
// multiplication and division.
		
		double a,b;
		
		Scanner scanner = new Scanner(System.in);// Enter input from the user
		
		System.out.println("Enter the numbers: ");
		
		a= scanner.nextDouble();
		b= scanner.nextDouble();
		
		System.out.println("Enter the operator: +, -, *, or /");
		
		char oper = scanner.next().charAt(0);
		double result= 0;
		
		switch (oper) {
		case '+' :
			result = a + b;
			break;
		case '-' :
			result = a - b;
			break;
		case '*' :
			result = a * b;
			break;
		case '/' :
			result = a / b;
			break;
		default:
			System.out.println("Invalid Input!");
		}
	
		System.out.println("The result is:");
		
		System.out.println();
		
		System.out.println(a + "" + oper + b + "=" + result);
		
	}

}
