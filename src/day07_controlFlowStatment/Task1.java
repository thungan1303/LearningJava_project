package day07_controlFlowStatment;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double n1 = 1.0;
		double n2 = 4.5;
		double n3 = -5.3;
		
		
		
		// n1<n2<n3 --> n3 is the largest value
		if (n3>n1 && n3>n2) {
			
			System.out.println(n3 + " is the largest value");
			
		} else if (n2>n3 && n2>n1) {
			System.out.println(n2 + " is the largest value");
		
			
		} else if (n1>n2 && n1>n3) {
			System.out.println(n1 + " is the largest value");
		
		}

}}