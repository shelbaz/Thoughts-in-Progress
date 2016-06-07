public class pickacard 
{
	public static void main(String[] args)
	{
		// generate a random number
		double r = Math.random();
		double card = ((r * 100) % 52);
		int rcard = (int) card;
		
		// associate the number and rank to the cards and prints
		System.out.print ("The card you picked is ");
		switch (rcard)
		{
			case 1: System.out.print ("Ace of Hearts"); break;
			case 2: System.out.print ("Ace of Clubs"); break;
			case 3: System.out.print ("Ace of Diamonds"); break;
			case 4: System.out.print ("2 of Spades"); break;
			case 5: System.out.print ("2 of Hearts"); break;
			case 6: System.out.print ("2 of Clubs"); break;
			case 7: System.out.print ("2 of Diamonds"); break;
			case 8: System.out.print ("3 of Spades"); break;
			case 9: System.out.print ("3 of Hearts"); break;
			case 10: System.out.print ("3 of Clubs"); break;
			case 11: System.out.print ("3 of Diamonds"); break;
			case 12: System.out.print ("4 of Spades"); break;
			case 13: System.out.print ("4 of Hearts"); break;
			case 14: System.out.print ("4 of Clubs"); break;
			case 15: System.out.print ("4 of Diamonds"); break;
			case 16: System.out.print ("5 of Spades"); break;
			case 17: System.out.print ("5 of Hearts"); break;
			case 18: System.out.print ("5 of Clubs"); break;
			case 19: System.out.print ("5 of Diamonds"); break;
			case 20: System.out.print ("6 of Spades"); break;
			case 21: System.out.print ("6 of Hearts"); break;
			case 22: System.out.print ("6 of Clubs"); break;
			case 23: System.out.print ("6 of Diamonds"); break;
			case 24: System.out.print ("7 of Spades"); break;
			case 25: System.out.print ("7 of Hearts"); break;
			case 26: System.out.print ("7 of Clubs"); break;
			case 27: System.out.print ("7 of Diamonds"); break;
			case 28: System.out.print ("8 of Spades"); break;
			case 29: System.out.print ("8 of Hearts"); break;
			case 30: System.out.print ("8 of Clubs"); break;
			case 31: System.out.print ("8 of Diamonds"); break;
			case 32: System.out.print ("9 of Spades"); break;
			case 33: System.out.print ("9 of Hearts"); break;
			case 34: System.out.print ("9 of Clubs"); break;
			case 35: System.out.print ("9 of Diamonds"); break;
			case 36: System.out.print ("10 of Spades"); break;
			case 37: System.out.print ("10 of Hearts"); break;
			case 38: System.out.print ("10 of Clubs"); break;
			case 39: System.out.print ("10 of Diamonds"); break;
			case 40: System.out.print ("Jack of Spades"); break;
			case 41: System.out.print ("Jack of Hearts"); break;
			case 42: System.out.print ("Jack of Clubs"); break;
			case 43: System.out.print ("Jack of Diamonds"); break;
			case 44: System.out.print ("Queen of Spades"); break;
			case 45: System.out.print ("Queen of Hearts"); break;
			case 46: System.out.print ("Queen of Clubs"); break;
			case 47: System.out.print ("Queen of Diamonds"); break;
			case 48: System.out.print ("King of Spades"); break;
			case 49: System.out.print ("King of Hearts"); break;
			case 50: System.out.print ("King of Clubs"); break;
			case 51: System.out.print ("King of Diamonds"); break;
			default: System.out.print ("Ace of Spades"); break;
		}
	}
}
