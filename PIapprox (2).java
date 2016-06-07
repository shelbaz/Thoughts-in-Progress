public class PIapprox
{
	public static void main(String[] args)
	{
		double pi = 0;
		double sum = 0;
		
		for (int i = 1; i <= 100000; i++)
		{
			sum += (Math.pow((-1), i + 1)) / (2 * i - 1);
			pi = 4 * sum;
			
			if ((i % 10000) == 0)
			{
				System.out.println("If i = " + i + ", π = " + pi);
			}
		}
		System.exit(0);
	}
}