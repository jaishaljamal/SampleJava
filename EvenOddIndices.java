package com.programs;
import java.util.*;  
import java.util.Scanner; 
public class EvenOddIndices {

	public static void printEvenOddIndexes(String word) {          
	    
			System.out.println("Characters in Even Indices:");
	        for (int i = 0; i < word.length(); i += 2) {
	            System.out.print(word.charAt(i));
	        }
	        System.out.println();
	        
	        System.out.println("Characters in Odd Indices:");
	        for (int i = 1; i < word.length(); i += 2) {
	            System.out.print(word.charAt(i));
	        }

	        
	    }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);   
		System.out.print("Enter a string: ");  
		String word= sc.nextLine();   
		printEvenOddIndexes(word);
	}

}
