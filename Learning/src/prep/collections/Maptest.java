package prep.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Maptest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map test = new HashMap();
		test.put(3, 3);
		test.put("Three", 3);
		test.put(4, "Four");
		test.put(null, null);
		//test.put(null, "NullOverride");
		
		Iterator itr = test.entrySet().iterator();
		
		while(itr.hasNext())
		{
			Entry e = (Entry)itr.next();
			System.out.println(e.getKey() + "    " + e.getValue());
		}
		
	}

}
