package Solutions3;

import java.util.Scanner;

public class SwapAlternate {
	
	public static void swapAlternate(int arr[])
	{
		int temp;
		for(int i=0;i<arr.length;i=i+2)
		{
			if(i==arr.length-1 && i%2==0)
			{
				break;
			}
			else
			{
				temp = arr[i+1];
				arr[i+1] = arr[i];
				arr[i] = temp;
				
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sr = new Scanner(System.in);
        int t = sr.nextInt();
        while(t > 0) 
        {
            int n=sr.nextInt();
            int[] arr=new int[n];
            for (int i =0 ; i<n;i++)
            {
                arr[i]=sr.nextInt();
            }
            swapAlternate(arr);
            for(int i=0;i<n;i++)
            {
                System.out.print(arr[i]+" ");
            }
            System.out.println();
            t -= 1;
        }
	}

}
