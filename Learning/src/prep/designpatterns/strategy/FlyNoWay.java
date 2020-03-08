package prep.designpatterns.strategy;

public class FlyNoWay implements FlyBehaviour {

	@Override
	public void fly() {
		System.out.println("Flying No Way!!!");
		
	}

}
