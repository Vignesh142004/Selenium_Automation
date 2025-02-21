package vignesh;

public class NestedLoop {
	public static void main(String args[])
	{
		for(int i=1;i<=5;i++)// row
		{
			for(int j=1;j<=5;j++)//coloum
			{
				System.out.print(j);

			}
			System.out.print("\n");// escape sequence
		}
	}

}
