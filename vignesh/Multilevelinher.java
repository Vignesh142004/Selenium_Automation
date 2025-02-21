package vignesh;
class Big
{
	void func1()
	{
		System.out.println("The shirt is big in size");
	}
}
class Medium extends Big
{
	void func2()
	{
		System.out.println("The shirt is medium in size");
	}
}
class Small extends Medium
{
	void func3()
	{
		System.out.println("The Shirt is small in size");
	}
}

public class Multilevelinher {
	public static void main(String args[])
	{
		Small obj=new Small();
		obj.func1();
		obj.func2();
		obj.func3();
	}

}

