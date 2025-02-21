package vignesh;
public class Sample
{ 
     int a=10;
     int b=20;
     static void display()
     {
    	 System.out.println(b);
     }
}
public class AccessSpecifer {
	public static void main(String args[])
	{
		Sample obj=new Sample();
		System.out.println(obj.a);
		System.out.println(obj.b);
		Sample.display();
	}

}
