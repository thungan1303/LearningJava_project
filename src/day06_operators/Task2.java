package day06_operators;

public class Task2 {

	public static void main(String[] args) {
// Task 2: Celsius to Fahrenheit Converter
//	    Create a Java program that takes a temperature value in Celsius as input
//	    and converts it to Fahrenheit using the formula: 
//	        Fahrenheit = (Celsius * 9/5) + 32. 
//	        Display the converted temperature as output.
		// F = (C*9/5) + 32
		
		double tempInCelsius;
		tempInCelsius = 35.2;
		
		double tempInFahrenheit= (tempInCelsius*9/5)+32;
		System.out.println(tempInCelsius + " celsius is " + tempInFahrenheit + " fahrenheit");
	}

}
