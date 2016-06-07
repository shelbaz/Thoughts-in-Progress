
public class milestok
{
	public static void main(String[] args)
	{
		// declare and initialize variables
		double m = 1;
		double k = 0;

		// print kilograms and pounds columns
		System.out.println("Miles\t\tKilometers");
		
		// apply the loop
		while (m <= 10)
		{
			k = m * 1.609;
			System.out.println(m + "\t" + "\t" + k);
			m++;
		}
	}
}