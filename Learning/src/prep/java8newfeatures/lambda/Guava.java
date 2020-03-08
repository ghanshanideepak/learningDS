package prep.java8newfeatures.lambda;

public class Guava implements FruitTester {
	
	String name;
	int q;
	
	public Guava(String name,int q)
	{
		this.name=name;
		this.q=q;
	}

	@Override
	public String fetchName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public int fetchQuant() {
		// TODO Auto-generated method stub
		return q;
	}

}
