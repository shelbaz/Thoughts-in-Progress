import java.util.*;
import java.lang.*;

public class ArrayIndexOutOfBoundsException 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);//declaring the scanner
		System.out.print("Enter an integer: ");
		
		//creating the 100 index array of integer		
		int[]array = new int[100];

		// put 100 random integers in the array
		for(int i = 0; i < 100; i++)
			array[i] = (int)(Math.random()*10);
		
		// try to print the value of the inputed index
		try
		{
			int index = input.nextInt();
			System.out.println("The value at the index " + index + " is: " + array[index]);
			
		}
		// if the index is out of bounds catch the index and display out of bounds 
		catch(IndexOutOfBoundsException ex)
		{
			System.out.println("Out of Bounds");

		}
	}
}