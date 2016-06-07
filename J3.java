import java.util.Scanner;

//Darrin Fong

public class J3 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner (System.in);
		
		int y = input.nextInt();
		
		if (y < 0 || y > 10000)
		{
			System.out.println("Error: Year out of range");
			System.exit(0);
		}
		
		int count = 0;
		
		do {
		
		y += 1;
		String year = Integer.toString(y);
		
		int a = 0 , b = 0 , c = 0 , d = 0 , e = 0 , f = 0 , g = 0 , h = 0 , i = 0 , j = 0;
		
		for (int k = 0 ; k < year.length() ; k++)
			{
				if (year.charAt(k) == '1')
					a++;
				if (year.charAt(k) == '2')
					b++;
				if (year.charAt(k) == '3')
					c++;
				if (year.charAt(k) == '4')
					d++;
				if (year.charAt(k) == '5')
					e++;
				if (year.charAt(k) == '6')
					f++;
				if (year.charAt(k) == '7')
					g++;
				if (year.charAt(k) == '8')
					h++;
				if (year.charAt(k) == '9')
					i++;
				if (year.charAt(k) == '0')
					j++;
			}
		
		if (a < 2 && b < 2 && c < 2 && d < 2 && e < 2 && f < 2 && g < 2 && h < 2 && i < 2 && j < 2)
		{
			System.out.print(y);
			System.exit(0);
		}

		} while (count < 1);
	}
}
