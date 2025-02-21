package vignesh;
import java.util.*;
public class Ifdemo 
{
 public static void main(String args[])
 {
	 Scanner scan= new Scanner(System.in);
	 int num;
	 System.out.println("Enter a number :");
	 num=scan.nextInt();
	 if(num>0)
	 {
		 System.out.println(num+ "is a positive number");
	 }
	 else
	 { 
		 System.out.println(num + "is a negative number");
	 }
}
}
