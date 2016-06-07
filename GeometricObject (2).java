
public abstract class GeometricObject 
{

	static String color;
	static boolean filled;

	public GeometricObject() 
	{
	}
	
	public GeometricObject(String Color, boolean Filled) 
	{
		color = Color;
		filled = Filled;
	}

	/**Getter method for color*/
	public String getColor() 
	{
		return color;
	}

	/**Setter method for color*/
	public void setColor(String Color) 
	{
		color = Color;
	}

	/**Getter method for filled. Since filled is boolean,
	so, the get method name is isFilled*/
	public boolean isFilled() 
	{
		return filled;
	}

	/**Setter method for filled*/
	public void setFilled(boolean Filled) 
	{
		filled = Filled;
	}

	/** Return a string representation of this object*/
	public String toString() 
	{
		return "Color: " + color + "and filled: " + filled;
	}
	
	public abstract double getPerimeter();
	
	public abstract double getArea();
}