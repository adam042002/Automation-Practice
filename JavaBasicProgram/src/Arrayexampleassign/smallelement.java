package Arrayexampleassign;

public class smallelement {

	
		    public static void main(String[] args) {
		        // Initialize array
		        int[] arr = {25, 11, 7, 75, 56};
		        
		        // Initialize min with the first element of the array
		        int min = arr[0];
		        
		        // Loop through the array
		        for (int i = 1; i < arr.length; i++) {
		            // Compare elements of array with max
		            if (arr[i] < min) {
		            	min = arr[i];
		            }
		        }
		        
		        // Print the smallest element
		        System.out.println("smallest element present in the given array: " + min);
		    }
		

		// TODO Auto-generated method stub

	}


