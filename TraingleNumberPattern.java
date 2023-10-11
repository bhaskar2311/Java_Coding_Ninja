package Solutions;

import java.util.Scanner;

public class TraingleNumberPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 1;
		int j;
		
		while(i<=n)
		{
			j = 1;
			while(j<=i)
			{
				System.out.print(i);
				j++;
			}
			System.out.println();
			i++;
		}
		

	}

}

/*
Code : Triangle Number Pattern
Send Feedback
Print the following pattern for the given N number of rows.
Pattern for N = 4
1
22
333
4444
Input format :
Integer N (Total no. of rows)
Output format :
Pattern in N lines
Constraints
0 <= N <= 50

*/
