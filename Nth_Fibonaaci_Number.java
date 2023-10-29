package Solutions;

import java.util.Scanner;

public class Nth_Fibonaaci_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int f1,f2,element = 0;
		//f1 = (n-1)    f2 = (n-2)
		
		if(n==1)
		{
			System.out.println(1);
		}
		else if(n==2)
		{
			System.out.println(1);
		}
		else
		{
			f1 = 1;
			f2 = 1;
			for(int i = 3; i<=n;i++)
			{
				element = f1 + f2;
				f2 = f1;
				f1 = element;
			}
			System.out.println(element);
		}

	}

}
