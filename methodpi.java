
public class methodpi 
{
	public static void main(String[] args)
	{
		System.out.println("i\t\t\tm(i)\n______________________________");
		
		// loop and increment i when i is small than 901
		for (double i = 1; i <= 901; i += 100)
		{
						
			if ((i % 100) == 1)
			{
				System.out.print((float)i + "\t\t\t" + (float)estimatepi(i) + "\n");
			}
		}
	}
	
	// get the value of pi based on i
	public static double estimatepi(double i)
	{
		double sum = 0;
		double mi = 0;
		for (int count = (int) i; count > 0; count--)
		{
			sum += (Math.pow((-1.0), count + 1.0)) / (2.0 * count - 1.0);
			mi = 4 * sum;
		}

		return mi;
	}
}

