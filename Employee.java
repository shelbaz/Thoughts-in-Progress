
import java.util.Date;


public class Employee extends Person
{

    private String office;
    private double salary;
    private Date dateHired;

    public Employee() 
    {
    }

    public Employee(String name, String address, String phone, String email)
    {
        super(name, address, phone, email);
    }
    
    public Employee(String name, String address, String phone, String email, String office, double salary)
    {
        super(name, address, phone, email);
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }

    public void setOffice(String office)
    {
        this.office = office;
    }

    public String getOffice()
    {
        return this.office;
    }

    public void setSalary(double salary)
    {
        this.salary = salary;
    }

    public double getSalary()
    {
        return this.salary;
    }

    public void setdateHired(Date dateHired)
    {
        this.dateHired = dateHired;
    }

    public Date getdateHired()
    {
        return this.dateHired;
    }

    public String toString()
    {
        return "Employee: " + super.getName();
    }
}