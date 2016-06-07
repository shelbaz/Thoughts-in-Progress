import java.util.Scanner;

public class sumofdigits 
{
	public static void main(String[] args)
	{
		System.out.println("Enter a number");
		Scanner input = new Scanner (System.in);
		long userinput = input.nextInt();
		System.out.print(sumDigits(userinput));
	}
	
	public static long sumDigits(long n)
	{
		int sum = 0;
		if ((n % 10) == 0)
		{
			n /= 10;
		}
		while ((n % 10) != 0)
		{
			sum += (n % 10);
			n /= 10;
			if ((n % 10) == 0)
			{
				n /= 10;
			}
		}
		return sum;
	}
}
