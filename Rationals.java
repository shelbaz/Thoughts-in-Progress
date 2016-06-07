import java.math.BigInteger;

public class Rationals extends Number implements Comparable<Rationals> {
	// Data fields for numerator and denominator
	BigInteger numerator = new BigInteger("0");
	BigInteger denominator = new BigInteger("1");

	/** Construct a Rationals with default properties */	
	public Rationals() {
		
		this(new BigInteger("0"), new BigInteger("1"));
	}

	/** Construct a Rationals with specified numerator and denominator */
	public Rationals(BigInteger numerator, BigInteger denominator) {
		BigInteger gcd = gcd(numerator, denominator);
		BigInteger zero = BigInteger.ZERO;
		this.numerator = (denominator.compareTo(zero) == 1? new BigInteger("1"):new BigInteger("-1")).multiply(numerator.divide(gcd));
		this.denominator = denominator.divide(gcd);
	}

	/** Find GCD of two numbers */
	private static BigInteger gcd(BigInteger n, BigInteger d)
	{
		BigInteger n1 = n.abs();
		BigInteger n2 = d.abs();
		BigInteger gcd = new BigInteger("1");
		while(n1.compareTo(n2) != 0 )
		{
			if(n1.compareTo(n2)>0)
				n1=n1.subtract(n2);
			else
				n2=n2.subtract(n1);
		}
		return n1;
	}

	/** Return numerator */
	public BigInteger getNumerator() {
		return numerator;
	}

	/** Return denominator */
	public BigInteger getDenominator() {
		return denominator;
	}

	/** Add a Rationals number to this Rationals */
	public Rationals add(Rationals secondRational) {
		BigInteger n = (numerator.multiply(secondRational.getDenominator())).add(denominator.multiply(secondRational.getNumerator()));
		BigInteger d = denominator.multiply(secondRational.getDenominator());
		return new Rationals(n,d);
	}

	/** Subtract a Rationals number from this Rationals */
	public void subtract(Rationals secondRationals) {
		/*long n = numerator * secondRationals.getDenominator() - denominator * secondRationals.getNumerator();
		long d = denominator * secondRationals.getDenominator();
		return new Rationals(n, d);**/
	}

	/** Multiply a Rationals number by this Rationals */
	public void multiply(Rationals secondRationals) {
		/*long n = numerator * secondRationals.getNumerator();
		long d = denominator * secondRationals.getDenominator();
		return new Rationals(n, d);**/
	}

	/** Divide a Rationals number by this Rationals */
	public void divide(Rationals secondRationals) {
		/*long n = numerator * secondRationals.getDenominator();
		long d = denominator * secondRationals.numerator;
		return new Rationals(n, d);**/
	}
	
	public void replace (Rationals newRationals)
	{
		numerator = newRationals.getNumerator();
		denominator = newRationals.getDenominator();
	}

	@Override
	public String toString() {
		/*if (denominator == 1)
			return numerator + "";
		else**/
			return numerator + "/" + denominator;
	}

	@Override // Override the equals method in the Object class
	public boolean equals(Object other) {
		/*if ((this.subtract((Rationals)(other))).getNumerator() == 0)
			return true;
		else**/
			return false;
	}

	@Override // Implement the abstract intValue method in Number
	public int intValue() {
		return (int)doubleValue();
	}

	@Override // Implement the abstract floatValue method in Number
	public float floatValue() {
		return (float)doubleValue();
	}

	@Override // Implement the doubleValue method in Number
	public double doubleValue() {
		return 0;
	}

	@Override // Implement the abstract longValue method in Number
	public long longValue() {
		return (long)doubleValue();
	}

	@Override // Implement the compareTo method in Comparable
	public int compareTo(Rationals o) {
	/*	if (this.subtract(o).getNumerator() > 0)
			return 1;
		else if (this.subtract(o).getNumerator() < 0)
			return -1;
		else **/
			return 0;
	}
}