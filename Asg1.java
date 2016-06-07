import javax.swing.*;

public class Asg1 
{

	public static void main(String[] args) 
	{
		double a = 10;
		double b = 15;
		double c = 20;
		String Color = "white";
		boolean isFilled = false;
		
		String color = JOptionPane.showInputDialog ("Enter the color of the geometric object, Ex: RED");
		
		String filled = JOptionPane.showInputDialog ("Enter true for filled, false for not filled");
		
		try
		{
			if (color == null)
				a = 0 / 0;
			
			isFilled = Boolean.parseBoolean(filled);
			
			String side1 = JOptionPane.showInputDialog ("Enter the first side");
			a = Double.parseDouble(side1);
		
			String side2 = JOptionPane.showInputDialog ("Enter the second side");
			b = Double.parseDouble(side2);
		
			String side3 = JOptionPane.showInputDialog ("Enter the third side");
			c = Double.parseDouble(side3);
		}
		
		catch (Exception e)
		{
			triangle myTriangle = new triangle(color, isFilled);
		}
		

		triangle myTriangle = new triangle(color, isFilled, a, b, c);

		System.out.println(myTriangle.toString());
		System.out.println("Area: " + myTriangle.getArea());
		System.out.println("Perimeter: " + myTriangle.getPerimeter());
	}
}