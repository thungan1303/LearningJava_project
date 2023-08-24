package day03_variables;

public class VariableNamingConvention {

	public static void main(String[] args) {
		// 1. first character of variable are letter or _ or $
		String name;
		int _distance;
		double $balance;
		
		int age = 4;
		
		//2. After the first initial letter, variable names may also contain letter
		
		String user12;
		String userx_______$;
		String color_of_452466card = "";
		
		// 3. The name can be of any length
		
		String myPhoneNumberrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrr;
		
		// 4. Uppercase characters are distinct from lowercase characters.
		int speed = 55;
		int SPEED = 65;
		int Speed = 35;
		System.out.println(speed); //55
		System.out.println(Speed); //35
		System.out.println(SPEED); //65
		
		speed = 0;
		System.out.println(speed);
		
		final int DAYS_IN_WEEK = 7;
		System.out.println(DAYS_IN_WEEK); //7
		// The final local variable DAYS_IN_WEEK cannot be assigned. It must be blank and not using a compound assignment
		DAYS_IN_WEEK = 27;
		System.out.println(DAYS_IN_WEEK); //27
		
		// You cannot use a java keyword (reserved keyword) for a variable name.
		
		//String continue = "value";
		String whileTesting = "value";
		
		//
		int numberOfStudent;
		
		double accountBalance;
		
		
		// 1, first character of the variable are letter or _ or $
        String name1 = "Ngan";
        int _distance = 5;
        double $balance = 10000;
        
        
        int age = 4;
        
        
        
        //2. After the first initial letter, variable names may also contain letters and the digits 0 to 9. No spaces or special characters are allowed.

        String user12;
        String userx_______________$;
        String color_of_3453453card = "";
        
        // 3. The name can be of any length, but don't get carried away. Remember that you will have to type this name.
        
        String myPhoneNumberrrrrrr______$$$$$$$$$4123154984rrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrr = "234234";
        
        // 4. Uppercase characters are distinct from lowercase characters.  Using ALL uppercase letters are primarily used to identify constant variables.  Remember that variable names are case-sensitive.

        int speed = 55;
        int SPEED = 65;
        int Speed = 35;
        
        System.out.println(speed); // 55
        System.out.println(Speed); //35 
        System.out.println(SPEED);
        
        
        speed = 0;
        
        System.out.println(speed); // 0
        
        final int DAYS_IN_WEEK = 7;
        System.out.println(DAYS_IN_WEEK);
        //The final local variable DAYS_IN_WEEK cannot be assigned. It must be blank and not using a compound assignment

        
        System.out.println(DAYS_IN_WEEK); // 27
        
        
        //You cannot use a java keyword (reserved word) for a variable name.

//        String continue = "value";
        String whileTesting = "value";

        
        
        //If the name you choose consists of only one word, spell that word in all lowercase letters. If it consists of more than one word, capitalize the first letter of each subsequent word(camelCased).
        
        int numberOfStudent;
        int colorOfMyCar;
        
        double accountbalanceofsomebody;
        double accountBalanceOfSomebody;
        
	}

}
