package day07_controlFlowStatment;

public class IfStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//syntax:
		// condition is always boolean --> true or false
	//	if(condition) {
		//	true block
	//	} else {
		//	false block}
		// }
		
		
		
		int num =5;
		if (num>3) {
			System.out.println(num+ " is greater than 3");
		} else {
			System.out.println(num + " is less than 3");
		}
		
		// even or odd
		
		long num2 = 570;
		if (num2%2==0) {
			System.out.println(num2 + " is an even number");
		} else {
			System.out.println(num2 + " is an odd number");
		}
		
		int count = 12;
		int total =4;
		if (count <3) {
			total = 0;
			
		} else { total += count; // total = total + count 
			
		}
		System.out.println("Value of total is " + total);
		
		
		// write a program that takes an integer input from the user and uses an if statement to check if it is positive or negative
		
		int number = -5;
		if (number >=0) {
			System.out.println(number + "  is a positive number");
		} else {
			System.out.println(number + "  is a negative number");
		}
	}

}
