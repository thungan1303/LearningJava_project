package week01;

public class HelloWorld {

	public static void main(String[] args) {

// Question 2:
		// Write a java program to store the employee information
		String name = "Ngan Thu Tran";
		String companyName = "Bella Enterprises LLC";
		String jobTitle = "co-owner";
		char gender = 'F';
		double salary = 4000;
		int employeeID = 1234;
		boolean hasBenefits = true;
		char isMarried = 'Y';

		

// Question 3:
		// Program to print 'Hello' on screen and then print my name on a separate line
		String greetings = "Hello";
		String name1 = "Ngan Thu Tran";
		System.out.println("Question 3: ");
		System.out.println(greetings);
		System.out.println(name1);
		System.out.println();

// Question 4:
		// Program To Print The Sum Of Two Numbers
		int x1 = 1;
		int x2 = 2;
		int x3 = x1 + x2;
		System.out.println("Question 4: The Sum Of Two Numbers");
		System.out.println("x1= " + x1);
		System.out.println("x2= " + x2);
		System.out.println("x1+x2= " + x3);
		System.out.println();

// Question 5:
		// Program To Divide Two Numbers
		float a = 1;
		float b = 2;
		float c = a / b;
		System.out.println("Question 5: Divide Two Numbers");
		System.out.println("a= " + a);
		System.out.println("b= " + b);
		System.out.println("a/b= " + c);
		System.out.println();

// Question 6:
		// To print the sum, multiply, subtract, divide and remainder of two numbers

		// The sum
		float num1 = 20;
		float num2 = 10;
		float sum = num1 + num2;
		System.out.println("Question 6: To print the sum, multiply, subtract, divide and remainder of two numbers");
		System.out.println("num1= " + num1);
		System.out.println("num2= " + num2);
		System.out.println("The sum:");
		System.out.println("num1+num2 = " + sum);

		// The multiplication
		float mul = num1 * num2;
		System.out.println("The multiplication:");
		System.out.println("num1*num2 = " + mul);

		// The subtraction
		float sub = num1 - num2;
		System.out.println("The subtraction:");
		System.out.println("num1-num2 = " + sub);

		// The division
		float div = num1 / num2;
		System.out.println("The division:");
		System.out.println("num1/num2 = " + div);

		// The remainder
		float rem = num1 % num2;
		System.out.println("The remainder:");
		System.out.println("num1/num2 = " + rem);
		System.out.println();

// Question 7: 
		// Program To Swap Two Numbers Without Using a Temporary Variable

		int x = 10;
		int y = 20;

		x = x + y; // x now becomes 30
		y = x - y; // y now becomes 10
		x = x - y; // x now becomes 20

		System.out.println("Question 7: To Swap Two Numbers Without Using a Temporary Variable: ");

		System.out.println("After Swapping: ");
		System.out.print("x = ");
		System.out.println(x);
		System.out.print("y = ");
		System.out.println(y);
		System.out.println();

// Question 8: Primitive Types Challenge
		// 1. A byte variable, set it to any valid byte number, it doesn't matter
		// 2. A short variable, set it to any valid short number
		// 3. An int variable, set it to any valid integer number
		// 4. Lastly, create a variable of typle long. Make it equal to 50,000 plus 10 times the sum of the values of the first 3 variables

		// 1. A byte variable, set it to any valid byte number, it doesn't matter
		byte varByte = 127;

		// 2. A short variable, set it to any valid short number
		short varShort = 525;

		// 3. An int variable, set it to any valid integer number
		int varInt = 2000;

		long varLong = 50000 + 10 * (varByte + varShort + varInt);

		System.out.println("Question 8: Primitive Types Challenge: ");
		System.out.println("A byte variable: ");
		System.out.println("varByte = " + varByte);

		System.out.println("A short variable: ");
		System.out.println("varShort = " + varShort);

		System.out.println("A integer variable: ");
		System.out.println("varInt = " + varInt);

		System.out.println("A long variable: ");
		System.out.println("varLong = " + varLong);
		System.out.println();

	}

}
