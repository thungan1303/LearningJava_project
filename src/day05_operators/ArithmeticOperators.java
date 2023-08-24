package day05_operators;

public class ArithmeticOperators {

	public static void main(String[] args) {
		
		// +, -, *, / , % , ++ , -- 
		// Addition (+)
		int a = 10;
		int b = 5;
		int c = 3;
		
		System.out.println(a+b);
		
		int result = a + b;
		
		System.out.println(result);
		// int result2 = a + b + c;
		
		int result2 = result + c;
		
		System.out.println(result2);
		
		double d = 9.9;
		
		System.out.println(a + d);
		
		//int result3 = (int)(a + d);
		
		double result3 = a + d;
		System.out.println(result3);
		
		// Subtraction (-) /// java -version
		
		System.out.println(a-b-c); //2
		System.out.println(c-a ); // -7	
		System.out.println(a*b); //50
		
		
		System.out.println(a/b); //2
		
		// % (Remainder)
		System.out.println("----REMAINDER----");
		System.out.println(10.0/3.0);
		System.out.println(10.0%3.0);
		
		// ---- INCREMENT OPERATOR ---- (++) ---
		a =1;
		a = a +1;
		
		System.out.println(a); // 2
		
		a++; // a = a + 1 ;
		System.out.println(a); // 3
		a++; // a now becomes 4
		a++; // a now becomes 5
		a++; // a now becomes 6
		System.out.println(a); //6
		
		a = a - 1 ; //5
		System.out.println(a); //5
		
		a--; // a = a -1 ;
		System.out.println(a); //4
		a--;
		a--;
		a--;
		System.out.println(a); //1
		
		int index = 0;
		System.out.println(index);
		index++;
		System.out.println(index);
		
		index++;
		System.out.println(index);
		
		index++;
		System.out.println(index);
		
		index++;
		System.out.println(index);
		
		
		
		
		
		
		
		
		
	}

}
