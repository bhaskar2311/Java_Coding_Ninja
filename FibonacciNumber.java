package Solutions2;

import java.util.Scanner;

public class FibonacciNumber {
	
	public static boolean checkMember(int n){
		
		/* Your class should be named Solution
		* Don't write main().
	 	* Don't read input, it is passed as function argument.
	 	* Return output and don't print it.
	 	* Taking input and printing output is handled automatically.
		*/
		int f1,f2,element = 0;
		if(n == 0 || n == 1)
		{
			return true;
		}
		else
		{
			f1 = 1;
			f2 = 0;
			for(int i = 3; i<=10000; i++)
			{
				if(element==n)
				{
					return true;
				}
				element = f1 + f2;
				f2 = f1;
				f1 = element;
			}
			return false;
		}
		

	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(checkMember(n));
	}

}





/*
Fibonacci Number
Send Feedback
Given a number N, figure out if it is a member of fibonacci series or not. Return true if the number is member of fibonacci series else false.
Note:
Fibonacci series is the series of numbers where each number is obtained by adding two previous numbers. The first two numbers in the Fibonacci series are 0 and 1.


Input Format :
Integer N
Output Format :
true or false
Constraints :
0 <= n <= 10^4
Sample Input 1 :
5
Sample Output 1 :
true
Sample Input 2 :
14
Sample Output 2 :
false     
 
*/
