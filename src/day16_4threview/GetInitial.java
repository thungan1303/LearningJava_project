package day16_4threview;

public class GetInitial {

	public static void main(String[] args) {
		// get initial

		String fullName = "tom hank";
	    char firstLetter = fullName.charAt(0);
	    int spaceIndex = fullName.lastIndexOf(" ");
	    char secondLetter = fullName.charAt(spaceIndex + 1);
	    String initial = (firstLetter+""+secondLetter).toUpperCase();
	    System.out.println(initial);
	    
	}

}
