package duck;
import flybehavior.FlyBehavior;
import quackbehavior.QuackBehavior;

public abstract class Duck {
	protected QuackBehavior quackBehavior;
	protected FlyBehavior flyBehavior;
	
	public Duck() {
		
	}
	
	public abstract void display();
	
	public void performQuack() {
		quackBehavior.quack();
	}
	
	public void performFly() {
		flyBehavior.fly();
	}
	
	public void swim() {
		System.out.println("All ducks float, even decoys!");
	}
	
	public void setFlyBehavior(FlyBehavior fb) {
		flyBehavior = fb;
	}
	
	public void setQuackBehavior(QuackBehavior qb) {
		quackBehavior = qb;
	}
}
