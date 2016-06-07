import java.util.Scanner;

public class PointPosition 
{
	public static void main(String[] args)
	{
		System.out.print("Enter three points for p0, p1, and p2: ");
		Scanner input = new Scanner (System.in);
		double px0 = input.nextDouble();
		double py0 = input.nextDouble();
		double px1 = input.nextDouble();
		double py1 = input.nextDouble();
		double px2 = input.nextDouble();
		double py2 = input.nextDouble();
		
		if (!leftOfTheLine(px0, py0, px1, py1, px2, py2) && !onTheSameLine(px0, py0, px1, py1, px2, py2))
		{
			System.out.println("the point (" + px2 + "," + py2 + ") is on the right of the line.");
		}
		
		else if (leftOfTheLine(px0, py0, px1, py1, px2, py2) && !onTheSameLine(px0, py0, px1, py1, px2, py2))
		{
			System.out.println("the point (" + px2 + "," + py2 + ") is on the left of the line.");
		}
		
		else if (onTheSameLine(px0, py0, px1, py1, px2, py2))
		{
			if (px2 <= px1 && px2 >= px0)
			{
				System.out.println("the point (" + px2 + "," + py2 + ") is on the segment");
				System.exit(0);
			}
			if (px2 >= px1 && px2 <= px0)
			{
				System.out.println("the point (" + px2 + "," + py2 + ") is on the segment");
				System.exit(0);
			}
			System.out.println("the point (" + px2 + "," + py2 + ") is on the continuous of the segment");
		}
	}
	
	public static boolean leftOfTheLine(double x0, double y0, double x1, double y1, double x2, double y2)
	{
		if (((x1 - x0) * (y2 - y0) -  (x2 - x0) * (y1 - y0)) > 0)
		{
			return true;
		}
		return false;
	}
	
	public static boolean onTheSameLine(double x0, double y0, double x1, double y1, double x2, double y2)
	{
		if (((x1 - x0) * (y2 - y0) -  (x2 - x0) * (y1 - y0)) == 0)
		{
			return true;
		}
		return false;
	}
	
	public static boolean onTheLineSegment(double x0, double y0, double x1, double y1, double x2, double y2)
	{
		if (((x1 - x0) * (y2 - y0) -  (x2 - x0) * (y1 - y0)) == 0 && x2 < x0 && x1 < x0 || x2 > x0 && x1 > x0)
		{
			return true;
		}
		return false;
	}

}
