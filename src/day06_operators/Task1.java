package day06_operators;

public class Task1 {

	public static void main(String[] args) {
		// Arithmetic Calculator:
		//Write a Java program that takes two numbers as input from the user and performs arithmetic operations
//(addition, subtraction, multiplication, division, and modulus) 
//      using different operators.
		
		int numA = 50;
		int numB = 2;
		
		int add= numA+numB;
		System.out.println(add);
		
		int subtract = numA - numB;
		System.out.println(subtract);
		
		int multi = numA*numB;
		System.out.println(multi);
		
		int divide = numA/numB;
		System.out.println(divide);
		
		int remainder = numA%numB;
		System.out.println(remainder);
		
		//
		numA=50;
		numB=2;
		int add1= numA += numB;
		System.out.println(add1);
		
		int subtract1 = numA-=numB;
		System.out.println(subtract1);
		
		int multi1= numA*=numB;
		System.out.println(multi1);
		
		int divide1= numA/=numB;
		System.out.println(divide1);
		
		int remainder1= numA%=numB;
		System.out.println(remainder1);
		
		
		
		
	
		
	}

}
