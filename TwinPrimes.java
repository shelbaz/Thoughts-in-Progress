
public class TwinPrimes
{
	public static void main(String[] args)
	{
		int prime2 = 1;
// from 1 to 1000, check if the number is a prime
		for (int prime = 1; prime <= 1000; prime++)
// if the number is a prime, check if the difference bwtween the last two primes
			if (isPrime(prime)) {
				if (prime - prime2 == 2) 
				{
					System.out.println("(" + prime2 + ", " + prime + ")");
				}
				
// replace the second prime with the first
				prime2 = prime;
			}
	}
	
// check if the number is a prime
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
}