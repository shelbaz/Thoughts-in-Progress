// This program shows the amount of dollars and cents
import javax.swing.JOptionPane;


public class Fourth
{
	public static void main(String[] args) 
	{
		// Ask the value of price
		String value = JOptionPane.showInputDialog ("Enter the value here");
				
		// Set the variables
		int total = (int) Double.parseDouble(value);
		int dollars = total/100;
		int cents = total%100;
		
		// Print the digits
		System.out.println (dollars + " dollars and " + cents + " cents");
	}
}