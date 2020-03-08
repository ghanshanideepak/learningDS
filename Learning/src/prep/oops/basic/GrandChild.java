package prep.oops.basic;

public class GrandChild extends Child1 {
	
	
	
	public void printFamilyCar()
	{
		
		System.out.println("THis is GrandChild familyListof Cars    " + family1Car );
	}
	
	//public String MyCar = "My list of Car   " + familyCar + "     " + family1Car;
	
	public static void main(String[] args) 
	{
		
		/*GrandChild grandChild = new GrandChild();
		System.out.println(grandChild.MyCar);*/
		Child1 child = new Child1();
		Child1 child2 = new GrandChild();
		
		
		child.printFamilyCar();
		child2.printFamilyCar();
		
	}

}
