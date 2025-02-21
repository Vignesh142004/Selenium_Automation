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


public class Inherit {
	public static void main(String args[])
	{
		Small obj=new Small();
		obj.func1();
		obj.func2();
		
	}

}
