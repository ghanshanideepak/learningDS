package prep.arrays;

import java.time.DayOfWeek;

class Solution {
    public String solution(String s,int k) {
    	int index;
    	switch (s)
    	{
    		case "Mon":
    			index=1;
    			break;
    		case "Tue":
    			index=2;
    			break;
    		case "Wed":
    			index=3;
    			break;
    		case "Thu":
    			index=4;
    			break;
    		case "Fri":
    			index=5;
    			break;
    		case "Sat":
    			index=6;
    			break;
    		case "Sun":
    			index=7;
    			break;
    		 default:
    			index=0;
    			break;
    			
    	}
    	 
    	
         return DayOfWeek.of(index).plus(k).toString();
    }
}

/*//write your code in Java SE 8
int product = 1;
for (int i=0;i<A.length;i++)
{
	if(Math.abs(A[i])>=-100 && Math.abs(A[i])<=100)
	{

	product = product * A[i];
}

	}
if (product <0)
	return -1;
else if(product>0)
	return 1;
else
	return 0;
*/