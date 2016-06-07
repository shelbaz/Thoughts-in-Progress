import java.util.Scanner;

//Darrin Fong

public class J2 
{
	public static void main (String[] args)
	{
		Scanner input = new Scanner (System.in);
		
		String y = input.next();
		int o = 0;
		
		for (int i = 0 ; i < y.length() ; i++)
		{
			if (y.charAt(i) != 'I' && y.charAt(i) != 'O' && y.charAt(i) != 'S' && y.charAt(i) != 'H' && y.charAt(i) != 'Z' && y.charAt(i) != 'X' && y.charAt(i) != 'N')
			{
				o = 1;
			}
		}
		if (o == 0)
			System.out.print("YES");
		else
			System.out.print("NO");
	}
}
