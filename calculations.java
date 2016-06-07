
public class calculations 
{
	public static void main(String[] args)
	{
		int a = 10;
		int b = 15;
		int t;
		System.out.println("a + b is equal to:" + (a+b));
		System.out.println("a - b is equal to:" + (a-b));
		System.out.println("a / b is equal to:" + a/b);
		System.out.println("b / a is equal to:" + b/a);
		System.out.println("a ^ b is equal to:" + java.lang.Math.pow ( a, b));
		System.out.println("b ^ a is equal to:" + java.lang.Math.pow ( b, a));
		System.out.println("a % b is equal to:" + a%b);
		System.out.println("b % a is equal to:" + b%a);
		System.out.println("a x b is equal to:" + a*b);
		System.out.println("\nAverage of a and b is equal to:" + (a+b)/2);
		System.out.println("\na is: " + a + " and b is: " + b);
		System.out.println("\nafter swap\na is: " + b + " and b is: " + a);
		  
			t=a;
			a=b;
			b=t;
		
		  	System.out.println("\na + b is equal to:" + (a+b));
			System.out.println("a - b is equal to:" + (a-b));
			System.out.println("a / b is equal to:" + (a/b));
			System.out.println("b / a is equal to:" + (b/a));
			System.out.println("a ^ b is equal to:" + java.lang.Math.pow ( a, b));
			System.out.println("b ^ a is equal to:" + java.lang.Math.pow ( b, a));
			System.out.println("a % b is equal to:" + (a%b));
			System.out.println("b % a is equal to:" + (b%a));
			System.out.println("a x b is equal to:" + (a*b));
			System.out.println("Average of a and b is equal to:" + ((a+b)/2));
		
	}
}
