
public class pentagonal 
{
	// invoke the getPentagonalNumber method and prints out the numbers
	public static void main(String[] args)
	{
		int number = 1;
		// count the numbers under 100
		for (int count = 1; count <= 100; count++)
		{
			System.out.print(getPentagonalNumber(number) + "\t");
			number++;
			// change line if the number in a line passes 10
			if ((count % 10) == 0)
			{
				System.out.println();
			}
		}
	}
	
	public static int getPentagonalNumber(int n)
	{
		n = n * (3 * n - 1 ) / 2;
		return n;
	}
}
