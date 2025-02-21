package Day1;

public class WrapperClass {
	public static void main(String args[])
	{
		String a="10";
		String b="10.22";
		String c="true";
		int a1=Integer.parseInt(a); // String to integer.
		double b1=Double.parseDouble(b); // String to double.
		boolean c1=Boolean.parseBoolean(c); // String to boolean.
		System.out.println(a1);
		System.out.println(b1);
		System.out.println(c1);
		
		char ch='S';
		int x=50;
		double y=50.14;
		boolean z=false;
		String x1=String.valueOf(x);
		String y1=String.valueOf(y);
		String z1=String.valueOf(z);
		String ch1=String.valueOf(ch);
		System.out.println(x1);
		System.out.println(y1);
		System.out.println(z1);
		System.out.println(ch1);
	}
}
