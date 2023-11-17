package Solutions3;

import java.util.Scanner;

public class BinarySearch {
	
	public static int search(int[] nums, int target)
	{
		int start = 0;
		int end = nums.length - 1;
		
		while(start<=end)
		{
			int mid = (start+end)/2;
			if(nums[mid]<target)
			{
				start = mid + 1;
			}
			else if(nums[mid]>target)
			{
				end = mid - 1;
			}
			else
			{
				return mid;
			}
		}
		
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		int target = sc.nextInt();
		
		int result = search(arr,target);
		
		System.out.println(result);

	}

}
