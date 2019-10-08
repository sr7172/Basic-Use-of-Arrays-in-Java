package edu.truman.cs.arrays.shreeya.array;

public class ArrayIndex 
{

	public static void main(String[] args) 
	{
		 // declares an Array of int. 
	      int[] given_array; 
	          
	      // allocating memory. 
	      given_array = new int[5]; 
	          
	      // initialize the elements of the array 
	      given_array[0] = 1; 
	      given_array[1] = 2; 
	      given_array[2] = 3; 
	      given_array[3] = 4; 
	      given_array[4] = 5; 
	          
	      // accessing the elements of the array 
	      for (int i = 0; i < given_array.length; i++) {
	         System.out.println("Element at index " + i + " is : "+ given_array[i]);     
	      }
	}//end of main
}//end of class
