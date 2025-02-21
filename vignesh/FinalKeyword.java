package vignesh;
class Vignesh
{
	public void show1()
	{
		System.out.println("HELLO");
	}
}
class Ball extends Vignesh
 {
	 public void show2()
	 {
		 System.out.println("HELLO");
	 }
 }
public class FinalKeyword {
	public static void main(String args[])
	{
		Ball obj=new Ball();
		obj.show1();
		obj.show2();	
	}
}
