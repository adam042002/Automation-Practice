package Arrayexampleassign;

public class largestelement {

	public static void main(String[] args) {
				        // Initialize array
		        int[] arr = {25, 11, 7, 75, 56};
		        
		        // Initialize max with the first element of the array
		        int max = arr[0];
		        
		        // Loop through the array
		        for (int i = 1; i < arr.length; i++) {
		            // Compare elements of array with max
		            if (arr[i] > max) {
		                max = arr[i];
		            }
		        }
		        
		        // Print the largest element
		        System.out.println("Largest element present in the given array: " + max);
		    }
		}


		// TODO Auto-generated method stub

	


