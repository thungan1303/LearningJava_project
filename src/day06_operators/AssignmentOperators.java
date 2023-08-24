package day06_operators;



public class AssignmentOperators {

	public static void main(String[] args) {
		// = , += , -= , *= , /=
		int a=5;
		a = a+5;
		System.out.println(a); //10
		a += 5; // a=a+5;
		System.out.println(a); //15
		
		a += 5;
		a += 5;
		a += 5;
		System.err.println(a);//30
		
		a++;
		System.out.println(a); //31
		
		a-=2; //a=a-2;
		System.out.println(a);
		
		a-=19;
		System.out.println(a);
		
		a*=10; //a=a*10
		System.out.println(a);//100
		
		a/=10; // a=a/10;
		System.out.println(a); //10
		
		int num=59;
		int lastDigit = num%10;
		System.out.println(lastDigit);//9
		
		int summerIsMyFristDigit = num/10;
		System.out.println(summerIsMyFristDigit);
		
		int num2 = 25;
		// out =52;
		// Program to reverse user input using arithmetic operator
		
		
		int firstDigit= num2/10; //2
		System.out.println(firstDigit);
		
		lastDigit= num2%10; //5
		System.out.println(lastDigit);
		
		System.out.println(lastDigit + "" + firstDigit);
		
		int reverse = lastDigit*10 + firstDigit;
		System.out.println(reverse);
	
		
		
		
		
	
		
		
		
		
		
		

	}

}
