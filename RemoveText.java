import java.io.*;
import java.util.*;

public class RemoveText 
{
	public static void main(String []args) throws FileNotFoundException 
	{
		
		// get a new text file
		File text = new File("C:\\Users\\Red\\Downloads\\Loan.java");
		File text2 = new File("C:\\Users\\Red\\Downloads\\New Text Document - Copy.txt");
  
		// create new scanner text
		Scanner string = new Scanner(text);
		// create new printWriter text
		PrintWriter output = new PrintWriter(text2);
		
		while (string.hasNextLine()) 
		{
			String line = string.nextLine();
			output.println(line.replaceAll(args[0], ""));
		}
		
		string.close();
		output.close();
	}
}