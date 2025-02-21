package vignesh;
import java.util.Scanner;
public class vowelsDemo {
	public static void main(String args[])
	{
		Scanner scan =new Scanner(System.in);
		char letter;
		System.out.println("Enter the letter:");
		letter=scan.next().charAt(0);
		switch(letter)
		{
		case 'a':
			System.out.println("Its is a vowel");
			break;
		case 'e':
			System.out.println("Its is a vowel");
			break;
		case 'i':
			System.out.println("Its is a vowel");
			break;
		case 'o':
			System.out.println("Its is a vowel");
			break;
		case 'u':
			System.out.println("Its is a vowel");
			break;
		
			default:
				System.out.println("Its is a Consonant");
		}
		
	}

}
