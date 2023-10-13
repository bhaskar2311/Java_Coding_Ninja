package Solutions;

import java.util.Scanner;

public class MirrorImagePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int i = 1;
		
		while(i<=n)
		{
			int spaces = 1;
			while(spaces<=n-i)
			{
				System.out.print(' ');
				spaces++;
			}
			
			int nums = 1;
			while(nums<=i)
			{
				System.out.print(nums);
				nums++;
			}
			System.out.println();
			i++;
		}
		

	}

}

/*
Print the following pattern for the given N number of rows.
Pattern for N = 4




The dots represent spaces.


Input format :
Integer N (Total no. of rows)
Output format :
Pattern in N lines
Constraints
0 <= N <= 50
Sample Input 1:
3
Sample Output 1:
      1 
    12
  123
Sample Input 2:
4
Sample Output 2:
      1 
    12
  123
1234

*/
