
public class Debug 
{
public static void main(String[] args)
	{
	int
		ratePerPound = (int) 1.25;	// Shipping rate per pound
		int fixedFee = 5;			// Shipping rate per pound
		
		int pricePerPound = (int) 11.25;			// Coffee price per pound
		int weight = 5;							// Amount ordered
		int shippingCost;
		int totalPrice;
		int coffeeCost;
		
	System.out.println("Peet's Coffee\n\nPrice per pound:");
	System.out.println(pricePerPound);
			
	System.out.println("Number of pounds:");
	System.out.println(weight);
	
	coffeeCost = pricePerPound * weight;
	shippingCost = ratePerPound * weight + fixedFee;
	totalPrice = pricePerPound * weight + shippingCost;
	
	System.out.println("Coffee total is:\n" + coffeeCost + "\nShipping cost is:\n" + shippingCost
			+ "\nTotal Price is:\n" + totalPrice);
	}
}
