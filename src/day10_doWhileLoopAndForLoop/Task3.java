package day10_doWhileLoopAndForLoop;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Write a Java program to print numbers between 1 and 100 divisible by 3, 5 and both.
        // Sample Output:
// 
      //  Divided by 3:                                                          
      //  3, 6, 9, 12, 15, 18, 21, 24, 27, 30, 33, 36, 39, 42, 45, 48, 51, 54, 57
       // , 60, 63, 66, 69, 72, 75, 78, 81, 84, 87, 90, 93, 96, 99,              
		//Divided by 5:                                                          
          //  5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60, 65, 70, 75, 80, 85, 90, 
          // 95,    
		
		//Divided by 3 & 5:                                                      
           // 15, 30, 45, 60, 75, 90,
		System.out.println("Numbers divisible by 3 and 5");
	int x=1;
	
	do { if (x%3==0 && x%5==0) {
		System.out.println(x);
	}
		
		x++;
	}
	while (x<101);
	
	System.out.println("-----------");
	System.out.println("Numbers divisible by 3");

	x=1;
	
	do { if (x%3==0) {
		System.out.println(x);
	}
		
		x++;
	}
	while (x<101);
	
	System.out.println("-----------");
	System.out.println("Numbers divisible by 5");

	x=1;
	
	do { if (x%5==0) {
		System.out.println(x);
	}
		
		x++;
	}
	while (x<101);
	}

}
