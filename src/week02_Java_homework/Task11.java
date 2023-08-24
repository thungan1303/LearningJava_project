package week02_Java_homework;

public class Task11 {

	public static void main(String[] args) {
		//Write a Java program to convert seconds to hour, 
		//minute and seconds
		
		int seconds = 86399;
		int minutes= seconds/(60*24) ; // converts to minutes
		int hours= seconds/(60*60); //converts to hours
		int minutesleft=seconds%60;
		System.out.println(hours + ":" + minutes + ":" + minutesleft);

	}

}
