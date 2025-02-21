package vignesh;
abstract class Sample//abstract class
{
	abstract void add();//abstract method
	void sub()
	{
		System.out.println("Subtraction");
	}// abstract class can contains both abstract clas as well as non abstract class
}
class abc extends Sample
{
	void add()
	{
		System.out.println("Addition");
	}
}
public class AbstactClass {
	public static void main(String args[])
	{
	    Sample obj=new abc();
		obj.add();
		obj.sub();
	}

}
