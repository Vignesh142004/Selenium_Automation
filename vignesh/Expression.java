package vignesh;

public class Expression 
{
 public static void main(String args[])
 {
	 int a=3,b=4,c;
	 c=a+b+a+++(b++)+(++a)+(++b);//PEMDAS
	 System.out.println(c);
 }
}
