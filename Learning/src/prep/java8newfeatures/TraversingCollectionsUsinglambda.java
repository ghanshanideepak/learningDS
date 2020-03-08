package prep.java8newfeatures;

import java.util.ArrayList;
import java.util.List;

public class TraversingCollectionsUsinglambda {

	public static void main(String[] args) {
		List<String> l1 = new ArrayList<String>();
		l1.add("AAA");
		l1.add("bbb");
		l1.add("CCC");
		l1.add("ddd");
		l1.add("XXX");
		
		l1.forEach(str -> System.out.println(str));

	}

}
