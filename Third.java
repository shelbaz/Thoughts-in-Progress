// This program reverses the digits
import javax.swing.JOptionPane;


public class Third 
{
	public static void main(String[] args) 
	{
		// Ask the digits
		String digit1 = JOptionPane.showInputDialog ("Enter dem digits");
		
		// Set the variables
		int value = (int) Double.parseDouble(digit1);
				
		// Print digits
		System.out.println ("digits: " + value);
		
		// Print digit in other way round
		int a = value / 100;
		int b = value % 100 / 10;
		int c = value % 10;
		
		// Print reversed digits
		System.out.println ("reversed: " + c + b + a);
	}
}