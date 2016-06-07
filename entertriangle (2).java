import java.util.Scanner;

public class entertriangle
{
	public static void main(String[] args)
	{
		// ask the number from the user
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of lines: ");
		int nbl = input.nextInt();
		
		// stop the program if the number falls out of range
		if (nbl < 1 || nbl > 15) 
		{
			System.out.println("Please enter an integer from 1 to 15");
		}
		
		// if the number of lines is lower than the input, loop
		for (int l = 1; l <= nbl; l++)
		{
			// print the space before the numbers
			for (int c = 1; c <= nbl - l; c++) 
			{
				System.out.printf("\t");
			}
			// print the numbers on the right
			for (int nb = l; nb >= 1; nb--)
			{
				System.out.printf("\t" + nb);
			}
			// print the numbers on the left
			for (int nb = 2; nb <= l; nb++) 
			{
				System.out.printf("\t" + nb);
			}
			// print a new line
			System.out.println();
		}
	}
}