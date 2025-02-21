package Day1;
abstract class detail
{
	abstract void display1();
	abstract void display2();
}
class explain extends detail
{
	void display1()
	{
		System.out.println("This is the abstract method1");
	}
	void display2()
	{
		System.out.println("This is the abstract method2");
	}
}
public class AbstarctDemo {
	public static void main(String args[])
	{
		explain obj=new explain();
		obj.display1();
		obj.display2();
	}

}
