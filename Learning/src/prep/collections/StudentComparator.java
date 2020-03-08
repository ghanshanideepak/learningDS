package prep.collections;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		
		/*if(o1.getId()> o2.getId())
		return 1;
		else if (o1.getId()< o2.getId())
			return -1;
		else
			return 0;*/
		
		int result =  o1.getName().compareTo(o2.getName());
		 if (result == 0) {
		        result = o1.getHobby().compareTo(o2.getHobby());
		     }
		     
		     return result;
	}
	
	

}
