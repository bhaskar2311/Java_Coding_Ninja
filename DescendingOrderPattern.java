package Solutions;

import java.util.Scanner;

public class DescendingOrderPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int i = 1;
		
		while(i<=n)
		{
			int j = 1;
			int k = n;
			while(j<=i)
			{
				System.out.print(k+" ");
				k--;
				j++;
			}
			
			System.out.println();
			i++;
		}

	}

}

/*
Descending order Pattern
Send Feedback
Print the following pattern for the given N number of rows.
Note: Print spaces between the numbers.
Pattern for N = 5
5 
5 4 
5 4 3 
5 4 3 2 
5 4 3 2 1
Input format :
Integer N (Total no. of rows)
Output format :
Pattern in N lines
Constraints
0 <= N <= 50
Sample Input 1:
7
Sample Output 1:
7
7 6
7 6 5 
7 6 5 4 
7 6 5 4 3 
7 6 5 4 3 2 
7 6 5 4 3 2 1
Sample Input 2:
6
Sample Output 2:
6
6 5 
6 5 4 
6 5 4 3 
6 5 4 3 2 
6 5 4 3 2 1
*/