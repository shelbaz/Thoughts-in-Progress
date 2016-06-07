
public class fan 
{
	// declare constant variables
	private final int Slow = 1;
	private final int Medium = 2;
	private final int Fast = 3;

	//declare data fields
	private int speed = Slow;
	private boolean on = false;
	private double radius = 5.0;
	private String color = "blue";

	public void setSpeed(int speed) 
	{
		this.speed = speed;	
	}
	
	public void setOn(boolean on) 
	{
		this.on = on;	
	}
	
	public void setRadius(double radius) 
	{
		this.radius = radius;	
	}
	
	public void setColor(String color) 
	{
		this.color = color;	
	}

	public int getSpeed() 
	{
		return speed;
	}
	
	public boolean getOn() 
	{
		return on;
	}
	
	public double getRadius() 
	{
		return radius;
	}
	
	public String getColor() 
	{
		return color;
	}

	public String toString() 
	{
		if (on==false) 
		{
			return " speed = " + speed + ", fan is off" + ", radius = " + radius + ", color = " + color + ".";
		}
		else 
		{
			return " speed = " + speed + ", fan is on" + ", radius = " + radius + ", color = " + color + ".";
		}
	}

	public static void main(String[] args)
	{

// fan 1
		fan f1 = new fan();
		f1.setSpeed(3);
		f1.setRadius(10.0);
		f1.setColor("yellow");
		f1.setOn(true);

// fan 2		
		fan f2 = new fan();
		f2.setSpeed(2);
		f2.setRadius(5.0);
		f2.setColor("blue");
		f2.setOn(false);

// print fans' values
	System.out.println("First Fan: " + f1.toString());
	System.out.println("Second Fan: " + f2.toString());
	}
}
