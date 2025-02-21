package Day1;

import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("The program is started");
		//Example 1
		/*System.out.println("Enter a number :");
		int x=scan.nextInt();
		System.out.println(100/x); // Arithmetic Example*/
		
		//Example 2 
		/*int arr[]=new int[5];
		System.out.println("Enter the position :");
		int pos=scan.nextInt();// Enter 6 more than array length
		System.out.println("Enter the value :");
		int val=scan.nextInt();
		arr[pos]=val;// ArrayIndexOutOfBound Exception.
		System.out.println(arr[pos]);*/
		
		//Example 3
		/*String s="Welcome";
		int value=Integer.parseInt(s);// NumberFormat Exception 
		System.out.println(value);*/
		
		//Example 4
		String s1=null;
		System.out.println(s1.length());// Nullpointer Exception.
		
		
		System.out.println("The program is completed");
		
		System.out.println("The program is Excited");
		scan.close();

	}

}
