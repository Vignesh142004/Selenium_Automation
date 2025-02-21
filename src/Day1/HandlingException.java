package Day1;
import java.util.*;
public class HandlingException {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number to divide :");
		int num=scan.nextInt();
		try // the doubtful code is placed in try block.
		{
			int ans=100/num;
			System.out.println(ans);
		}
		// Exception is the superclass of all other exception.
		catch(Exception e)// catch block will handle the exception.
		{
			System.out.println(e.getMessage());
			System.out.println("Invalid input");
			
		}
		finally // the finally is used to ensure the program get terminated or not.
		{
			System.out.println("The program is terminated sucessfully");
		}
		scan.close();

	}

}
