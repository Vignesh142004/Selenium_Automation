package vignesh;
class parent
{
	void display()
	{
		System.out.println("THIS IS THE PARENT CLASS OR (BASE CLASS)");
	}
}
class children extends parent
{
	void display1()
	{
		System.out.println("THIS DRIVED CLASS OR (child CLASS)");
	}
}

public class Inheritance {

	public static void main(String[] args) {
		System.out.println("IT IS AN SINGLE INHERITANCE");
		children c1=new children();
		c1.display();
		c1.display1();
	}

}
