package prep.java8newfeatures.lambda;

public interface FruitTester {
	
	public String fetchName();
	public int fetchQuant();
	
	public default void printDetails()
	{
		System.out.println("Name   : " + this.fetchName());
		System.out.println("Quantity   :" + this.fetchQuant());
	}
	
	public static void printAllItems(FruitTester[] fruitList)
	{
		System.out.println("Printing all values from static method in interface");
		for(FruitTester test: fruitList)
		{
			System.out.println("Fruit Name    :"+ test.fetchName());
			System.out.println("Total Quantity   :" + test.fetchQuant());
		}
	}

}
