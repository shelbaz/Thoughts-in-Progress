public class Rational extends Number implements Comparable<Rational> 
{
	// Data fields for numerator and denominator
	private long numerator = 0;
	private long denominator = 1;

	/** Construct a rational with default properties */	
	public Rational() 
	{
		this(0, 1);
	}

	/** Construct a rational with specified numerator and denominator */
	public Rational(long numerator, long denominator) 
	{
		long gcd = gcd(numerator, denominator);
		this.numerator = ((denominator > 0) ? 1 : -1) * numerator / gcd;
		this.denominator = Math.abs(denominator) / gcd;
	}

	/** Find GCD of two numbers */
	private static long gcd(long n, long d) 
	{
		long n1 = Math.abs(n);
		long n2 = Math.abs(d);
		int gcd = 1;

		for (int k = 1; k <= n1 && k <= n2; k++)
			if (n1 % k == 0 && n2 % k == 0)
				gcd = k;

		return gcd;
	}

	/** Return numerator */
	public long getNumerator() 
	{
		return numerator;
	}

	/** Return denominator */
	public long getDenominator() 
	{
		return denominator;
	}

	/** Add a rational number to this rational */
	public long[] add(Rational secondRational) 
	{
		long n = numerator * secondRational.getDenominator() + denominator * secondRational.getNumerator();
		long d = denominator * secondRational.getDenominator();
		long[] Long = new long[] {n, d};
		return Long;
	}

	/** Subtract a rational number from this rational */
	public long[] subtract(Rational secondRational) 
	{
		long n = numerator * secondRational.getDenominator() - denominator * secondRational.getNumerator();
		long d = denominator * secondRational.getDenominator();
		long[] Long = new long[] {n, d};
		return Long;
	}

	/** Multiply a rational number by this rational */
	public long[] multiply(Rational secondRational) 
	{
		long n = numerator * secondRational.getNumerator();
		long d = denominator * secondRational.getDenominator();
		long[] Long = new long[] {n, d};
		return Long;
	}

	/** Divide a rational number by this rational */
	public long[] divide(Rational secondRational) 
	{
		long n = numerator * secondRational.getDenominator();
		long d = denominator * secondRational.numerator;
		long[] Long = new long[] {n, d};
		return Long;
	}

	@Override
	public String toString() 
	{
		if (denominator == 1)
			return numerator + "";
		else
			return numerator + "/" + denominator;
	}

	@Override // Implement the abstract intValue method in Number
	public int intValue() 
	{
		return (int)doubleValue();
	}

	@Override // Implement the abstract floatValue method in Number
	public float floatValue() 
	{
		return (float)doubleValue();
	}

	@Override // Implement the doubleValue method in Number
	public double doubleValue() 
	{
		return numerator * 1.0 / denominator;
	}

	@Override // Implement the abstract longValue method in Number
	public long longValue() 
	{
		return (long)doubleValue();
	}

	@Override
	public int compareTo(Rational arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
}