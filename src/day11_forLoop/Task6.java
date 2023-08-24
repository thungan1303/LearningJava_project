package day11_forLoop;

public class Task6 {

	public static void main(String[] args) {
		// Print Sum of Odd numbers between 1 to 100
		
		int sum = 0;
		
		for (int i = 1 ; i< 101 ; i++) {
			
			if (i%2==0) {
				sum += i;
			}
		}
		
		for (int i=1; i<=100 ; i++ ) {
			if (i%2==0) {
				if (i!=100) {
					System.out.print(i + " + ");
				} else {
					System.out.println(i + " + " + sum);
				}
			}
		}
			
			}
			
		

	}


