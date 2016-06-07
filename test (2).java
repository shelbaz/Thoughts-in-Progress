
public class test 
{
	public static void main(String[] args)
	{
		hobo me = new hobo("a", "b", "c", "d", 50);
		
		Person someone = new Person("a", "b", "c", "d");
		
		me.changeBS(500.0);
		
		System.out.print(me.toString() + "\n" + someone.toString() + "\n" + me.toString1());
		
		
		
	}
}
