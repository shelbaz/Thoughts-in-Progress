import java.util.Scanner;

//Darrin Fong

public class J1
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner (System.in);
		int y = input.nextInt();
		int m = input.nextInt();
		
		if (y < 0 || y > 50 || m < 0 || m > 50)
		{
			System.out.print("Error: Age is out of range");
			System.exit(0);
		}
		
		if (m < y)
		{
			System.out.print("Error: Age of middle child is lower than age of youger child");
			System.exit(0);
		}
		
		System.out.print(m + (m - y));
	}
}
