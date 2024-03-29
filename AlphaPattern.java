package Solutions;

import java.util.Scanner;

public class AlphaPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 1;
		
		while(i<=n)
		{
			int j = 1;
			while(j<=i)
			{
				System.out.print((char)(64+i));
				j++;
			}
			System.out.println();
			i++;
		}

	}

}

/*
Code : Alpha Pattern
Send Feedback
Print the following pattern for the given N number of rows.
Pattern for N = 3
 A
 BB
 CCC
Input format :
Integer N (Total no. of rows)
Output format :
Pattern in N lines
Constraints
0 <= N <= 26
Sample Input 1:
7
Sample Output 1:
A
BB
CCC
DDDD
EEEEE
FFFFFF
GGGGGGG
Sample Input 2:
6
Sample Output 2:
A
BB
CCC
DDDD
EEEEE
FFFFFF 
*/
