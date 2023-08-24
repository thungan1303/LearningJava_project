package week04_Java_homework;

public class Task1 {

	public static void main(String[] args) {
		//  prints the first and last character of a sentence:	
		
		String str = "Welcome To Techcircle";
		
		char firstcharacter = str.charAt(0);
		
		char secondcharacter = str.charAt(str.length()-1);

		System.out.print(firstcharacter);System.out.print(secondcharacter);
		

}
}