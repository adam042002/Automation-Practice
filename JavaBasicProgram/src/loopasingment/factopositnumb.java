package loopasingment;

public class factopositnumb {

	public static void main(String[] args) {
		// Define the positive number
        int number = 60;
        System.out.print("Factors of " + number + " are: ");
        
        // Loop from 1 to the number
        for (int i = 1; i <= number; ++i) {
            // Check if i is a factor of number
            if (number % i == 0) {
                System.out.print(i + " ");
            }

		// TODO Auto-generated method stub

	}
	}
	
	
}
