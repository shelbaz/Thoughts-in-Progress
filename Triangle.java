
public class Triangle extends GeometricObject 
{

	private double side1 = 1.0;
	private double side2 = 1.0;
	private double side3 = 1.0;

	public Triangle() 
	{
		side1 = 0.0;
		side2 = 0.0;
		side3 = 0.0;
	}

	public Triangle(double a, double b, double c, String color, boolean filled) 
	{
		side1 = a;
		side2 = b;
		side3 = c;
		setColor(color);
		setFilled(filled);
	}
	
	public void show() 
	{
		System.out.println(side1 + "," + side2 + "," + side3 + ",");
	}

	public double getArea()
	{
		return ((side1 * side2 * (sqrt(side1*side2))/2);
	}

	public double getPerimeter(){
		return (side1 + side2 + side3);
	}

	public String toString()
	{
		return "Triangle: side1 = " + side1 + " side2 = " + side2 +
				" side3 = " + side3;
	}
}