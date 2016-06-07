
public class rectangle1
{
	public static void main(String[] ars)
	{
		rectangleclass r1 = new rectangleclass(4 , 40);
		
		System.out.println("Height of the first rectangle: " + rectangleclass.height);
		System.out.println("Width of the first rectangle: " + rectangleclass.width);
		System.out.println("Perimeter of the first rectangle: " + rectangleclass.getPerimeter());
		System.out.println("Area of the first rectangle: " + rectangleclass.getArea());
		
		rectangleclass r2 = new rectangleclass(3.5 , 35.9);
		
		System.out.println("---------------------------------------------- \nHeight of the second rectangle: " + rectangleclass.height);
		System.out.println("Width of the second rectangle: " + rectangleclass.width);
		System.out.println("Perimeter of the second rectangle: " + rectangleclass.getPerimeter());
		System.out.println("Area of the second rectangle: " + rectangleclass.getArea());
	}
}
