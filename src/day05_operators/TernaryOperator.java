package day05_operators;

public class TernaryOperator {

	public static void main(String[] args) {
		// Syntax"
		// Condition ? true Block : false Block
		int a, b;
		a = 10;
		b = (a==1) ? 20:30; // If a==1 is true => 20; a==1 is false =>30 //In this case a==1 is false so value b is 30
		
		
		System.out.println("Value of b is: " + b); //30
		
		b = (a>=10) ? 50:100;
		System.out.println(b); //50
		
		int num = 5;
		System.out.println(num%2); 
		
		String evenOrOdd = (num %2 == 0)? "even" : "Odd";
		System.out.println(evenOrOdd); //Odd
		
		evenOrOdd = (num %2 == 1)? "Odd":"even" ;
		System.out.println(evenOrOdd);
		
		num=20;
		evenOrOdd = (num %2 == 1)? "Odd":"even" ;
		System.out.println(evenOrOdd);//even
		
	}

}
