package vignesh;
import java.util.Scanner;
public class DayDemo {
	public static void main(String args[])
	{
		Scanner scan =new Scanner(System.in);
		int num;
		System.out.println("Enter the order of day:");
		num=scan.nextInt();
		switch(num)
		{
		case 0:
			System.out.println("Sunday");
			break;
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
			default:
				System.out.println("Enter the correct number");
		}
		
	}

}
