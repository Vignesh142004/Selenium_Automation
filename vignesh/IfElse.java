package vignesh;
import java.util.*;
public class IfElse
{
   public static void main(String args[])
   {   
	   Scanner scan =new Scanner(System.in);
	   System.out.println("Enter a year:");
	   int year;
	   year= scan.nextInt();
	   if(year%4==0)
	   {
		   System.out.println(year+" is a leap Year");
	   }
	   else
	   {
		   System.out.println(year+" is not a leap yaer");
		   
	   }
   }
}
