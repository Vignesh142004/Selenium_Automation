package vignesh;

public class TwoDimArray {
	public static void main(String args[])
	{
		int arr[][]=new int[2][3];// row ,coloum
		int arr1 [][]= {{6,5,4},
				{3,2,1},
				{0,10,9}	};
		arr[0][0]=12;
		arr[0][1]=13;
		arr[1][2]=14;
		
		System.out.println(arr[1][2]);
		System.out.println(arr[0][1]);
		System.out.println(arr1[1][0]);
		System.out.println(arr1[1][2]);
		
		double a[]=new double[3];
		System.out.println(a[0]);
	}

}
