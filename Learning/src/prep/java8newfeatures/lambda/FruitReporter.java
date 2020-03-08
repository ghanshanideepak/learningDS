package prep.java8newfeatures.lambda;

public class FruitReporter {

	public static void main(String[] args) {
		FruitTester[] report = new FruitTester[4];
		
		report[0] = new Apple("Shimla_Apple",40);
		report[1] = new Apple("KinnaurApple",50);
		report[2] = new Guava("Guava1",100);
		report[3] = new Guava("Guava2",20);
		/*
		for(FruitTester list : report)
		{
			list.printDetails();
		}
		
*/
		
		FruitTester.printAllItems(report);
		
	}

}
