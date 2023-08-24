package day11_forLoop;

public class Task7 {

	public static void main(String[] args) {
		// valid browsers: chrome, firefox, opera, safari, edge, ie
		//String str = "chrome"
			//	Output: CHROME BROWSER IS SELECTED

		String str = "chrome";
		switch (str) {
		case "chrome":
			System.out.println("CHROME BROWSER IS SELECTED");
			break;
		case "firefox":
			System.out.println("FIREFOX BROWSER IS SELECTED");
			break;
		case "opera":
			System.out.println("OPERA BROWSER IS SELECTED");
			break;	
		case "edge":
			System.out.println("EDGE BROWSER IS SELECTED");
			break;	
			
		}
	}

}
