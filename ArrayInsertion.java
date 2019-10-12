package edu.truman.cs.arrays.shreeya.array;

import java.util.Scanner;

/**
 * Java program to demonstrate most common use of array for insertion
 * Insertion allows addition of an element at the given index
 * @author sr7172
 *
 */
public class ArrayInsertion {

	public static void main(String[] args) 
	{
		
	 int position,num_of_elements, in_element;
	 
	 System.out.println("Enter the number of elements in your array:");
	 Scanner s = new Scanner(System.in);
	 num_of_elements = s.nextInt();
	
	 int original_array[] = new int[num_of_elements + 1] ;
	 System.out.println("Enter the elements of the array:");
	 	for(int i = 0; i < num_of_elements; i++) {
	 		original_array[i] = s.nextInt();
	 	}
		
	 System.out.println("Enter the position for insertion:");
	 position= s.nextInt();
	 
	 System.out.println("Enter the element for insertion:");
	 in_element= s.nextInt();
	 
		 for(int i = (num_of_elements -1 ); i > (position - 1); i--){
			 original_array[i+1] = original_array[i];
		 }
		 original_array[position -1]= in_element;
	 
	 System.out.print("After inserting:");
	     for(int i = 0; i < num_of_elements; i++){
	         System.out.print(original_array[i]+",");
	     }
	     
     System.out.println(original_array[num_of_elements]);
     }
	}


