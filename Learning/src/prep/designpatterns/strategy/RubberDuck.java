package prep.designpatterns.strategy;

public class RubberDuck extends Duck {
	
public  RubberDuck() {
		
		flybehaviour = new FlyNoWay();
		quackBehaviour = new Squeak();
		
	}

	@Override
	void display() {
		System.out.println("I am Rubber Duck I can't Fly with wings");
		
	}

}
