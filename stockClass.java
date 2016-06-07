
public class stockClass 
{
	static String symbol;
	static String name;
	static double previousClosingPrice;
	static double currentPrice;
	
	stockClass(String newSymbol, String newName, double newpreviousClosingPrice, double newcurrentPrice)
	{
		symbol = newSymbol;
		name = newName;
		previousClosingPrice = newpreviousClosingPrice;
		currentPrice = newcurrentPrice;
	}
	
	public static double getChangePercent()
	{
		return ((currentPrice / previousClosingPrice) - 1) * 100;
	}
	
}
