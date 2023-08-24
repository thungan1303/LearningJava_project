package day05_operators;

public class HomeworkReview {
		public static void main (String args[]) {
			 
	        int x = 10; 
	        int y = 20;
	        
//	        x = 20;
//	        y = 10;
	        
	        int z = x;
	        
//	        System.out.println(x); // 10
//	        System.out.println(y); // 20
//	        System.out.println(z); // 10
	        
	        System.out.println("X:"+x); 
	        System.out.println("Y:"+y); 
	        System.out.println("Z:"+z);
	        
	        x = y; // 20
	        
	        y = z; // 10
	        
	        System.out.println("X:"+x); 
	        System.out.println("Y:"+y); 
	        System.out.println("Z:"+z);
	        
	        System.out.println("-------------------------------");
	        
	        int num1 = 5;
	        int num2 = 9;
	        
	        System.out.println("Value of num1 is "+num1);
	        System.out.println("Value of num2 is "+num2);
	        
	        num1 = num1 + num2;
	        
//	        System.out.println(num1); //14
//	               14   -  9
	        num2 = num1 - num2; //
	        
	        System.out.println(num2); // 5
//	        System.out.println(num1); // 14 
//	                14 -   5
	        num1 = num1 - num2;
	        
	        System.out.println("Value of num1 is "+num1);
	        System.out.println("Value of num2 is "+num2);}
}