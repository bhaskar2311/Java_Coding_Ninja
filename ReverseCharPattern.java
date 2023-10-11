package Solutions;

import java.util.Scanner;

public class ReverseCharPattern {

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
				System.out.print((char)(k+64));
				k--;
				j++;
			}
			System.out.println();
			i++;
		}

	}

}

/*
Reverse Char Pattern
Send Feedback
Print the following pattern for the given N number of rows.
Pattern for N = 5
E
ED
EDC
EDCB
EDCBA
Input format :
Integer N (Total no. of rows)
Output format :
Pattern in N lines
Constraints
0 <= N <= 50
Sample Input 1:
7

Sample Output 1:
G
GF
GFE
GFED
GFEDC
GFEDCB
GFEDCBA
Sample Input 1:
6
Sample Output 1:
F
FE
FED
FEDC
FEDCB
FEDCBA
*/
