package day11_forLoop;

public class Print1To10 {

	public static void main(String[] args) {
		// print 1 to 10
		
		for (int count =1; count <11 ; count++) {
			System.out.println(count);
		}
			
			System.out.println("----");
			
			// PRINT 10 TO 1
			
			for (int count =10; count > 0 ; count--) {
	System.out.println(count);
	
	} 
			System.out.println("----");
			
			// PRINT 1 3 5 7 9 11 13 15
			
			for (int count = 1; count <=15 ; count++) {
				
				if (count%2==1) {
					System.out.println(count);
				}

}}}
