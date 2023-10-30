package Solutions;

import java.util.Scanner;

public class AllPrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i,j,flag;
		
//		for (int num = 2; num <= N; num++) {
//            boolean isPrime = true;
//            for (int i = 2; i * i <= num; i++) {
//                if (num % i == 0) {
//                    isPrime = false;
//                    break;
//                }
//            }
//            if (isPrime) {
//                System.out.println(num);
//            }
		
		for(i=2;i<=n;i++)
		{
		flag = 0;
		for(j=2;j*j<=i;j++)
		{
			if(i%j==0)
			{
				flag = 1;
				break;
			}
		}
		
		if(flag == 0)
		{
			System.out.println(i);
		}
		}
		

	}

}




/*
All Prime Numbers
Send Feedback
Given an integer N, print all the prime numbers that lie in the range 2 to N (both inclusive).
Print the prime numbers in different lines.
Input Format :
Integer N
Output Format :
Prime numbers in different lines
Constraints :
1 <= N <= 100
Sample Input 1:
9
Sample Output 1:
2
3
5
7
Sample Input 2:
20
Sample Output 2:
2
3
5
7
11
13
17
19
*/