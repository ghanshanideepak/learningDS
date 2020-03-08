package prep.collections;

public class Test {
	public static void main(String[] args) {
		Base b = new Derived();;
		b.instanceshow();;
		method('c');
		//Derived d = new Derived();
		
		
	}
	public static void method(Object o) {
		System.out.println("Object impl");
	}
	public static void method(String s) {
		System.out.println("String impl");
	}
}



class Base {
	public static void show() {
	System.out.println("Base::show() called");
	}
	
	public  void instanceshow() {
		System.out.println("Base:: Insshow() called");
		}
}

class Derived extends Base {
	public static void show() {
	System.out.println("Derived::show() called");
	}
	
	public  void instanceshow() {
		System.out.println("Derived::Inis show() called");
		}
}