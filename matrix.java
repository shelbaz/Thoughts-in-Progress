import java.util.Scanner;

public class matrix
{
	public static void main(String[] args)
	{
		// ask the user for a number
		System.out.print("Enter n: ");
		Scanner input = new Scanner (System.in);
		int userinput = input.nextInt();
		
		printMatrix(userinput);
	}

	public static void printMatrix(int n) 
	{
		for (int lines = 1; lines <= n; lines++) 
		{
			for (int columns = 1; columns <= n; columns++) 
			{
				// generate a random number (if bigger than 0.5 it will be 1 if not it will be 0)
				int randomnumber = (int) (Math.random() * 2);
				System.out.print(randomnumber + " ");
			}
			System.out.println();
		}
	}
}