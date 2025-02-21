package Day1;

public class Encapsulation {
	public static void main(String ags[])
	{
		Account a1=new Account();
		a1.setAccno(1001);
		System.out.println(a1.getAccno());
		a1.setName("Kunal");
		System.out.println(a1.getName());
		a1.setAmount(10000);
		System.out.println(a1.getAmount());
	}
}
