package Day1;

public class Account {
	private int accno;// class variable
	private String name;
	private double amount;
	
	void setAccno(int accno)// setter for accno
	{
		this.accno=accno;
	}
	int getAccno()// getter for accno
	{
		return accno;
	}
	void setName(String name)//setter for name
	{
		this.name=name;
	}
	String getName()// getter for name
	{
		return name;
	}
	double getAmount() // setter for amount
	{
		return amount;
	}
	void setAmount(double amount) // getter for amount
	{
		this.amount = amount;
	}
	

}
