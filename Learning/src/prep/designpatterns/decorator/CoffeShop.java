package prep.designpatterns.decorator;

public class CoffeShop {

	public static void main(String[] args) {
		Beverage beverage1 = new Expresso(); 
		System.out.println("Your order is  " + beverage1.getDescription() + " $ " + beverage1.cost());
		
		Beverage beverage2 = new HouseBlend();
		beverage2 = new Soy(beverage2);
		beverage2 = new Mocha(beverage2);
		System.out.println("Your order is  " + beverage2.getDescription() + " $ " + beverage2.cost());
	}

}
