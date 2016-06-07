import javax.swing.JOptionPane;

// This program converts ASCII code to a character
public class ASCIItoCharacter 
{
	public static void main(String[] args)
	{
		// Ask the ASCII code from the user
		String userimput = JOptionPane.showInputDialog ("Enter a ASCII code");
		
		// Cast the code to an int variable
		int ascii = (int) Double.parseDouble(userimput);
		
		// Convert the number into a character
		char character = (char)ascii;
	
		if (ascii<0 || ascii>127)
		{
			System.out.println("This is not an ascii number");
		}
		else 
		{
			System.out.println("The character is " + character);
		}	
	}	
}
