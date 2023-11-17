package Solutions3;

import java.util.Scanner;

public class LinearSearch {
	
	public static int linear(int arr[],int x)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==x)
			{
				return i;
			}
		}
		
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for(int i=0; i<t ; i++)
		{
			int n = sc.nextInt();
			int arr[] = new int[n];
			for(int j = 0; j<n ;j++)
			{
				arr[j] = sc.nextInt();
			}
			int x_search = sc.nextInt();
			int result = linear(arr,x_search);
			System.out.println(result);
		}

	}

}
