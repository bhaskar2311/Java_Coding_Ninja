package Solutions3;

import java.util.Scanner;

public class FindClosestIndex {
	
	public static int binarySearchClosest(int []nums, int left, int right, int target) {
		int mid = 0;
		int closestIndex = -1;
		while(left<=right)
		{
			mid = (left+right)/2;
			if(nums[mid] == target)
			{
				return mid;
			}
			else if(nums[mid]<target)
			{
				left = mid + 1;
				closestIndex = mid;
			}
			else 
			{
				right = mid - 1;
				closestIndex = mid;
				//if(nums[mid]>target)
			}
		}
		
		return closestIndex;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		    Scanner s = new Scanner(System.in);
	        int n = s.nextInt();
	        int arr[] = new int[n];

	        for (int i = 0; i < n; i++) {
	            arr[i] = s.nextInt();
	        }
	        int left = 0;
	        int right = n-1;
	        int x = s.nextInt();
	        int result = binarySearchClosest(arr, left, right, x);
	        System.out.print(result);
	    }

	}

