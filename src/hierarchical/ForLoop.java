package hierarchical;

import java.util.Scanner;

public class ForLoop { 
	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);  
		System.out.print("Enter the number of elements you want to store: ");  
		n=sc.nextInt();
		int [] a=  new int  [5]; 		
		System.out.println("Enter the elements of the array: ");  
		for(int i=0; i<n; i++)  
		{  
		//reading array elements from the user   
		a[i]=sc.nextInt();  
		}  
		 
		
		 System.out.println("length of the array is " +a.length);
			
			for (int i = 0; i <a.length ; i++) {
				System.out.println(a[i]);
			                     
			
			}			
	}
			}
		
				
			
		
		  
	
		
		
		
	


