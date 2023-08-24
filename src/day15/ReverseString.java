package day15;

public class ReverseString {

	public static void main(String[] args) {
		// String Reversal:
		// Write a program reverse a given string without using any built-in string reversal functions
       //             012		
		String str = "Washington";
		
//		System.out.println(str.charAt(2)); //c
//		System.out.println(str.charAt(1)); //b
//		System.out.println(str.charAt(0)); //a
//		
//		str = "def" ;
//		
//		for (int i = str.length()-1; i>=0; i--) {
//			System.out.println(str.charAt(i));
//		}
		
	String reverse = "";
	
//	System.out.println(str.charAt(2));
//	reverse += str.charAt(2);
//	System.out.println(reverse);
//	
//	System.out.println(str.charAt(1));
//	reverse += str.charAt(1);
//	System.out.println(reverse);
//	
//	System.out.println(str.charAt(0));
//	reverse += str.charAt(0);
//	System.out.println(reverse);
//	
//	reverse += str.charAt(0);
//	System.out.println(reverse);
	
	
	for (int i=2 ; i >= 0; i--) {
		System.out.println(i);
	}
	for (int i=str.length()-1; i >= 0; i--) {
		System.out.println(i);
		System.out.println(str.charAt(i));
		reverse += str.charAt(i);	}
	
	System.out.println(reverse);

} }
