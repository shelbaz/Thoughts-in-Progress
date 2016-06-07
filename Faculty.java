
public class Faculty extends Employee 
{
    
	private String officeHours;
    private String rank;

    public Faculty(String name, String address, String phone, String email, String officeHours, String rank) 
    {
    	super(name, address, phone, email);
    	this.officeHours = officeHours;
    	this.rank = rank;
    }
    
    public void setOfficeHours(String officeHours)
    {
    	this.officeHours = officeHours;
    }
    
    public String getOfficeHours()
    {
    	return officeHours;
    }
    
    public void setRank(String rank)
    {
    	this.rank = rank;
    }

    public String getRank()
    {
    	return rank;
    }
    public String toString()
    {
        return "Faculty: " + super.getName();
    }
}
