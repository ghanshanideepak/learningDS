package prep.java8newfeatures;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateFeature {

	public static void main(String[] args) {
		List<People> peopleList = new ArrayList<People>();
		
		peopleList.add(new People("Ram",20) );
		peopleList.add(new People("Shyam",30) );
		peopleList.add(new People("Ronit",50) );
		
		Predicate<People> pred = new Predicate<People>() {

			@Override
			public boolean test(People p1) {
				// TODO Auto-generated method stub
				return (p1.getAge() >=25);
			}
		};
		
		for (People people : peopleList) {
			if(pred.test(people))
			{
				System.out.println(people.toString());
				
			}
		}
		

		

	}

}
