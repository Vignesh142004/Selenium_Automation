package Day1;
class A1
{
	int a=100;
	void display1()
	{
	System.out.println(a);
	}
}
class B1 extends A1
{
	int b=200;
	void display2()
	{
		System.out.println(b);
	}
}
class C1 extends B1
{
	int c=300;
	void display3()
	{
		System.out.println(c);
	}
}
public class MultilevelInheritance {

	public static void main(String[] args) {
		C1 obj=new C1();
	    System.out.println(obj.a);
	    System.out.println(obj.b);
	    System.out.println(obj.c);
	    obj.display1();
	    obj.display2();
	    obj.display3();
	    
	    
	    
	    
	    
	    
		

	}

}
