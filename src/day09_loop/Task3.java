package day09_loop;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Calculate and print the factorial of a given positive integer using a while loop
	
		int result=1;
		int factorialNumber = 5;
		while (factorialNumber >=1) {
			System.out.println(factorialNumber);
	result *= factorialNumber ; // result = result*factorialNumber
	factorialNumber --;
		
		}
		System.out.println(result);
	}

}
