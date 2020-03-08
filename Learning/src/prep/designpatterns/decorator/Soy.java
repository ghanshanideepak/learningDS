package prep.designpatterns.decorator;

public class Soy extends CondimentsDecorator {
	Beverage beverage;

	public  Soy(Beverage beverage) {
		this.beverage=beverage;
	}
	
	@Override
	public String getDescription() {
		
		return beverage.getDescription() + "  , Soy";
	}

	@Override
	public double cost() {
		System.out.println("Adding 0.4 $ to cost for adding Soy");
		return 0.40 + beverage.cost();
	}

}
