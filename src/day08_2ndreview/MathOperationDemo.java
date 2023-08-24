package day08_2ndreview;

public class MathOperationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double x=5;
		double y = 2;
		
		// % - modular - find the remainder from division
		double result = x % y;
		System.out.println(result);
		
		System.out.println(10%5); //0
		System.out.println(90%78); //12
		System.out.println(12%5); //2
		
		// Whenever you modular the number by 10th (10, 100, 1000, ...)
		// the result will be 
		// the last digit, second to last, third to last, ...
		System.out.println(12132456%10); //6
		System.out.println(12132456%100); //56
		System.out.println(12132456%1000); //456
		
		// first number is small than the second
		System.out.println(3%10);
		System.out.println(12%25);
	}

}
