import java.util.Scanner;

public class enterpyramid 
{
	public static void main(String[] args)
	{
		// ask the number of lines
		System.out.println("Enter the number of lines: ");
		Scanner input = new Scanner (System.in);
		int nb = input.nextInt();
		int nbl = nb;
		int line = 1;
		int space = nb;
		int left = nb;
		int right = 1;

		// build the pyramid
		if (nb < 1 || nb > 15)
		{
			System.out.println("Please enter an integer from 1 to 15");
		}
		
		for (line = 1; line <= nbl; line++)
		{
			for (space = nb; space > 0; space--)
			{
				System.out.print("\t");
			}
			for (left = line; left > 1; left--)
			{
				System.out.print(left + "\t");
			}
			for (right = 1; right <= line; right++)
			{
				if (right == 1)
				{
					System.out.print(right);
				}
				else
				{
					System.out.print("\t" + right);
				}	
			}
			System.out.print("\n");
			nb--;
		}
	}
}