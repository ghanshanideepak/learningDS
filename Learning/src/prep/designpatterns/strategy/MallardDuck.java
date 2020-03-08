package prep.designpatterns.strategy;

public class MallardDuck extends Duck {
	
	public  MallardDuck() {
		
		flybehaviour = new FlywithWings();
		quackBehaviour = new Quack();
		
	}

	@Override
	void display() {
		System.out.println("I am MallardDuck, I can Fly with wings");
		
	}

}
