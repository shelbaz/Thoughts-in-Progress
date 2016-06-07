
public class testPerson {

    public static void main(String[] args) 
    {
    	
    	Person person1 = new Person("Billy Jean", "123 here", "514-514-5141", "jb@gmail.com");
    	Person student1 = new Student("Jilly Bean", "123 There", "514-514-5142", "jb@gmail.com", "Freshman");
    	Person employee1 = new Employee("Belly Jean", "321 here", "514-514-5143", "BJ@gmail.com", "0:00 to 12:00", 10.0);
    	Person faculty1 = new Faculty("Jelly Bean", "321 There", "514-514-5144", "JB@gmail.com", "17:00 to 9:00", "Food");
    	Person staff1 = new Staff("Darrin", "NoWhere", "438-800-6911", "darrinfong@gmail.com", "Hobo");

    	System.out.println(person1.toString());
		System.out.println(student1.toString());
		System.out.println(employee1.toString());
		System.out.println(faculty1.toString());
		System.out.println(staff1.toString());
    }
}
