import java.util.Date;


public class date
{
	public static void main(String[] args)
	{

		for (long count = 1 , timepassed = 10000 ; count <= 8 ; timepassed *= 10 , count++)
		{
			Date date1 = new Date(timepassed);
			System.out.println(date1.toString());
		}
	}
}
