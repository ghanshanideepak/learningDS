package prep.multiThreading;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		/*int[] temp = {1,2,3,4,5};
		int k =5;*/
				
	  // System.out.println(find(temp,k));
		System.out.println(find(3,9));
	   

	}
	
	static int find(int l,int k)
	{
		/*String str="NO";
		for(int i:arr)
		   {
			   if(i==k)
				str="YES";
			   
				   
		   }
		return str;*/
		int[] arr= {6,7,9,5,6,3,2};
		//int[] arr= {7,2,3,10,2,4,8,1};
		int diff=0;
		int temp=0;
		/*List temp= new ArrayList();*/
		for(int i =1;i<arr.length-1;i++)
		{
		//	diff = arr[1]-arr[0];
		for(int j=i+1;j<arr.length;j++)
		{
			
				temp = arr[j]-arr[i];
				if(temp>diff)
				{
					diff=temp;
				}
			
		}
		
		}
		
		
		return diff;
		//return temp.toArray(a);
		
	}

}
