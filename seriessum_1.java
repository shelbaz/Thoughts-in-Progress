
public class seriessum 
{
	public static void main(String []args)
	{
		double top = 1;
		double bottom = 3;
		double sum = 0;
		
		while (bottom <= 99)
		{
			sum = sum + (top / bottom);
			top = top + 2;
			bottom = bottom + 2;
		}
		System.out.print("= " + sum);
	}
}
