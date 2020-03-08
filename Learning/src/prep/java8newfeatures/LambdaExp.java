package prep.java8newfeatures;

public class LambdaExp  {

	
	
	public static void main(String args[])
	{
		FunctionalInterface fi = (v1,v2) -> v1*v2;
		System.out.println(fi.add(5, 6));;
	}
}
