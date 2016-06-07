import javax.swing.JOptionPane;


public class DtoHex
{
	public static void main(String[] args) 
	{
		// Ask a value
		String Userimput = JOptionPane.showInputDialog ("Enter a decimal value (0 to 15): ");
	
		// convert the imput
		int x = (int) Double.parseDouble(Userimput);
	
		// Display Hex value
		if (x >= 0 && x <= 15)
		{
			String y = Integer.toHexString(x);
			System.out.println ("The hex value is " +  y);
		}
		else 
		{
			System.out.println ("Invalid input");
		}
	}	
}