package day06_operators;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// leap year or not 
		// true or false
		
		int year=2023;
		
		int a = year%4;
		int b= year%100;
		int c =year%400;
		
		boolean result = (a==0 && b!=0) && (c==0) ;
		
		String leapYear = result ? "leap year" : "not a leap year" ;
		
		System.out.println(year + " is " + leapYear);
		
		
	}

}
