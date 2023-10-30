package practise_tests;

import java.util.Scanner;

public class Number_Star_Pattern1 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 1;
		int k = 1;
		
		while(i<=n)
		{
			int j = n;
			while(j>=1)
			{
				if(k==j)
				{
				System.out.print('*');
				}
				else
				{
					System.out.print(j);
				}
				
				j--;
			}
			System.out.println();
			i++;
			k++;
		}
		
		
	}

}

/*
Number Star pattern 1
Send Feedback
Print the following pattern for given number of rows.
Input format :
Integer N (Total number of rows)
Output Format :
Pattern in N lines
Sample Input :
   5
Sample Output :
 5432*
 543*1
 54*21
 5*321
 *4321 
*/
