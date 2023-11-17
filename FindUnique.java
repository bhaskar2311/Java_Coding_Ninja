package Solutions3;

import java.util.Scanner;

public class FindUnique {
	
	public static int findUnique(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			int flag = 0;
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i] == arr[j])
				{
					flag++;
				}
			}
			if(flag==1)
			{
				return arr[i];
			}
		}
		
		return 0;
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
            System.out.println(findUnique(arr));
           
            t -= 1;
        }
		

	}

}
