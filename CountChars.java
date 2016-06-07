import java.io.*;
import java.util.*;

public class CountChars 
{
	
	static File file = new File ("C:\\Users\\Red\\Downloads\\Loan.java");
	
	public static void main (String []args) throws Exception
	{
		Scanner input = new Scanner (file);
		
		int lines = 0;
		int words = 0;
		int characters = 0;
		
		while (input.hasNext())
			{
				String s = input.nextLine(); // take the line as a string
				String[] w = s.split(" "); // use spaces to split the string and put word into array
				characters += s.length(); // number of characters
				words += w.length;
				lines++;
			}		
		
		if (file.isFile())
			System.out.println("Number of characters: " + characters + "\nNumber if words: " + words + "\nNumber of lines: " + lines);
		
		System.out.print (file.length());
	}
}
