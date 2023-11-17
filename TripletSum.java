package Solutions3;

import java.util.Scanner;

public class TripletSum {
	
	public static int findTriplet(int[] arr, int x)
	{
		int sum = 0;
		int n = arr.length;
		for(int i=0; i<n; i++)
		{
			for(int j=i+1;j<n;j++)
			{
				for(int y=j+1; y<n ;y++)
				{
					if(arr[i]+arr[j]+arr[y] == x)
					{
						sum++;
					}
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
			
			int TripletNum = findTriplet(arr,x);
			System.out.println(TripletNum);
		}

	}

}
