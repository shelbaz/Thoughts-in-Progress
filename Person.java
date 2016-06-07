
public class Person 
{

    protected String name;
    protected String address;
    protected String phone;
    protected String email;

    public Person() 
    {
    }

    public Person(String newName, String newAddress, String newPhone, String newEmail)
    {
        name = newName;
        address = newAddress;
        phone = newPhone;
        email = newEmail;
    }

    public void setName(String newName)
    {
        name = newName;
    }

    public String getName(){
        return name;
    }

    public void setAddress(String newAddress)
    {
        address = newAddress;
    }

    public String getAddress()
    {
        return address;
    }

    public void setPhone(String newPhone)
    {
        phone = newPhone;
    }

    public String getPhone()
    {
        return phone;
    }

    public void setEmail(String newEmail)
    {
        email = newEmail;
    }

    public String getEmail()
    {
        return email;
    }

    public String toString()
    {
        return "Person: " + getName();
    }

}