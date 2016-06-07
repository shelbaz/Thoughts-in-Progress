import java.util.Date;

public class account 
{
	// declare the private variables
	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private Date dateCreated;

	public account () 
	{}

	// Constructors with id and balance
	public account (int id, double balance)
	{
		this.id = id;
		this.balance = balance; 
	}
	// Put Setters
	public void setId (int id) 
	{
		this.id = id;
	}
	public void setBalance (int balance)
	{
		this.balance = balance;
	}

	public void setAnnualInterestRate (double annualInterestRate) 
	{
		this.annualInterestRate = annualInterestRate;
	}

	public int getId() 
	{
		return id;
	}

	public double getBalance() 
	{
		return balance;
	}

	public double getAnnualInterestRate() 
	{
		return annualInterestRate;
	}

	public Date getDateCreated() 
	{
		return dateCreated;
	}

	public double getMonthlyInterestRate () 
	{
		double monthlyInterest = (annualInterestRate / 100) / 12;
		return monthlyInterest;
	}
	public double getMonthlyInterest () 
	{
		return ((this.getMonthlyInterestRate()) * balance);
	}

	public void withdraw (double amount)
	{
		balance -= amount; 
	}

	public void deposit (double amount)
	{
		balance += amount;
	}

	public static void main(String[] args) 
	{

		account ac1 = new account(1122 , 20000);

		double rate = 4.5;
		ac1.setAnnualInterestRate(rate);
		ac1.withdraw(2500);
		ac1.deposit(3000);

		Date dateCreated = new Date(); 

		// print the date
		System.out.println("This " + dateCreated.toString() + "\nThe balance was: " + ac1.getBalance() + "\nAnd the monthly interest is: " + ac1.getMonthlyInterest());
	}
}