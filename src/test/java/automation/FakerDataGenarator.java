package APIAutomation;

import org.testng.annotations.Test;

import com.github.javafaker.Faker;

public class FakerDataGenarator 
{
   @Test(priority=1)
   void testGenarateDummyData()
   {
	   Faker faker=new Faker();
	   String fullname=faker.name().fullName();
	   String firstname=faker.name().firstName();
	   String lastname=faker.name().lastName();
	   
	   String username=faker.name().username();
	   String password=faker.internet().password();
	   
	   String mobilenum=faker.phoneNumber().cellPhone();
	   String email=faker.internet().safeEmailAddress();
	   
	   System.out.println(fullname);
	   System.out.println(firstname);
	   System.out.println(lastname);
	   System.out.println(username);
	   System.out.println(password);
	   System.out.println(mobilenum);
	   System.out.println(email);
   }
}
