package Solutions3;

import java.util.Scanner;

public class returnArraySum {

	public static int sum(int[] arr)
	{
		int n = arr.length;
		int result = 0;
		for(int i=0;i<n;i++)
		{
			result = result + arr[i];
		}
		
		return result;
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for(int i = 0; i<t ;i++)
		{
			int n = sc.nextInt();
			int arr[] = new int[n];
			for(int j=0;j<n;j++)
			{
				arr[j] = sc.nextInt();
			}
			int result = sum(arr);
			System.out.println(result);
		}

	}

}
