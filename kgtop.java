
public class kgtop 
{
	public static void main(String[] args)
	{
		// declare and initialize variables
		double kg = 1;
		double pd = 0;

		// print kilograms and pounds columns
		System.out.println("Kilograms\tPounds");
		
		// apply the loop
		while (kg < 200)
		{
			pd = kg * 2.2;
			System.out.println(kg + "\t" + "\t" + pd);
			kg += 2;
		}
	}
}
