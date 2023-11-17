package Solutions3;

import java.util.Scanner;

public class IntersectionOfArraysII {
	
	public static void intersections(int arr1[], int arr2[])
	{
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr2.length;j++)
			{
				if(arr1[i]==arr2[j])
				{
					System.out.print(arr1[i]+" ");
					arr2[j] = -1;
					break;
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for(int i=0;i<t;i++)
		{
			int n = sc.nextInt();
			int arr1[] = new int[n];
			for(int j=0; j<n; j++)
			{
				arr1[j] = sc.nextInt();
			}
			
			int m = sc.nextInt();
			int arr2[] = new int[m];
			for(int j=0; j<m; j++)
			{
				arr2[j] = sc.nextInt();
			}
			
			intersections(arr1,arr2);
		}

	}

}
