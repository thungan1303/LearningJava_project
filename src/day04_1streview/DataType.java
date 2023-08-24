package day04_1streview;

public class DataType {

	public static void main(String[] args) {
		// datatyoe varName - value;
		
		// There are 2 main type of data
		// Primitive
		
		// whole number - byte, short, int, long
		// decimal number - double, float
		// single character - char
		// boolean (true/false) - boolean
		
		byte monthOfYear = 12;
		short dayInYear = 365;
		int housePrice = 450_000;
		long viewCount = 4_000_000_000_000L;
		
		float milkPrice = 2.95002323232323f;  //2.9500232
		System.out.println(milkPrice);
		double myBalance = 234535.231462466;
		
		char letterA = 'A';
		boolean isOn = true; 
		
		// Non-Primitive
		String myDog = "Bebe";
		
		
		// DataType varName = value;
        String schoolName = "Tech Circle";
        System.out.println(schoolName);
        
        // Declare
        String myCat;
//        System.out.println(myCat); // this will not work
        // bc the var hasn't been initialize yet
        
        
        
        // do something
        myCat = "Sonic";
        System.out.println(myCat);
        myCat = "Lego";
        System.out.println(myCat);
        myCat = "something else";
        System.out.println(myCat);
        
        // Declare more than one,
        // but they have to be the same datatype
        
//        int a;
//        int b;
//        int c;
        int a,b,c;
        
        a = 0;
        b = 1;
        c = 2;
        
        
        // Constant
        // name convention
        // SCREAM SNAKE CASE
        // ONE_TWO_THREE_FOUR
        
        // store fraction , decimal
        final double PI = 3.14;
        // pi * r * r 
        // formular to calculate circle area
//        PI = 3.45; // this will give error
        // final variable cannot be ressign
	}

}
