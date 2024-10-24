package Arrayexampleassign;

public class evenposition {

	public static void main(String[] args) {
		
		        // Initialize array
		        int[] arr = new int[] {1, 2, 3, 4, 5, 6};

		        System.out.println("Elements of given array present on even positions:");

		        // Loop through the array by incrementing value of i by 2
		        // Here, i will start from 1 as the first even positioned element is present at position 1.
		        for (int i = 1; i < arr.length; i += 2) {
		            System.out.println(arr[i]);
		        }
		    }
		

		// TODO Auto-generated method stub

	}


