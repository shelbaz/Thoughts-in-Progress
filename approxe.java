public class approxe
{
	public static void main(String[] args)
	{
		double e = 1;
		double i = 1;
		double k = 1;
		double add = 1;
		
		for (int range = 10000; range <= 100000; range += 10000)
		{
			while (range >= i)
			{
				k = k * i;
				add = (1/k);
				e += add;
				i++;
			}
			System.out.println("If i " + range + ", e = " + e);
		}
	}
}