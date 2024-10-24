package Arrayexampleassign;

public class leftrotate {

	
		    // Function to left rotate an array by one position
		    public static void leftRotateByOne(int[] arr) {
		        int n = arr.length;
		        int temp = arr[0];
		        for (int i = 0; i < n - 1; i++) {
		            arr[i] = arr[i + 1];
		        }
		        arr[n - 1] = temp;
		    }

		    // Function to left rotate an array by d positions
		    public static void leftRotate(int[] arr, int d) {
		        for (int i = 0; i < d; i++) {
		            leftRotateByOne(arr);
		        }
		    }

		    // Function to print the array
		    public static void printArray(int[] arr) {
		        for (int i : arr) {
		            System.out.print(i + " ");
		        }
		        System.out.println();
		    }

		    public static void main(String[] args) {
		        int[] arr = {1, 2, 3, 4, 5};
		        int d = 2;

		        System.out.println("Original array:");
		        printArray(arr);

		        leftRotate(arr, d);

		        System.out.println("Array after left rotation by " + d + " positions:");
		        printArray(arr);
		    }
		

		// TODO Auto-generated method stub

	}


