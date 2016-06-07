// This program checks if a point in inside a cercle
import javax.swing.JOptionPane;


public class Cerclepoint
{
	public static void main(String[] args) 
	{
		// Ask the x and y
		String Userimputa = JOptionPane.showInputDialog ("Enter x");
		String Userimputb = JOptionPane.showInputDialog ("Enter y");
	
		// Cast the user imput to a variable
		double x = Double.parseDouble(Userimputa);
		double y = Double.parseDouble(Userimputb);
		double powx = Math.pow(x, 2);
		double powy = Math.pow(y, 2);
		
		// calculate the distance to the cercle
		double d = Math.sqrt(powx + powy);
		
		if (d <= 10)
		{
			System.out.println ("Point (" + x + ", " + y + ") is in the cercle.");
		}
		else 
		{
			System.out.println ("Point (" + x + ", " + y + ") is not in the cercle.");
		}
	}	
}