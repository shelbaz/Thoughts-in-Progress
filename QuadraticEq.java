// This program calculates a quadratic equation
import javax.swing.JOptionPane;


public class QuadraticEq 
{
	public static void main(String[] args) 
	{
		// Ask the values
		String Userimputa = JOptionPane.showInputDialog ("Enter the value a");
		String Userimputb = JOptionPane.showInputDialog ("Enter the value b");
		String Userimputc = JOptionPane.showInputDialog ("Enter the value c");
		
		// Cast String imputs to double
		double a = Double.parseDouble(Userimputa);
		double b = Double.parseDouble(Userimputb);
		double c = Double.parseDouble(Userimputc);
		double d = (Math.pow(b,2) - 4 * a * c);
		
		// Calculate roots according to the sign of the discriminant
		if (d > 0)
		{
			double r1 = ((-b) + Math.sqrt(d)) / (2 * a);
			double r2 = ((-b) - Math.sqrt(d)) / (2 * a);
			System.out.printf ("The roots are " + r1 + " and  " + r2);
		}
		else if (d == 0)
		{
			double r1 = ((-b) + Math.sqrt(d)) / (2 * a);
			System.out.printf ("r1 = " + r1);
		}
		else
		{
			System.out.println ("The equation has no real roots.");
		}
		
	}	
}
