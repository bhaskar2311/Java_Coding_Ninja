package Solutions3;

import java.util.Scanner;

public class ArrangeNumbersInArray {
	
	public static void arrange(int arr[], int n)
	{
		int x = n;
		int a = 1;
		for(int i=0;i<n/2;i++)
		{
			arr[i] = a;
			arr[x-1] = a+1;
			a=a+2;
			x--;
			if(n%2!=0)
			{
				arr[(n/2)] = n;
			}
			
		}
		
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		
		for(int i=0;i<t;i++)
		{
			int n = sc.nextInt();
			int arr[] = new int[n];
			arrange(arr,n);
		}
		

	}

}
