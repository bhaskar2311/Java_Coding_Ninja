package Solutions3;

import java.util.Scanner;

public class PairSum {

	public static int pairSum(int arr[], int x)
	{
		int sum = 0;
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]+arr[j] == x)
				{
					sum++;
				}
			}
		}
		return sum;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for(int i=0;i<t;i++)
		{
			int n = sc.nextInt();
			int arr[] = new int[n];
			for(int j=0;j<n;j++)
			{
				arr[j] = sc.nextInt();
			}
			int x = sc.nextInt();
			
			int result = pairSum(arr,x);
			System.out.println(result);
		}

	}

}
