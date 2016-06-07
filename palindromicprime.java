
public class palindromicprime
{
	public static void main(String[] args)
	{
		int count = 1;

		for (int i = 2; ; i++)
		{
			if ((isPrime(i)) && (isPalindrome(i))) 
			// verify if the number is both prime and palindrome
			{
				System.out.print(i + " ");

				if (count % 10 == 0) 
				{
					System.out.println();
				}
				if (count == 100)
				{
					break;
				}
				count++;
			}
		}
	}

	public static boolean isPrime(int num) 
	{
		if ((num == 1) || (num == 2)) 
		{
			return true;
		}
		for (int i = 2; i <= num / 2; i++) 
		{
			if (num % i == 0) 
			{
				return false;
			}
		}
		return true;
	}

	public static int reverse(int number)
	{
		String reversestring = "";
		
		// if there is a "0" at the beginning of the number, add the 0 into the string and shorten the integer
		if ((number % 10) == 0)
		{
			number /= 10;
			reversestring = "0";
		}
		
		// loop inif there is a 0 inside the number, add a 0 to the string
		while ((number % 10) != 0)
		{
			reversestring += (number % 10);
			number /= 10;
			if ((number % 10) == 0 && number != 0)
			{
				number /= 10;
				reversestring += "0";
			}
		}
		int reverseint = Integer.parseInt(reversestring);
		return reverseint;
	}

	public static boolean isPalindrome(int number)
	{
		boolean answer = true;
		int reverseint = reverse(number);
		
		// verifies if the number is equal to the reversed number and return the result as a boolean
		if (reverseint == number)
		{
			answer = true;
		}
		else if (reverseint != number)
		{
			answer = false;
		}
		return answer;
	}
}