package prep.designpatterns.decorator;

public class Mocha extends CondimentsDecorator {
	Beverage beverage;

	public  Mocha(Beverage beverage) {
		this.beverage=beverage;
	}
	
	@Override
	public String getDescription() {
		
		return beverage.getDescription() + "  , Mocha";
	}

	@Override
	public double cost() {
		System.out.println("Adding 0.5 $ to cost for adding Mocha");
		return 0.50 + beverage.cost();
	}

}
