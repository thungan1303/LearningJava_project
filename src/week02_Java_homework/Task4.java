package week02_Java_homework;

public class Task4 {

	public static void main(String[] args) {
//Task4:
//Write a program that takes a letter grade as input (A, B, C, D, or F) and prints 
//whether the grade is passing or failing. A grade of A, B, or C is considered 
//passing, and a grade of D or F is considered failing
	char grade='D';
	switch (grade) {
			case 'A': 
				System.out.println("passing");
				break;
			case 'B': 
				System.out.println("passing");
				break;
			case 'C': 
				System.out.println("passing");
				break;	
			case 'D': 
				System.out.println("failing");
				break;
			case 'F': 
				System.out.println("failing");
				break;
		}
	
	}

}
