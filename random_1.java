import java.util.Random;

public class random 
{
	public static void main(String[] args)
	{
		Random r = new Random(1000);
		for (long count = 0 ; count < 50 ; count++)
		{
			System.out.print(r.nextInt(100) + " ");
		}
	}
}
