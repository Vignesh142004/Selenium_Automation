package automation;

import org.testng.annotations.Test;

public class PaymentTest 
{

	@Test(priority=1,groups= {"regression","sanity"})
	void paymentinRupees()
	{
		System.out.println("This is payment by Rupees..");
	}
	
	@Test(priority=2,groups= {"regression","sanity"})
	void paymentinDollar()
	{
		System.out.println("This is payment by Dollar..");
	}
}
