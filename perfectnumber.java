public class perfectnumber 
{
	public static void main(String[] args)
	{
		System.out.println("The prime numbers are:");
		
// generate a number from 1 to 10000
		for (int nb = 1; nb < 10000; nb++)
		{
			int sum = 0;
			
// generate a divisor that is smaller than the number
			for (int divisor = 1; divisor < nb; divisor++)
			{
				
// check if the divisor is a divisor if the number, if it is add its sum
				if ((nb % divisor) == 0)
				{
					sum += divisor;
				}
			}
// check if the sum is equal to the number, if it is, print the number
			if (sum == nb)
			{
				System.out.println(nb);
			}
		}
		System.exit(0);
	}
}
