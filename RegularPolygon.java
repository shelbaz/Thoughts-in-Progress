
public class RegularPolygon
{
	private int n;
	private double side;
	private double x;
	private double y;
	
	RegularPolygon()
	{
		n = 3;
		side = 1;
		x = 0;
		y = 0;
	}
	
	public RegularPolygon(int a, double b)
	{
		n = a;
		side = b;
		x = 0;
		y = 0;
	}
	
	public RegularPolygon(int a, double b, double c, double d)
	{
		n = a;
		side = b;
		x = c;
		y = d;
	}
	
	public double getPerimeter()
	{
		return (side * n);
	}
	
	public double getArea()
	{
		return (n * Math.pow(side, 2)) / (4 * (Math.tan(Math.PI / n)));
	}


	public static void main(String []args)
	{
	
	RegularPolygon p1 = new RegularPolygon();
	RegularPolygon p2 = new RegularPolygon(6 , 4);
	RegularPolygon p3 = new RegularPolygon(10 , 4 , 5.6 , 7.8);
	
	System.out.println("The perimeter for the first polygon is: " + p1.getPerimeter() 
					+ "\nThe area for the first polygon is: " + p1.getArea() + "\n");
	
	System.out.println("The perimeter for the second polygon is: " + p2.getPerimeter() 
					+ "\nThe area for the second polygon is: " + p2.getArea() + "\n");
	
	System.out.println("The perimeter for the third polygon is: " + p3.getPerimeter() 
					+ "\nThe area for the third polygon is: " + p3.getArea() + "\n");
	
	}
}
