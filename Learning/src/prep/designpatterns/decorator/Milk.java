package prep.designpatterns.decorator;

public class Milk extends CondimentsDecorator {
	Beverage beverage;

	public  Milk(Beverage beverage) {
		this.beverage=beverage;
	}
	
	@Override
	public String getDescription() {
		
		return beverage.getDescription() + "  , Milk";
	}

	@Override
	public double cost() {
		
		return 0.10 + beverage.cost();
	}

}
