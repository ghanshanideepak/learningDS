package prep.java8newfeatures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortCollectionUsingLambda {

	public static void main(String[] args) {
		List<String> l1 = new ArrayList<String>();
		l1.add("AAA");
		l1.add("bbb");
		l1.add("CCC");
		l1.add("ddd");
		l1.add("XXX");
		
		Collections.sort(l1);
		System.out.println("Simple Sort");
		for(String str:l1)
		{
			System.out.println(str);
		}
		
		Comparator<String> compare = (str1,str2) -> 
		{
			return str1.compareToIgnoreCase(str2);
		};
		
		Collections.sort(l1, compare);
		
		for(String str:l1)
		{
			System.out.println(str);
		}
		
		
		
		

	}

}
