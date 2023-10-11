package Solutions;

import java.util.Scanner;

public class AlphabeticTriangle {

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
				System.out.print((char)('A'+j-1)+" ");
				j++;
			}
			System.out.println();
			i++;
					
		}
		

	}

}

/*
Alphabetic triangle
Send Feedback
Print the following pattern for the given N number of rows.
Pattern for N = 3
A
A B
A B C
Input Format:
Integer N (Total no. of rows)
Output Format:
Pattern in N lines
Constraints:
10 <= N <= 50
Sample Input 1:
3
Sample Output 1:
A
A B
A B C
Sample Input 2:
5  
Sample Output 2:
A
A B
A B C
A B C D
A B C D E 
*/
