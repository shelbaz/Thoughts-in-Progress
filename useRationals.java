import java.math.BigInteger;

public class useRationals 
{
	public static void main (String[] args)
	{
		BigInteger num1 = new BigInteger("1");
		BigInteger num2 = new BigInteger("2");
		
		Rationals rat = new Rationals(num1, num2);
		
		for (int i = 2; i < 100; i++)
		{
			rat = rat.add(new Rationals(new BigInteger(i+""), new BigInteger(i+1+"")));
			System.out.println(rat.toString());
		}
		
		System.exit(0);
	}
}
