package day07_controlFlowStatment;

public class StudentGrades {

	public static void main(String[] args) {
		// STUDENT GRADES 
		
		char grade = 'A';
		switch (grade) {
		case 'A':
				System.out.println("Pass");
				break;
		case 'B':
				System.out.println("Pass");
				break;
		case 'C':
				System.out.println("Pass");
				break;
		case 'D':
				System.out.println("Pass");
				break;
		case 'W':
				System.out.println("Withdraw");
				break;
		case 'I':
				System.out.println("Incomplete");
				break;
		default:
				System.out.println("Fail");
			
		}
		}

}

