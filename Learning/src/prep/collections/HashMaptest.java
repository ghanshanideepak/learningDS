package prep.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMaptest {

	public static void main(String[] args) {
		
		/*Map<MyKey,String> map1 = new HashMap<MyKey,String>();
		MyKey key1 = new MyKey(10);
		MyKey key2 =  new MyKey(100);
		MyKey key3 = new MyKey(2);
		MyKey key4 = new MyKey(40);
		
				
		map1.put(key3, "Key1");
		map1.put(key2, "Key2");
		map1.put(key1, "Key3");
		map1.put(key4, "Key4");
		
		String s1 = "Hello";
		String s2 = "Hello";
		String s3 = new String("Hello").intern();
		System.out.println("Hello");
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s2==s3);
		
		*/
		
		Student s1 = new Student(10,"Deepak","Cricket");
		Student s2 = new Student(20,"Deepak","Baseball");
		Student s3 = new Student(30,"Rahul","Football");
		Student s4 = new Student(20,"SachinTen","Chess");
		
		Map<Student,String > map = new HashMap();
		map.put(s1, "Student1");
		map.put(s2, "Student2");
		/*map.put(s3, "Student3");
		map.put(s4, "Student4");*/
		
		Iterator<Entry<Student, String>> itr = map.entrySet().iterator();
		
		while(itr.hasNext())
		{
			Entry<Student,String> entry = itr.next();
			System.out.println(entry.getKey());
		}
		
		Set<Student> studenSet = new HashSet();
		studenSet.add(s1);
		studenSet.add(s2);
		studenSet.add(s3);
		studenSet.add(s4);
		
		List<Student> stList = new ArrayList<>();
		
		for(Student s: studenSet)
		{
			stList.add(s);
		}
		
		StudentComparator comp = new StudentComparator();
		
		Collections.sort(stList, comp);
		
		for(Student s : studenSet)
		{
			System.out.println("Set   " + s.toString());
		}
		
		for(Student s : stList)
		{
			System.out.println("List   "  + s.toString());
		}
		
		
		
		
		
		
				
				
		/*for(Map.Entry<MyKey, String> entry : map1.entrySet())
		{
			System.out.println("Key         " + entry.getKey());
			System.out.println("Value         " + entry.getValue());
		}
		
		*/
		
		
		
		
        
		

	}
	
	
	

}
