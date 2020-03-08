package prep.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListTest {
	
	public static void main(String args[])
	
	{
		List s1 = new ArrayList();
		s1.add(4);
		s1.add(40);
		s1.add(1);
		Collections.sort(s1);
		System.out.println(s1);
	}

}
