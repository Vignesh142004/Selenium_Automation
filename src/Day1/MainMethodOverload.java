package Day1;

public class MainMethodOverload {
	
	void main(String s)//m1
	{
		System.out.println(s);
	}
	void main(int a, int b)//m2
	{
		System.out.println("A+B="+(a+b));
	}
	void main(String s1,String s2)//m3
	{
		System.out.println(s1+" "+s2);
	}
	public static void main(String args[])
	{
		MainMethodOverload m=new MainMethodOverload();
		m.main("Hello!.."); // m1 call
		m.main(20,80); // m2 call
		m.main("Hello","Rohit"); // m3 call
	}

}
