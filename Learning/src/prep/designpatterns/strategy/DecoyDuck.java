package prep.designpatterns.strategy;

public class DecoyDuck extends Duck {
	
	public  DecoyDuck() {
		
		flybehaviour = new FlyNoWay();
		quackBehaviour = new Squeak();
		
	}

	@Override
	void display() {
		System.out.println("I am decoy duck");
		
	}

}
