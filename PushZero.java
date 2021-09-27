package com.programs;

import java.util.Scanner;  
public class PushZero {

	
		static void pushZerosToEnd(int arr[], int n)
		{
			int count = 0; 
			for (int i = 0; i < n; i++)
				if (arr[i] != 0)
					arr[count++] = arr[i]; 

			
			while (count < n)
				arr[count++] = 0;
		}

		
public static void main (String[] args)
{
		int n;  
		Scanner sc=new Scanner(System.in);  
		System.out.print("Enter the number of elements: "); 
		n=sc.nextInt();  
					
			int[] array = new int[10];  
			System.out.println("Enter the elements of the array: ");  
			for(int i=0; i<n; i++)  
			{  
			  array[i]=sc.nextInt();  
			}  
				
			pushZerosToEnd(array, n);
			System.out.println("Array after pushing zeros to the back: ");
			for (int i=0; i<n; i++)
				System.out.print(array[i]+" ");
			}
		
	}



