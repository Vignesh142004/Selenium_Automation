package Day1;
class parent
{
	void display(int a)
	{
		System.out.println(a);
	}
}
class child1 extends parent
{
	void show1(int b)
	{
		System.out.println(b);
	}
}
class child2 extends parent
{
	void show2(int c)
	{
		System.out.println(c);
	}
}
public class HierarchyInheritance {

	public static void main(String[] args) {
		child1 c1=new child1();
		c1.display(10);
		c1.show1(20);
		
		child2 c2=new child2();
		c2.display(10);
		c2.show2(20);
		

	}

}
