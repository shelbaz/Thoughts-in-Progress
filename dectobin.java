// this was really really really hard......

import java.util.Scanner;

public class dectobin
{
	public static void main(String[] args)
	{

// Ask an integer from the user
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int decimal = input.nextInt();
	
// Create a string variable
		String revbinary = "";
		int number = decimal;

// Loop if the remaining number isn't 2, and add the next binary number into the string binary.
		while (number != 0) 
		{
			revbinary += (number % 2);
			number /= 2;
		}
// reverse
		String binary = "" ;
		for(int i = revbinary.length() -1 ; i >= 0 ; i--)
		{
			binary = binary + revbinary.charAt(i);
		} 

// Print the results
		System.out.println("The binary value of the integer " + decimal + " is " + binary);
	}
}