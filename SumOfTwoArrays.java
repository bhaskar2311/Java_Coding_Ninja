package Solutions3;

import java.util.Scanner;

public class SumOfTwoArrays {
	
	public static int[] SumofTwoArrays(int arr1[], int arr2[])
	{
		int arr3[] = new int[arr1.length];
		
		for(int i=0;i<arr1.length;i++)
		{
			arr3[i] = arr1[i] + arr2[i];
		}
		
		return arr3;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr1[] = new int[n];
		int arr2[] = new int[n];
		
		for(int i=0;i<n;i++)
		{
			arr1[i] = sc.nextInt();
		}

		for(int i=0;i<n;i++)
		{
			arr2[i] = sc.nextInt();
		}
		
		int arr3[] = SumofTwoArrays(arr1, arr2);
		
		for(int i=0;i<n;i++)
		{
			System.out.print(arr3[i]+" ");
		}
		
	}

}
