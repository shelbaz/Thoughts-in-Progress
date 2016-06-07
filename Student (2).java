
public class Student extends Person 
{

    public int classStatus;
    public final int FRESHMAN = 0;
    public final int JUNIOR = 1;
    public final int SOPHOMORE = 2;
    public final int SENIOR = 3;

    public Student(String name, String address, String phone, String email, int Status) 
    {
    	super(name, address, phone, email);
    	classStatus = Status;
    }
    
    public void setStatus(int status)
    {
    	this.classStatus = status;
    }
   
    public String toString()
    {
        return "Student: " + super.getName();
    }

}