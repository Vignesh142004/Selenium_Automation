package vignesh;
class Calculate
{
	int cal(int a,int b)
	{
		return (a+b);
	}
	int cal(int a,int b,int c)
	{
		return (a+b+c);
	}
	int cal(int a,int b,int c,int d)
	{
		return (a+b+c+d);
	}
}

public class Overload {

	public static void main(String[] args) {
		Calculate obj=new Calculate();
		System.out.println(obj.cal(10,20));
		System.out.println(obj.cal(10,20,30));
		System.out.println(obj.cal(1,2,3,4));
		

	}

}
