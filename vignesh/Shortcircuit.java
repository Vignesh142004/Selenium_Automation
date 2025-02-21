package vignesh;

public class Shortcircuit
{
 public static void main(String args[])
 {
	 int a=10;
	 System.out.println((a>20)&&(a<30));//false
	 System.out.println((a<20)||(a>10));//true
	 int b=25;
	 double c;
	 c=a*b-10/a;
	 System.out.println(c);
	 c=(a*b-10)/a;
	 System.out.println(c);
 }
      
}
