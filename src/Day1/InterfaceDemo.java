package Day1;
interface shape 
{
	int length=10; // by default it is final and static
	int width=50;
	void circle(); // abstract method
	default void square() // default method can have function definition
	{
		System.out.println("This is Square -- default method");
	}
	static void rectangle() // static method can have function definition
	{
		System.out.println("This is rectangle -- static method");
	}
	
}
public class InterfaceDemo implements shape
{
	public void circle()
	{
		System.out.println("This is circle -- abstract method");
	}
	public static void main(String args[])
	{ 
		InterfaceDemo obj=new InterfaceDemo();
		obj.circle();
		obj.square();
		shape.rectangle();// static method can be called without the object
		System.out.println(shape.length*shape.width); // we can access a static variable directly.
	}

}
