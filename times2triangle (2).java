public class times2triangle
{
	public static void main(String[] args)
	{

		// if the number of lines is lower than the input, loop
		for (int l = 1; l <= 8; l++)
		{
			int left = 1;
			int right = 1;
			// print the space before the numbers
			for (int c = 1; c <= 8 - l; c++) 
			{
				System.out.print("\t");
			}
			// print the numbers on the left
			for (int nb = l; nb >= 1; nb--)
			{
				System.out.print("\t" + left);
				left = left * 2;
			}
			// print the numbers on the right
			right = left / 4;
			for (int nb = 2; nb <= l; nb++) 
			{
				System.out.print("\t" + right);
				right = right / 2;
			}
			// print a new line
			System.out.println();
		}
	}
}