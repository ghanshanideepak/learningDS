package prep.designpatterns.strategy;

public class Quack implements QuackBehaviour {

	@Override
	public void quack() {
		System.out.println("I can Quack");
		
	}

}
