package Day1;

public class ConstructorDemo {
	int x;
	int y;
	ConstructorDemo()// default constructor
	{
		x=100;
		y=200;
	}
	ConstructorDemo(int a,int b)// parameterized constructor
	{
		x=a;
		y=b;
	}
	void sum()
	{
		System.out.println("X+Y="+(x+y));
	}
	public static void main(String args[])
	{
		/*Student s1=new Student(103,"Arjun",'A');
		s1.printdetails();*/
		ConstructorDemo c1=new ConstructorDemo();
		c1.sum();
		ConstructorDemo c2=new ConstructorDemo(10,20);
		c2.sum();
		
		
	}

}
