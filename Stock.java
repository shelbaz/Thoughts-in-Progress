
public class Stock 
{
	public static void main(String[] args)
	{
		stockClass s1 = new stockClass("ORCL" , "Oracle Corporation" , 34.5 , 34.35);
		
		System.out.println("The price-change percentage: " + stockClass.getChangePercent());
	}
}
