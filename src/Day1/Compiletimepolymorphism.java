package Day1;

public class Compiletimepolymorphism {
	int x=20;
	int y=40;
	void add()// m1
	{
		System.out.println("X+Y="+(x+y));
	}
	void add(int a,int b)//m2
	{
		System.out.println("X+Y="+(a+b));
	}
	void add(float a,float b)//m3
	{
		System.out.println("X+Y="+(a+b));
	}
	void add(int a,int b,int c)//m4
	{
		System.out.println("(X+Y+Z)"+(a+b+c));
	}
	public static void main(String args[])
	{
		Compiletimepolymorphism c=new Compiletimepolymorphism();
		c.add();// call m1
		c.add(20,40);//call m2
		c.add(20.0f,40.0f);//call m3
		c.add(20,40,60);// call m4
	}
}
