package Solutions;

import java.util.Scanner;

public class TriangleOfNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int i = 1;
		int temp = 1;
		
		while(i<=n)
		{
			int spaces = 1;
			while(spaces<=n-i)
			{
				System.out.print(' ');
				spaces++;
			}
			
			int num = 1;
			while(num<=i)
			{
				System.out.print(temp);
				temp++;
				num++;
			}
			
			temp = temp - 2;
			int desc_num = i-1;
			while(desc_num>=1)
			{
				System.out.print(temp);
				temp--;
				desc_num--;
			}
			System.out.println();
			i++;
			temp = i;
		}
		

	}

}

/*
Code : Triangle of Numbers
Send Feedback
Print the following pattern for the given number of rows.
Pattern for N = 4



The dots represent spaces.



Input format :
Integer N (Total no. of rows)
Output format :
Pattern in N lines
Constraints :
0 <= N <= 50
Sample Input 1:
5
Sample Output 1:
           1
          232
         34543
        4567654
       567898765
Sample Input 2:
4
Sample Output 2:
           1
          232
         34543
        4567654
*/