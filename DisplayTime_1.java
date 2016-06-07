public class DisplayTime 
{
public static void main(String[] args) 
	{
	int seconds = 6565152;
	int minutes = seconds / 60; // Find minutes in seconds
	int remainingSeconds = seconds % 60; // Seconds remaining
	System.out.println
	(seconds + " seconds is " + minutes + " minutes and " + remainingSeconds + " seconds");
	}
}