package Solutions;

import java.util.Scanner;

public class BasicPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 1;
		int j;
		
		while(i<=n)
		{
			j = 1;
			while(j<=n)
			{
				System.out.print('#');
				j++;
			}
			System.out.println();
			i++;
		}
		
		

	}

}

/*
Print the following pattern for the given N number of rows.
Pattern for N = 3
###
###
###
Input Format:
Integer N (Total no. of rows)
Output Format:
Pattern in N lines
Constraints:
0 <= N <= 50
Sample Input1:
5
Sample Output 1:
#####
#####
#####
#####
#####
Sample Input 2:
4
Sample Output 2:
####
####
####
####
*/