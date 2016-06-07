// This program calculates the area of a triangle
import javax.swing.JOptionPane;


public class AreaOfTriangle 
{
	public static void main(String[] args) 
	{
		// Ask the coordinates from the user
		String Userimputx1 = JOptionPane.showInputDialog ("Enter x1");
		String Userimputy1 = JOptionPane.showInputDialog ("Enter y1");
		String Userimputx2 = JOptionPane.showInputDialog ("Enter x2");
		String Userimputy2 = JOptionPane.showInputDialog ("Enter y2");
		String Userimputx3 = JOptionPane.showInputDialog ("Enter x3");
		String Userimputy3 = JOptionPane.showInputDialog ("Enter y3");
		
		// Set the variables
		double x1 = Double.parseDouble(Userimputx1);
		double y1 = Double.parseDouble(Userimputy1);
		double x2 = Double.parseDouble(Userimputx2);
		double y2 = Double.parseDouble(Userimputy2);
		double x3 = Double.parseDouble(Userimputx3);
		double y3 = Double.parseDouble(Userimputy3);
		
		// Calculate the area
		double deltax1 = (x2-x1);
		double deltay1 = (y2-y1);
		double deltax2 = (x3-x2);
		double deltay2 = (y3-y2);
		double deltax3 = (x1-x3);
		double deltay3 = (y1-y3);
		
		double side1 = Math.sqrt((Math.pow(deltax1,2.0)+Math.pow(deltay1,2.0)));
		double side2 = Math.sqrt((Math.pow(deltax2,2.0)+Math.pow(deltay2,2.0)));
		double side3 = Math.sqrt((Math.pow(deltax3,2.0)+Math.pow(deltay3,2.0)));
		double s = (side1 + side2 + side3)/2;
		
		double area = Math.sqrt(s * (s-side1) * (s-side2) * (s-side3));
		
		if (side1==0 || side2==0 || side3==0)
		{
			System.out.println("It is impossible for one of the sides to have 0 as distance.");
		}
		else 
		{
			System.out.println ("The area is " + area);
		}	
	}	
}