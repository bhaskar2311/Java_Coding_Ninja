package Solutions3;

import java.util.Scanner;

public class PrefixSum {
	
	public static void printArray(int arr[]) {
		int n = arr.length;
		for(int i = 0; i<n ; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void preSum(int arr[])
	{
		int sum = 0;
		
		for(int i=0;i<arr.length;i++)
		{
			sum = sum + arr[i];
			arr[i] = sum;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		for(int i = 0; i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		preSum(arr);
		printArray(arr);
		
		

	}

}
