
public class hobo extends Person
{
	double bs;
	
	public hobo(String name, String address, String email, String phone, double bs)
	{
		super(name, address, email, phone);
	}
	
	public void changeName (String newName)
	{
		setName(newName);
	}
	
	public void changeBS (double bs)
	{
		this.bs = bs;
	}
	
	public double getBS ()
	{
		return this.bs;
	}
	
	public String toString()
	{
		return super.name + super.address + this.bs;
	}
	
	public String toString1()
	{
		return super.toString();
	}
}
