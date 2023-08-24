package day07_controlFlowStatment;

public class LoanApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int salary = 120000;
		int jobHistory = 3;
		int creditScore = 750;
		
		if (salary>= 25000) {
			if (jobHistory >= 2) {
				if (creditScore>=680) {
					System.out.println("You are qualified for this loan!");
				}
				
			}else {
				System.out.println("You must be on the job at least for 2 years!");
				
			}
		}else {
			System.out.println("You must have minimum of $25000 salary first!");
		}
	}

}
