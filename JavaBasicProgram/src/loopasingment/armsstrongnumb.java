package loopasingment;

public class armsstrongnumb {

	public static void main(String[] args) {
		        int number = 371; // You can change this to any 3-digit number
		        int originalNumber, remainder, result = 0;

		        originalNumber = number;

		        while (originalNumber != 0) {
		            remainder = originalNumber % 10;
		            result += Math.pow(remainder, 3);
		            originalNumber /= 10;
		        }

		        if (result == number) {
		            System.out.println(number + " is an Armstrong number.");
		        } else {
		            System.out.println(number + " is not an Armstrong number.");
		        }
	}
}
		

		// TODO Auto-generated method stub

	


