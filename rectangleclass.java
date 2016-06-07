
public class rectangleclass 
{
	static double width;
	static double height;
	
	rectangleclass()
	{
		width = 1;
		height = 1;
	}

	rectangleclass(double newWidth, double newHeight)
	{
		width = newWidth;
		height = newHeight;
	}
	
	public static double getArea()
	{
		return (width * height);
	}
	
	public static double getPerimeter()
	{
		return (2 * width) + (2 * height);
	}
}


