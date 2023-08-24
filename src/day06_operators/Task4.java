package day06_operators;



public class Task4 {

	public static void main(String[] args) {
//	    BMI Calculator: 
//	    Write a Java program that calculates the Body Mass Index (BMI) of a person
//	    based on their weight and height using arithmetic operators.
//	    // Calculate BMI using arithmetic operators
//	            double bmi = weight / (height * height);

	    /*
	     * 
	     * 
	     * BMI Categories: 
	     * Underweight = <18.5 
	     * Normal weight = 18.5–24.9 
	     * Overweight = 25–29.9 
	     * Obesity = BMI of 30 or greater
	     * 
	     */


	        // Ternary Operator
	        // variable = (Condition) ? true block : false block;
//	        double weightKg = 78;
//	        double heightM = 1.85;
	//
//	        double bmi = weightKg / (heightM * heightM);
	//
//	        System.out.println(bmi);
//	        
//	        
//	        String msg =  (bmi < 18.5  ) ? "Underweight" : "";
//	               msg =  (bmi > 18.5 && bmi < 24.9 ) ? "Normal weight" : "";
//	               msg =  (bmi > 25&& bmi < 29.9 ) ? "Overweight" : "";
//	            //   msg =  (bmi > 18.5 && bmi < 24.9 ) ? "Normal weight" : "";
	//
////	               (n1 >= n2) ? ((n1 >= n3) ? n1 : n3) : ((n2 >= n3) ? n2 : n3);
//	         System.out.println(msg);
	               
	               
	             
	         double weight = 70;
	            double height = 1.7;
	            double bmi = weight / (height * height);
	            System.out.println("Weight: " + weight + "kg. Height: " + height + "m.");
	            System.out.println("BMI is " + bmi);

	            String yourWeight = (bmi < 18.5) ? "Under Weight" : 
	                                (bmi >= 25 && bmi < 30) ? "Overweight" : 
	                                (bmi >= 30) ? "Obesity" : "Normal Weight";

	            System.out.println("Your body is " + yourWeight);
	         
	         
	               
	               
	               
	               
	               
	    }

	}