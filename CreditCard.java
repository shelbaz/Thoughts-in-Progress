import java.util.Scanner;

public class CreditCard 
{
	public static void main(String[] args)
	{
		System.out.print("Enter a credit card number as a long integer: ");
		Scanner input = new Scanner (System.in);
		long carddigits = input.nextLong();
		
		if (isValid (carddigits))
			System.out.println(carddigits + " is valid");
		else
			System.out.println(carddigits + " is invalid");
	}
	
	public static boolean isValid(long number)
	{
		if (getSize(number) >= 13 && getSize(number) <= 16 && prefixMatched(number, getSize(number)) && ((((sumOfDoubleEvenPlace(number) + sumOfOddPlace(number))) % 10) == 0))
			return true;
			
		else
			return false;
	}
	
	public static int sumOfDoubleEvenPlace(long number)
	{
		int sum = 0;
		number /= 10;
		
		while (number > 1)
		{
			int n = (int) (number % 10);
			sum += getDigit(n);
			number /= 100;
		}
		
		return sum;
	}
	
	public static int getDigit(int number)
	{
		int digit = number * 2;
		number *= 2;
		
		if (number >= 10)
		{
			digit = number % 10;
			number /= 10;
			digit += number;
		}
		return digit;
	}
	
	public static int sumOfOddPlace(long number)
	{
		int sum = 0;
		
		while (number > 1)
		{
			sum += number % 10;
			number /= 100;
		}
		
		return sum;
	}
	
	public static boolean prefixMatched(long number, int d)
	{
		if (getPrefix(number, d) == 4 || getPrefix(number, d) == 5 || getPrefix(number, d) == 6)
			return true;
		
		else if (getPrefix(number, d) == 3 && (((int) (number / (10 * (d-2)))) % 10) == 7)
			return true;
		
		else
			return false;
	}
	
	public static int getSize(long d)
	{
		int size = 0;
		for (long number = d; d > 0; d /= 10)
			size++;
		return size;
	}
	
	public static long getPrefix(long number, int k)
	{
		int count = 1;
		while (count < k)
		{
			number /= 10;
			k--;
		}
		
		long prefix = number;

		return prefix;
	}
}
