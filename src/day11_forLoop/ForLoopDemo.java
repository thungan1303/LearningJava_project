package day11_forLoop;

public class ForLoopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	for (variable ; condition ; change) {
	// code block
	// }
	
		// Print 1 to 5
		for (int i = 1 ; i < 6; i++) {
			System.out.println(i);
			
			System.out.println("Hello ---- " + i);
	
		}
		int i = 1;
		while (i<6) {
			System.out.println("Hello Cohort 16 --- " + i);
			i++;
			
		}
		
		System.out.println("---DO WHILE LOOP---");
		System.out.println(i);  // i=6;
		
		i = 1;
		do {
			System.out.println("Hello ---- " + i);
			i++;
		} while (i<6);
		
		}
	}
	

