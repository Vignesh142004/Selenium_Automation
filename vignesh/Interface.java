package vignesh;
interface Sample
{
	public void add();
}
class M implements Sample
{
	public void add()
	{
		System.out.println("ADDITION");
	}
}
public class Interface {
	public static void main(String args[])
	{
		M obj=new M();
		obj.add();
	}

}
