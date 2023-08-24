package day11_forLoop;

public class Task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum = 0;

		for (int i = 1; i <=100 ; i++) {
			
			sum = sum +i;
		}
			System.out.println(sum);
		
			
			for ( int i=1; i < 101 ; i++) {
				if ( i!=100) {
					System.out.print(i + " + ");
					
				} else {
					System.out.println(i + "=" + sum);
				}
			}
	}

}
