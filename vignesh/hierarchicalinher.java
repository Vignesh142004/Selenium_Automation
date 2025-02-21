package vignesh;
class A 
{
	void display()
	{
		System.out.println("SuperClass");
	}
}
class B extends A
{
	void display1()
	{
		System.out.println("SubClass1");
	}
}
class c extends A
{
	void display2()
	{
		System.out.println("Sub")
	}
}
public class hierarchicalinher {
	public static void main(String args[])
	{
		c obj=new c();
		obj.display();
		obj.display1();
		obj.display2();
	}

}
