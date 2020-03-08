package prep.oops.basic;

public class MainApp {

	public static void main(String[] args) {
		
		/*Child1 child = new Child1();
		child.printFamilyCar();
		
		GrandChild grandChild = new GrandChild();
		System.out.println();*/
		
		ReadOnlyClass readOnly = new ReadOnlyClass();
		System.out.println("Property1    " + readOnly.getProperty1());
		System.out.println("Property2    " + readOnly.getProperty2());
		System.out.println("Updating Property2    ");
		readOnly.setProperty2("P2Updated");
		//System.out.println("New Property2 Value    " + readOnly.getProperty2());
		System.out.println("Property2    " + readOnly.getProperty2());
		
		

	}

}
