// This program shows the digits in string

import javax.swing.JOptionPane;


public class Sixth
{
	public static void main(String[] args) 
	{
				
		// Ask the octets
		String o1 = JOptionPane.showInputDialog ("Enter the first octet");
		String o2 = JOptionPane.showInputDialog ("Enter the second octet");
		String o3 = JOptionPane.showInputDialog ("Enter the third octet");
		String o4 = JOptionPane.showInputDialog ("Enter the fourth octet");
				
		// Set the variables
		int octet1 = (int) Double.parseDouble(o1);
		int octet2 = (int) Double.parseDouble(o2);
		int octet3 = (int) Double.parseDouble(o3);
		int octet4 = (int) Double.parseDouble(o4);
		
		// Print the digits
		System.out.println (octet1+"."+octet2+"."+octet3+"."+octet4);
	}
}