
public class divisible56
{
	public static void main(String[] args)
	{
		// declare and initialize variables
		int nbs = 100;
		
		// apply the loop
		
		while (nbs <= 1000)
		{
			int x = 10;
			while (x > 0)
			{
				nbs++;
				double d5 = nbs % 5.0;
				double d6 = nbs % 6.0;
			
				if (d5 == 0 && d6 == 0 && nbs < 1000)
				{
					System.out.print(nbs + " ");
					x--;
				}
			}
			System.out.println();
			System.exit(0);
		}
	}
}