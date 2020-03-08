package prep.designpatterns.strategy;

public class Squeak implements QuackBehaviour {

	@Override
	public void quack() {
		System.out.println("I am rubber duck , i cant quack");
		
	}

}
