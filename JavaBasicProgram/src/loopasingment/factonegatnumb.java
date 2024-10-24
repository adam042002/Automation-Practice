package loopasingment;

public class factonegatnumb {

	

	public static void main(String[] args) {
		//Define negative number
		int number =-60;
		 System.out.print("Factors of " + number + " are: ");
		
		 // Loop from -60 to 60
	        for (int i = number; i <= Math.abs(number); ++i) {
	            // Skip iteration for i = 0
	            if (i == 0) {
	                continue;
	            }
	            // Check if i is a factor
	            if (number % i == 0) {
	                System.out.print(i + " ");
	            }
	        }
		
		
		// TODO Auto-generated method stub

	}
	}

