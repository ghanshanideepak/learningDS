package prep.search_algo;

import java.util.Arrays;

public class BinarySearch {
	
	public static void search(int[] arr,int elem)
	{
		for(int i=0;i<arr.length;i++)
		{
			for (int k=i+1;k<arr.length;k++)
			{
				int temp;
				if(arr[i]>arr[k])
				{
					temp = arr[i];
					arr[i] = arr[k];
					arr[k]=temp;
					
				}
			}
		}
		
		for(int j=0;j<arr.length;j++)
		{
			if(arr[j]==elem)
			{
				System.out.println("Array Contains "+ elem + " at " + j + " position");
				
		}
		}
		System.out.println("Element not found");
		System.out.println(Arrays.binarySearch(arr,7));
		
		
	}

	
	public static void main(String args[])
	{
		int[] arr = {9,8,7,6,5,4,3,2,1};
		search(arr,7);
	}
}


