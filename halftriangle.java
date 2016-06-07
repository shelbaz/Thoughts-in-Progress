import java.util.Scanner;

public class halftriangle 
{
	// receives the number of lines from the user 
	public static void main(String[] args)
	{
		System.out.println("Enter a number");
		Scanner input = new Scanner (System.in);
		displayPattern(input.nextInt());
	}
	
	// receive the number of lines from the main method and prints the piramid
	public static void displayPattern(int n)
	{
		if (n >= 10)
		{
			// number of lines according to the input
			for (int lines = n; lines >= 0; lines--)
			{
				// number of spaces according to which line it is currently on
				for (int spaces = lines; spaces > 0; spaces--)
				{
					System.out.print("\t");
				}
				// prints the number according to which line it is
				for (int number = n - lines; number >= 1; number--)
				{
					System.out.print(number + "\t");
				}
				// print lines
				System.out.println();
			}
		}
		
		if (n <= 10)
		{
			// number of lines according to the input
			for (int lines = n; lines >= 0; lines--)
			{
				// number of spaces according to which line it is currently on
				for (int spaces = lines; spaces > 0; spaces--)
				{
					System.out.print("  ");
				}
				// prints the number according to which line it is
				for (int number = n - lines; number >= 1; number--)
				{
					System.out.print(number + " ");
				}
				// print lines
				System.out.println();
			}
		}
	}
}