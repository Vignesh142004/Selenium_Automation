package vignesh;
import java.util.*;
public class SwitchDemo {
	public static void main(String args[]) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the first number:");
		int a,b;
		a=scan.nextInt();
		System.out.println("Enter the second number:");
		
		b=scan.nextInt();
		char operator;
		System.out.println("Enter the operation +,-,*,/,%");
		operator=scan.next().charAt(0);
		switch(operator)
		{
		case'+':
			System.out.println(a + "+" +b +"="+(a+b));
			break;
		case'-':
			System.out.println(a + "-" +b +"="+(a-b));
			break;
		case'*':
			System.out.println(a + "*" +b +"="+(a*b));
			break;
		case'/':
			System.out.println(a + "/" +b +"="+(a/b));
			break;
		case'%':
			System.out.println(a + "%" +b +"="+(a%b));
			break;
			default:
				System.out.println("You have enterad the wrong operation");
		}
	}

}
