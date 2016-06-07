import javax.swing.JOptionPane;


public class GcommonD
{
	public static void main(String[] args) 
	{
		// Ask a value
		String Userimput = JOptionPane.showInputDialog ("Enter value");
	
		// convert the imput
		int x = (int) Double.parseDouble(Userimput);

		// find the answer
		int k = 2;
		while (k < x)
			if (x % k == 0)
			{
				System.out.println("number is not a prime");
				k++;
				System.out.println(x + " it is dividable by: " + k); break;
			}
			else
			{
				System.out.println("number is a prime"); break;
			} 

	}
}