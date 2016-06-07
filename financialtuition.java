
public class financialtuition
{
	public static void main(String[] args)
	{
		// declare and initialize variables
		double m = 10000;
		double n = 0.0;
		int year = 0;
		int year2 = 0;
		double total4 = 0;
		
		// apply the loop
		while (year < 10)
		{
			if (year == 9)
			{
				n = m;
			}
			m = m + (m * 0.05);
			year++;
		}
		System.out.println("Tuition 10 years from now: " + m);

		// apply the second loop
		while (year2 < 4)
		{
			n = n + (n * 0.05);
			year2++;
			total4 = total4 + n;
		}
		System.out.println("Tuition of 4 years after 10 years: " + total4);
		System.exit(0);
	}
}