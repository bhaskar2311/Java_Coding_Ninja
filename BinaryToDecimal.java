package Solutions;

import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int binaryNumber = sc.nextInt(); // Binary Input
        int decimal = 0;
        int base = 1; // Represents the current base (1, 2, 4, 8, 16, etc.)

        while (binaryNumber > 0) {
            int lastDigit = binaryNumber % 10; // Extracting the last digit
            binaryNumber = binaryNumber / 10;   // Removing the last digit

            decimal += lastDigit * base;
            base = base * 2;
        }

        System.out.println(decimal);

	}

}



/*
Binary to decimal
Send Feedback
Given a binary number as an integer N, convert it into decimal and print.
Input format :
An integer N in the Binary Format
Output format :
Corresponding Decimal number (as integer)
Constraints :
0 <= N <= 10^9
Sample Input 1 :
1100
Sample Output 1 :
12
Sample Input 2 :
111
Sample Output 2 :
7
*/