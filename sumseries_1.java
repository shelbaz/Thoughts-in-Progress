
public class sumseries 
{
	public static void main(String[] args)
	{
		System.out.println("i\t\t\tm(i)\n____________________________");
		int num = 1;
		mi(num);
	}
	
	public static double mi(double i)
	{
		double mi = 0;
		for (i = i; i <= 20; i++)
		{
			mi += i / (i + 1.0);
			System.out.print((int)i + "\t\t\t" + (float)mi + "\n");
		}
		return i;
	}
}
