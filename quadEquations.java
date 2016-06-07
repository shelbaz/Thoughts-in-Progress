import javax.swing.JOptionPane;

public class quadEquations 
{
	private static double a;
	private static double b;
	private static double c;
	
	quadEquations()
	{}
	
	public static void getA(double A)
	{
		a = A;
	}
	
	public static void getB(double B)
	{
		b = B;
	}
	
	public static void getC(double C)
	{
		c = C;
	}
	
	public double getDiscriminant()
	{
		return Math.pow(b, 2) - 4 * a * c;
	}
	
	public double getRoot1()
	{
		if (getDiscriminant() >= 0)
		{
			double discriminent = getDiscriminant();
			return ((-b) + Math.sqrt(discriminent)) / (2 * a);
		}
		
		else 
			return 0;
	}
	
	public double getRoot2()
	{
		if (getDiscriminant() >= 0)
		{
			double discriminent = getDiscriminant();
			return ((-b) - Math.sqrt(discriminent)) / (2 * a);
		}
		
		else 
			return 0;
	}
	
	public static void main (String[] args)
	{
		quadEquations q1 = new quadEquations();
		
		String Inputa = JOptionPane.showInputDialog("Please enter a");
		int a = Integer.parseInt(Inputa);
		String Inputb = JOptionPane.showInputDialog("Please enter b");
		int b = Integer.parseInt(Inputb);
		String Inputc = JOptionPane.showInputDialog("Please enter c");
		int c = Integer.parseInt(Inputc);

		q1.getA(a);
		q1.getB(b);
		q1.getC(c);
		
		if (q1.getDiscriminant() < 0)
			System.out.println ("There is no root");
		
		else
		{
			if (q1.getRoot1() != q1.getRoot2())
				System.out.println ("Discriminant: " + q1.getDiscriminant() + "\nRoot 1: " + q1.getRoot1() + "\nRoot 2: " + q1.getRoot2());
			else
				System.out.println ("Discriminant: " + q1.getDiscriminant() + "\nRoot : " + q1.getRoot1());
		}
	}
}
