// This program asks you the sum of two numbers and confirms it.
import javax.swing.JOptionPane;


public class SumGame
{
	public static void main(String[] args) 
	{
		// Generate random numbers
		double a = Math.random() * 100;
		double b = Math.random() * 100;
		int c = (int) a;
		int d = (int) b;
		
		// Ask the answer
		String Userimputa = JOptionPane.showInputDialog (c + " + " + d + " = ?");
		
		// Cast the user imput to a variable
		int trueanswer = c + d;
		int answer = (int) Double.parseDouble(Userimputa);
		
		// Verify the answer
		if (trueanswer == answer)
		{
			System.out.println ("true.");
		}
		else
		{
			System.out.println ("false.");
		}
	}	
}