package Solutions3;

import java.util.Scanner;

public class MaximumCandies {
	
	public static boolean[] maxCandies(int n,int[] children, int extraCandies)
	{
		int temp;
		boolean bool[] = new boolean[n];
		for(int i=0;i<n;i++)
		{
			temp = children[i] + extraCandies;
			for(int j=0;j<n;j++)
			{
				if(temp>=children[j])
				{
					bool[i] = true;
				}
				else
				{
					bool[i] = false;
					break;
				}
			}
		}
		return bool;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for(int i=0;i<t;i++)
		{
			int n = sc.nextInt();
			int x = sc.nextInt();
			int children[] = new int[n];
			for(int j=0;j<n;j++)
			{
				children[j] = sc.nextInt();
			}
			boolean result[] = maxCandies(n,children,x);
			
			for(int y=0;y<n;y++)
			{
				System.out.print(result[y] + " ");
			}
		}

	}

}
