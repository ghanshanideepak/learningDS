package prep.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NavigableSet;
import java.util.TreeSet;

public class Arrays_Union_Intersection {

	public static void main(String[] args) {
		 Integer i[] = {1,2,4,7,11,16,22};
		 int[] j= {2,4,6};
		 //Union -->1,2,3,4,5,6,7
		 //Intersection --> 2,4,6
		 //1,2,3,4,5,6,7,11,16,22
		 //union(i,j);
		 diff(i);
		 

	}
	
	public static void diff(Integer[] arr)
	{
		List<Integer> localarr = new ArrayList<Integer>();
		for(int i=0;i<arr.length-1;i++)
		{
			int diff = arr[i+1]-arr[i];
			System.out.println("Difference  " + diff);
			localarr.add(diff);
			diff =0;
		}
		
		System.out.println(localarr);
		List<Integer>  parentArr = Arrays.asList(arr);
		NavigableSet<Integer> set = new TreeSet<Integer>();
		
		for(int i=0;i<localarr.size();i++)
		{
			set.add(localarr.get(i));
			for(int j=0;j<parentArr.size();j++)
			{
				if(!(localarr.get(i).equals(parentArr.get(j))))
				{
					set.add(parentArr.get(j));
				}
			}
		}
		
		System.out.println("Array" + set);
	}
	
	public static  int[] union(int[] a,int[] b)
	{
		int[] temp = null;
		int counter = 0;
		
		for(int k=0;k<a.length-1;k++)
		{
			for(int l=0;l<b.length-1;l++)
			{
				if(a[k]==b[l])
				{
					temp[counter]=a[k];
				}
			}
		}
		
		return temp;
	}

}
