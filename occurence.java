import java.util.Scanner;

public class occurence 
{
	public static void main(String[] args)
	{
		
// Ask the numbers from the user
		Scanner input = new Scanner(System.in);
		System.out.print("Enter numbers: ");
		int max = input.nextInt();
		int count = 1;

// If the user only enters 0
		if (max == 0)
		{
			System.out.println("You only entered 0, the program ended.");
			System.exit(0);
		}

// Compare the next input with max
		for (int userinput = input.nextInt(); userinput != 0; userinput = input.nextInt()) 
		{
			if (userinput == max) 
			{
				count++;
			}
			else if (userinput > max) 
			{
			max = userinput;
			count = 1;
			}
		}
		
// Print the results
		System.out.println("The largest number is " + max);
		System.out.println("The occurence count of the largest number is " + count);
	}
}
