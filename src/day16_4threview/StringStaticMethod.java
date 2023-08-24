package day16_4threview;

public class StringStaticMethod {

	public static void main(String[] args) {
		// static method belong to the class
	    // String.staticMethodName()

	    // .valueOf()
	    // convert any primitive datatype -> string type
	    String intStr = String.valueOf(100);

	    String charStr = String.valueOf('T');
	    System.out.println(charStr.toLowerCase());
	    String alterWay = 100 + "";

	    String.valueOf(12546775L).replace("1", "L");

	    // .join()
	    System.out.println(
	        String.join("^^^", "a","b","c"));

	    // .format()
	    // %s, - string
	    // %S, - string to uppercase
	    // %d, - whole number, byte -> long
	    // %f, - float, double
	    // %b, - boolean
	    String myStr = "none";
	    int carMakeYear = 2022;
	    String formattedStr =
	        String.format("my name is %s " +
	            "i am %d year old. " +
	            "my fav pet is %s and %s",
	            "Leng", 30, "fish", "hamster"
	            );
	    String formatFraction =
	        String.format("my 2 decimal fraction: %.2f", 234.23434);
	    System.out.println(formattedStr);
	    System.out.println(formatFraction);

	    System.out.printf("%s is my string", "400");

//String
// ""
// non-primitive
String myStr2 = new String("this is redundant way");

// + , concat
//System.out.println(myStr + " !!!");

//              0123456789
//                        0   // max index = 10
String myStr = "hello world"; // literal string

// class string
// util method, string method
// string_var.toUpperCase();

// toUpperCase() / toLowerCase()
// length() -> return number of char in str (include empty char)
System.out.println(myStr.length()); // 11

// charAt()
System.out.println(myStr.charAt(0)); // first letter
System.out.println(myStr.charAt(myStr.length()-1)); // last letter

// indexOf() / lastIndexOf() - start search from last index
System.out.println(myStr.indexOf('o')); // 4
// to start search from provided index
System.out.println(myStr.indexOf("o", 5)); // 7
System.out.println(myStr.indexOf("world")); // 6
System.out.println(myStr.indexOf("x")); // -1, myStr not contain 'x'

// startsWith() / endsWith() -> boolean
System.out.println(myStr.startsWith("hell"));
System.out.println(myStr.endsWith("hell"));

// isBlank() / isEmpty() = .lenght() == 0
System.out.println("".isBlank());
System.out.println("".isEmpty());
System.out.println(" \n\t\r   ".isBlank());
System.out.println(" \n\t\r   ".isEmpty());

// contains() -> check if that string contains target str
System.out.println(myStr.contains("346lwergosgr"));

// replace
System.out.println(myStr.replace("l", "!!!!!"));
System.out.println(myStr.replace("o", "")); // remove 'o'
System.out.println(myStr.replaceFirst("o", ""));

//                0123456789
//                          0   // max index = 10
//String myStr = "hello world"; // literal string

// substring()
// to get partial word of the string
System.out.println(myStr.substring(0,myStr.indexOf(" ")));
System.out.println(myStr.substring(myStr.indexOf(" ") + 1));
}}