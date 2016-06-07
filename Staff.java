
public class Staff extends Employee 
{
    private String title;

    public Staff(String name , String address , String phone , String email , String title) 
    {
    	super(name, address, phone, email);
        this.title = title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }
    
    public String getTitle()
    {
        return this.title;
    }

    public String toString(){
        return "Staff: " + super.getName();
    }
}