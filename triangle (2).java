public class triangle extends GeometricObject 
{

	double side1 = 10;
	double side2 = 15;
	double side3 = 20;

	public triangle(String Color, boolean Filled) 
	{
		// default triangle
		color = Color;
		filled = Filled;
	}

	public triangle(String Color, boolean Filled, double a, double b, double c) 
	{
		this.side1 = a;
		this.side2 = b;
		this.side3 = c;
		color = Color;
		filled = Filled;
	}

	public void show() 
	{
		System.out.println(side1+","+side2+","+side3+",");
	}

	public double getArea()
	{
		double p = getPerimeter() / 2;
		return Math.sqrt(p*(p-side1)*(p-side2)*(p-side3));
	}

	public double getPerimeter()
	{
		return (side1 + side2 + side3);
	}

	@Override
	public String toString()
	{
		return "Triangle: side1 = " + side1 + " side2 = " + side2 +
				" side3 = " + side3 + "\nColor: " + color + "\nfilled: " + filled;
	}
}
