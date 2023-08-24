package week01;

public class ProgramToSwapTwoNumbersWithoutUsingTemporaryVariable {

	public static void main(String[] args) {
		// Program To Swap Two Numbers Without Using a Temporary Variable

		int x = 10;
		int y = 20;
		
		x = x + y; // x now becomes 30
		y = x - y; // y now becomes 10
		x = x - y; // x now becomes 20
		
		System.out.println("After Swapping: ");
		System.out.print("x = ");System.out.println(x);
		System.out.print("y = ");System.out.println(y);
	}

}
