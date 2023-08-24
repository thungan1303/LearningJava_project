package day16_4threview;

public class Nested_Loop_Review {

	public static void main(String[] args) {
		// NESTED LOOP IN THE LOOP
		// WHAT TO WATCH:
		// indentation / format
		// braces
		// nested  loop in the loop
	    // what to watch:
	    // indentation / format
	    // braces

	    int i = 0, j = 0;
	    outer:
	    while (i < 3) {
	      j = 0;
	      inner:
	      while (j < 3) {
	        System.out.println("hello world");
	        j++;
	      }
	      i++;
	    }

	    System.out.println("=====");

	    for (int k = 0; k < 3; k++) {
	      for (int l = 0; l < 3; l++) {
	        System.out.println("hello world from for loop");
	      }
	    }

	    // table,
	    // get value from table, create table

	    row: // label
	    for (int row = 0; row < 10; row++) {
	      col:
	      for (int col = 0; col < 8; col++) { // 2 times
	        System.out.print("* ");
	      }
	      System.out.println();
	    }}}