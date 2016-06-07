public class pickacard2 
{
	public static void main(String[] args)
	{
		// generate a card
		double r = Math.random();
		double card = ((r * 100) % 12);
		int rcard = (int) card;
		
		// generate a rank
		double ran = Math.random();
		double rand = ((ran * 100) % 4);
		int rrank = (int) rand;
		
		// associate the number to the card and print
		System.out.print ("The card you picked is ");
		switch (rcard)
		{
			case 0: System.out.print ("2"); break;
			case 1: System.out.print ("3"); break;
			case 2: System.out.print ("4"); break;
			case 3: System.out.print ("5"); break;
			case 4: System.out.print ("6"); break;
			case 5: System.out.print ("7"); break;
			case 6: System.out.print ("8"); break;
			case 7: System.out.print ("9"); break;
			case 8: System.out.print ("10"); break;
			case 9: System.out.print ("Jack"); break;
			case 10: System.out.print ("Queen"); break;
			default: System.out.print ("Ace"); break;
		}
		
		// associate the rank to the card and print
		switch (rrank)
		{
			case 1: System.out.print (" of Spades"); break;
			case 2: System.out.print (" of Hearts"); break;
			case 3: System.out.print (" of Clubs"); break;
			default: System.out.print (" of Diamonds"); break;
		}
	}
}
