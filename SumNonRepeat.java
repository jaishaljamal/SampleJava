package com.programs;
import java.util.*;
import java.util.Scanner; 

public class SumNonRepeat {
	static int findSum(int arr[], int n)
	{
		int sum = 0;
		HashSet<Integer> s = new HashSet<Integer>();
		for (int i = 0; i < n; i++)
		{
			if (!s.contains(arr[i]))
			{
				sum += arr[i];
				s.add(arr[i]);
			}
			}
			return sum;
		}	
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;  
		Scanner sc=new Scanner(System.in);  
		System.out.print("Enter the size of array: ");  
		n=sc.nextInt();  
		
		int[] array = new int[10];  
		System.out.println("Enter the elements of the array: ");  
		for(int i=0; i<n; i++)  
		{  
		
		array[i]=sc.nextInt();  
		} 
		System.out.println("Sum of non repeated elements :"+findSum(array, n));
	}
	

}
