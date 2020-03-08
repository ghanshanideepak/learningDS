package prep.designpatterns.strategy;

public abstract class Duck {
	
	FlyBehaviour flybehaviour;
	QuackBehaviour quackBehaviour;
	
	/**
	 * @param flybehaviour the flybehaviour to set
	 */
	public void setFlybehaviour(FlyBehaviour flybehaviour) {
		this.flybehaviour = flybehaviour;
	}
	/**
	 * @param quackBehaviour the quackBehaviour to set
	 */
	public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
		this.quackBehaviour = quackBehaviour;
	}
	
	abstract void display();
	
	public void performFly()
	{
		flybehaviour.fly();
	}
	
	
	public void performQuack()
	{
		quackBehaviour.quack();
	}
	public void swim()
	{
		System.out.println("All Ducks Swim");
	}

}
