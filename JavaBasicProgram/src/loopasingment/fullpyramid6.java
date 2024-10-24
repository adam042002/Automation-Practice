package loopasingment;

public class fullpyramid6 {

	public static void main(String[] args) {
		int rows = 5, e = 0;

	    for (int i = 1; i <= rows; ++i, e = 0) {
	      for (int space = 1; space <= rows - i; ++space) {
	        System.out.print("  ");
	      }

	      while (e != 2 * i - 1) {
	        System.out.print("* ");
	        ++e;
	      }

	      System.out.println();
	    }
		// TODO Auto-generated method stub

	}

}
