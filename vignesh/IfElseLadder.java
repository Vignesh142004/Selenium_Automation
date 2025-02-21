package vignesh;
import java.util.*;
public class IfElseLadder 
{
  public static void main(String ags[])
  {
	  /*
	   >=90 -A
	   80-89-B
	   70-79-c
	   60-69-D
	   50-59-E
	   less than 60-fail
	   */
	  Scanner scan =new Scanner(System.in);
	  System.out.println("Enter your mark(0-100):");
	  int mark;
	  mark=scan.nextInt();
	  if(mark>=90)
	  {
		  System.out.println("Grade A");
	  }
	  else if (mark>=80)
	  {
		  System.out.println("Grade B");
	  }
	  else if(mark>=70)
	  {
		  System.out.println("grade C");
	  }
	  else if(mark>=60)
	  {
		  System.out.println("grade D");
	  }
	  else if(mark>=50)
	  {
		  System.out.println("grade E");
	  }
	  else
	   {
			  System.out.println("Failed");
	   }
		  
	  
	  
  }
}
