// This program checks if a point in inside a rectangle
import javax.swing.JOptionPane;


public class Rectanglepoint
{
	public static void main(String[] args) 
	{
		// Ask the x and y
		String Userimputa = JOptionPane.showInputDialog ("Enter x");
		String Userimputb = JOptionPane.showInputDialog ("Enter y");
	
		// Cast the user imput to a variable
		double x = Double.parseDouble(Userimputa);
		double y = Double.parseDouble(Userimputb);
						
		// calculate the distance to the cercle
		double hdrule = 10.0 / 2;
		double vdrule = 5.0 / 2;
		
		// show if the point is inside the rectangle
		if (x <= hdrule && y <= vdrule)
		{
			System.out.println ("Point (" + x + ", " + y + ") is in the rectangle.");
		}
		else 
		{
			System.out.println ("Point (" + x + ", " + y + ") is not in the rectangle.");
		}
	}	
}