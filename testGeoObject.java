import java.util.Scanner;

public class testGeoObject
{
	public static void main(String[] args)
	{
		// ask sides from the user
		System.out.println("Enter 3 sides for the triangle: ");
		Scanner input = new Scanner (System.in);
		
		double s1 = input.nextDouble();
		double s2 = input.nextDouble();
		double s3 = input.nextDouble();
		
		// ask color from the user
		System.out.println("Enter a color for the triangle: ");
		String color = input.next();
		
		// ask if the triangle is filled
		System.out.println("Enter if the triangle if filled (true or false): ");
		boolean isfilled = input.nextBoolean();
		
		Triangle Triangle1 = new Triangle(s1 , s2 , s3 , color , isfilled);
		
		// display output
		System.out.println("Sides of Triangle: "+ Triangle1.toString());
		System.out.println("Perimeter of triangle: "+ Triangle1.getPerimeter());	
		System.out.println("Area of Triangle: "+ Triangle1.getArea());
		System.out.println("Color of the Triangle: "+ Triangle1.getColor());
		System.out.print("Is triangle filled: ");
		
		if (Triangle1.isFilled())
			System.out.println("yes");
		else
			System.out.println("no");
	}
}