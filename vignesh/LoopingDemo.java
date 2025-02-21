package vignesh;
import java.util.Scanner;
public class LoopingDemo {
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int counter=1;
		System.out.println("Enter the Iteration:");
		 int n=scan.nextInt();
	System.out.println("Number of iteration:"+n);
		for(;counter<=n;counter++)
		{
		  System.out.println("value of a="+counter);	
		}
		System.out.println("i value outside the loop "+counter);
			
	}

}
