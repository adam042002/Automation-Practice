package Arrayexampleassign;

public class secondlargest {


		public static int getsecondLargest(int[] a, int total){  
			int temp;  
			for (int i = 0; i < total; i++)   
			        {  
			            for (int j = i + 1; j < total; j++)   
			            {  
			                if (a[i] > a[j])   
			                {  
			                    temp = a[i];  
			                    a[i] = a[j];  
			                    a[j] = temp;  
			                }  
			            }  
			        }  
			       return a[total-2];  
			}  
	public static void main(String args[]){  
			int a[]={1,2,5,6,3,2,7};  
			int b[]={44,66,99,77,33,22,55};  
			System.out.println("Second Largest: "+getsecondLargest(a,7));  
			System.out.println("Second Largest: "+getsecondLargest(b,7));  
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub

	}

}