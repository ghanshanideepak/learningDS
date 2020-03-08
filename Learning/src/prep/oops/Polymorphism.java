package prep.oops;

import prep.oops.basic.Child1;

class A {
	public   void  m1()
	{
		System.out.println("A methos");
	}
}

class B extends A {
	public void  m1()
	{
		System.out.println("B methos");
	}
}


class C extends B {
	public void  m1()
	{
		super.m1();
		System.out.println("C methos");
	}
}


public class Polymorphism extends C {

	public void  m1()
	{
		System.out.println("Main methos");
	}
	
	public Polymorphism()
	{
		this.m1();
		super.m1();
	//	super.super.m1();
		
	}

	public static void main(String[] args) {
		
		Polymorphism tt = new Polymorphism();
		
		//tt.test();
		
		/* B a = new C();
		 A a1 = new C();
		 
		a.m1();
		a1.m1();*/
		
		Child1 child = new Child1();
		
		/*System.out.println(child.family1Car);
		System.out.println(child.fathersCar);
		System.out.println(child.protectedCar);*/
		

	}
	
	public void test()
	{
		this.m1();
	}

}
