// This program adds the digits
import javax.swing.JOptionPane;


public class Seventh
{
	public static void main(String[] args) 
	{
		// Ask the value of price
		String digits = JOptionPane.showInputDialog ("Enter three digits");
				
		// Set the variables
		int value = (int) Double.parseDouble(digits);
				
		// Print the answer
		System.out.println ("not added: " + value);
		
		//addition
		int a = value / 100;
		int b = value % 100 / 10;
		int c = value % 10;
		int answer = a+b+c;
		
		// Print additions
		System.out.println("added: " + answer);
		
	}
}