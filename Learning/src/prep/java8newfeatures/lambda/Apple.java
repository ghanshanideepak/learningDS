package prep.java8newfeatures.lambda;

public class Apple implements FruitTester {
	
	String name;
	int q;
	
	public Apple(String name,int q)
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
