package vignesh;
import java.util.Scanner;
public class Userinput 
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your name:");
		String s=scan.nextLine();
		System.out.println("Enter your markl:");
		int m1=scan.nextInt();
		System.out.println("Enter your mark2:");
		float m2= scan.nextFloat();
		System.out.println("Enter your mark3:");
		long m3=scan.nextLong();
		System.out.println("Are you passed in your examination?");
		boolean b=scan.nextBoolean();
		System.out.println("hello"+s);
		System.out.println("mark1="+m1);
		System.out.println("mark1="+m2);
		System.out.println("mark1="+m3);
		System.out.println(b);
	}
	

}
