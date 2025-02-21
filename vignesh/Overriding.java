package vignesh;
class A
{
	void show()
	{
		System.out.println("Vignesh");
	}
}
public class Overriding extends A{
	public static void main(String args[])
	{
		public void show()
		{
		    System.out.println("VBS");
		}
		Overriding obj=new Overriding();
		obj.show();
	}

}
