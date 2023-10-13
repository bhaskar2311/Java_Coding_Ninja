package Solutions;

import java.util.Scanner;

public class StarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int i = 1;
		
		while(i<=n)
		{
			int spaces = 1;
			while(spaces<= n-i )
			{
				System.out.print(' ');
				spaces++;
			}
			
			int stars = 1;
			while(stars<=i)
			{
				System.out.print('*');
				stars++;
			}
			
			int desc_stars = i-1;
			while(desc_stars>=1)
			{
				System.out.print('*');
				desc_stars--;
			}
			System.out.println();
			i++;
		}
		

	}

}
/*
Code : Star Pattern
Send Feedback
Print the following pattern
Pattern for N = 4



Hint
As taught in the video, you just have to modify the code so that instead of printing numbers, it should output stars ('*').
The dots represent spaces.



Input Format :
N (Total no. of rows)
Output Format :
Pattern in N lines
Constraints :
0 <= N <= 50
Sample Input 1 :
3
Sample Output 1 :
   *
  *** 
 *****
Sample Input 2 :
4
Sample Output 2 :
    *
   *** 
  *****
 *******
*/