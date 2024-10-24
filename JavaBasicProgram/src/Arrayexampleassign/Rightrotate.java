package Arrayexampleassign;

public class Rightrotate {

	public static void main(String[] args) {
		
		 
        // Initialize array
        int[] arr = new int[]{1, 2, 3, 4, 5};
        // Number of times to rotate the array
        int n = 3;

        System.out.println("Original array: ");
        for (int i = 0; i <arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        // Rotate the array to the left n times
        for (int i = 0; i < n; i++) {
            int j, first;
            // Store the first element of the array
            first = arr[0];
            for (j = 0; j < arr.length - 1; j++) {
                // Shift elements to the left by one position
                arr[j] = arr[j + 1];
            }
            // Move the first element to the end of the array
            arr[j] = first;
        }

        System.out.println("\nArray after right rotation: ");
        for (int i = 0; i< arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
		// TODO Auto-generated method stub

	}

}
