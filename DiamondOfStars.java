package Solutions;

import java.util.Scanner;

public class DiamondOfStars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int i = 1;
		int j;
		
        // Print upper half of the diamond
		while (i <= (N/2) + 1) {
            j = 1;
            while (j <= N/2 + 1 - i) {
                System.out.print(" ");
                j++;
            }
            j = 1;
            while (j <= 2 * i - 1) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }

        // Reset i for the lower half of the diamond
        i = N/2;

        // Print lower half of the diamond
        while (i >= 1) {
            j = 1;
            while (j <= N/2 + 1 - i) {
                System.out.print(" ");
                j++;
            }
            j = 1;
            while (j <= 2 * i - 1) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i--;
        }
		

	}

}

/*
Print the following pattern for the given number of rows.
Note: N is always odd.


Pattern for N = 5



The dots represent spaces.



Input format :
N (Total no. of rows and can only be odd)
Output format :
Pattern in N lines
Constraints :
1 <= N <= 49
Sample Input 1:
5
Sample Output 1:
  *
 ***
*****
 ***
  *
Sample Input 2:
3
Sample Output 2:
  *
 ***
  * 

*/
