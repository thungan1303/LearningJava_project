package week02_Java_homework;

public class Task5 {

	public static void main(String[] args) {
// TTask5:
//Write a program that takes an integer as input and prints whether the number is 
//even or odd
		
		int i=527;
		
		boolean isEven = i%2 == 0;
		
		if (isEven) {
			System.out.println(i + " is an even number");
		} else
			System.out.println(i + " is an odd number");

	}

}
