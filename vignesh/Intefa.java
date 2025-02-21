package vignesh;
interface Sample
{
	public void add();
}
class Abc implements Sample
{
	public void add()
	{
		System.out.println("ADDITION");
	}
}
public class Intefa {
	public static void main(String args[])
	{
		Sample obj=new Abc();
		obj.add();
	}

}
