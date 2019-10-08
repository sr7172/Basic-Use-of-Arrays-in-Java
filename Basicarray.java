/**
 * 
 */
package edu.truman.cs.arrays.shreeya.array;

/**
 * Java program to demonstrate most common use of array
 * to store data of similar type
 * @author sr7172
 *
 */
public class Basicarray 
{
	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		int scores[] = {50,53,58,76,34,36};
		int sum = 0;
		float avg = 0;
		
		for (int count = 0; count < 6; count++) {
				sum = sum + scores[count];
				avg = sum/6;
			}
		System.out.println("The sum of scores is:"+sum);
		System.out.println("The average is:"+avg);
	}
}
