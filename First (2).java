// This program changes i and j
import javax.swing.JOptionPane;


public class First 
{
	public static void main(String[] args) 
	{

		//Asking variables to the user
		String VariableiString = JOptionPane.showInputDialog ("Enter the variable i here:");
		String VariablejString = JOptionPane.showInputDialog ("Enter the variable j here:");

		//Obtain variables 
		int i =(int) Double.parseDouble(VariableiString);
		int j =(int) Double.parseDouble(VariablejString);

		//Swapping variables
		int temp = i;
		i=j;
		j=temp;

		//Show message
		System.out.println("The variable i is: " + i + ", and the variable j is: " + j);
	}
}