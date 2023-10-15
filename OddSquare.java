package Solutions;

import java.util.Scanner;

public class OddSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int i = 0;
        // Start creating the pattern
        while (i < N) {
            // The first number in each row
            int num = 2 * i + 1;

            int j = 0;
            while (j < N) {
                System.out.print(num);
                
                // Update the number to be printed
                num += 2;
                if (num > 2 * N - 1) {
                    num = 1;
                }

                j++;
            }
            System.out.println();
            i++;
        }
		

	}

}


/*
Write a program to print the pattern for the given N number of rows.
For N = 4
1357
3571
5713
7135
Input Format :
A single integer: N
Output Format :
Required Pattern
Constraints :
0 <= N <= 50
Sample Input 1 :
3
Sample Output 1 :
135
351
513
Sample Input 2 :
 5
Sample Output 2 :
13579
35791
57913
79135
91357
*/
