package prep.designpatterns.strategy;

public class DuckSimulator {

	public static void main(String[] args) {
		MallardDuck mallard = new MallardDuck();
		RubberDuck rubberDuck = new RubberDuck();
		DecoyDuck decoy = new DecoyDuck();
		decoy.performFly();
		decoy.setFlybehaviour(new FlywithWings());
		decoy.setQuackBehaviour(new Quack());
		decoy.performFly();
		decoy.performQuack();
		
		mallard.performQuack();
		rubberDuck.performQuack();

	}

}
