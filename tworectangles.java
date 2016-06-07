import java.util.Scanner;


public class tworectangles
{
	public static void main(String[] args) 
	{
		// Ask a values
		System.out.println ("Enter r1's center x-, y-coordinates, width, and height");
		Scanner input = new Scanner (System.in);
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double w1 = input.nextDouble();
		double h1 = input.nextDouble();
		
		System.out.println ("Enter r2's center x-, y-coordinates, width, and height");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double w2 = input.nextDouble();
		double h2 = input.nextDouble();
	
		// calculate the limits of the first rectangle
		double pr1x1 = ((-w1) / 2) + x1;
		double pr1x2 = ((w1) / 2) + x1;
		double pr1y1 = ((h1) / 2) + y1;
		double pr1y2 = ((-h1) / 2) + y1;
		
		// calculate the limits of the second rectangle
		double pr2x1 = ((-w2) / 2) + x2;
		double pr2x2 = ((w2) / 2) + x2;
		double pr2y1 = ((h2) / 2) + y2;
		double pr2y2 = ((-h2) / 2) + y2;
		
		if (pr2x1 >= pr1x1 && pr2y1 <= pr1y1 && pr2x2 <= pr1x2 && pr2y2 >= pr1y2)
		{
			System.out.println ("r2 is inside r1");
		}
		else if (pr2x2 < pr1x1 || pr2x1 > pr1x2 || pr2y2 > pr1y1 || pr2y1 < pr2y2)
		{
			System.out.println ("r2 does not overlap r1");
		}
		else
		{
			System.out.println ("r2 overlaps with r1");
		}
	}
}