package prep.java8newfeatures;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateLambda {

	public static void main(String[] args) {
		List<People> peopleList = new ArrayList<People>();
		
		peopleList.add(new People("Ram",20) );
		peopleList.add(new People("Shyam",30) );
		peopleList.add(new People("Ronit",50) );
		
		Predicate<People> pred =(p) -> p.getAge()>=25;
		
		peopleList.forEach(p ->
		{
			if(pred.test(p))
			{
				System.out.println(p.toString());
			}
		});
		
		

		

	}

}
