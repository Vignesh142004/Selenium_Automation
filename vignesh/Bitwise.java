package vignesh;

public class Bitwise
{
 public static void main(String args[]) 
 {
	 int a=12,b=9,c;
	 c=a&b;
	 System.out.println("a&b="+ (a&b));//8
	 c=a|b;
	 System.out.println("a|b="+ ( a|b));//13
	 c=a^b;
	 System.out.println("a^b="+(a^b));//5
	 c=~a;
	 System.out.println("~a="+~a);
	 
 }
}
