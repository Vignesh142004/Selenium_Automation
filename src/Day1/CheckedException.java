package Day1;
//import java.util.*;
public class CheckedException {

	public static void main(String[] args) {
		//Scanner scan=new Scanner(System.in);
		System.out.println("The program get started");
		System.out.println("Program is in progress ");
		try
		{
		Thread.sleep(5000);
		}
		catch(InterruptedException e)
		{
			System.out.println(e.getMessage());
			System.out.println(e);
		}
		System.out.println("The program get terminated");
		
		
		

	}

}
