package day05_operators;

public class RelationalOperators {
	public static void main(String[] args) {
		
		// == , > , >= , < , <= , !=
		// RelationalOperator will return boolean
		
		int a = 2;
		int b = 3;
		int c = 5;
		
		// 2==3
		System.out.println(a==b); // false
		
		int d = a + b ; //5
		System.out.println(d == c); // true
		
		boolean result = a + b == c;
		System.out.println(result); // true
		
		/// != not equal 
		System.out.println(a != b); // 2 not equal to 3 => true
		System.out.println(d != c); // false
		
		a=1;
		b=2;
		c=3;
		
		System.out.println(a >= b); // false
		System.out.println(a+b >= c); // true
		
		boolean result2 = a <= c;
		System.out.println(result2); //true
		
		System.out.println(a*b>=0);
		System.out.println(a+b+c < c + b); // 1+2+3 < 2+3 => false 
		System.out.println(a+b+c <= c * b); // true
		
		 
		
	}

}
