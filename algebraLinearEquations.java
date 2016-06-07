import javax.swing.JOptionPane;


public class algebraLinearEquations 
{
	algebraLinearEquations()
	{}
	
	private double a;
	private double b;
	private double c;
	private double d;
	private double e;
	private double f;
	
	void setA(double newA)
	{
		a = newA;
	}

	void setB(double newB)
	{
		b = newB;
	}
	
	void setC(double newC)
	{
		c = newC;
	}
	
	void setD(double newD)
	{
		d = newD;
	}
	
	void setE(double newE)
	{
		e = newE;
	}
	
	void setF(double newF)
	{
		f = newF;
	}
	
	public boolean isSolvable()
	{
		if (a * d - b * c != 0)
			return true;
		else 
			return false;
	}
	
	public double getX()
	{
		return ((e * d - b * f) / (a * d - b * c));
	}
	
	public double getY()
	{
		return ((a * f - e * c) / (a * d - b * c));
	}
	
	public static void main (String[] args)
	{
		algebraLinearEquations e1 = new algebraLinearEquations();
		
		String Inputa = JOptionPane.showInputDialog("Please enter a");
		int a = Integer.parseInt(Inputa);
		String Inputb = JOptionPane.showInputDialog("Please enter b");
		int b = Integer.parseInt(Inputb);
		String Inputc = JOptionPane.showInputDialog("Please enter c");
		int c = Integer.parseInt(Inputc);
		String Inputd = JOptionPane.showInputDialog("Please enter d");
		int d = Integer.parseInt(Inputd);
		String Inpute = JOptionPane.showInputDialog("Please enter e");
		int e = Integer.parseInt(Inpute);
		String Inputf = JOptionPane.showInputDialog("Please enter f");
		int f = Integer.parseInt(Inputf);
		
		e1.setA(a);
		e1.setB(b);
		e1.setC(c);
		e1.setD(d);
		e1.setE(e);
		e1.setF(f);
		
		if (e1.isSolvable())
			System.out.println("X: " + e1.getX() + "\nY: " + e1.getY());
		else
			System.out.println("The equation has no solution.");
	}
	
}
