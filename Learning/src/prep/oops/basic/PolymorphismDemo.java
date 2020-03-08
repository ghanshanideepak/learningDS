package prep.oops.basic;

public class PolymorphismDemo {
	
	public int globalVariable1;
	public int globalVariable2;
	
	public int add(int a,int b)
	{
		globalVariable1 = a;
		globalVariable2 = b;
		//public int localVariable;
		return globalVariable1+globalVariable2;
	}
	
	public int add(int a,int b,int c)
	{
		return a+b-c;
	}
	
	public String add(String a,String b)
	{
		return a+ " " +b;
	}
	
	public String add(String b,String a,int c)
	{
		return b+ " " +a + "with int value " + c;
	}
	

	public static void ma in(String[] args) {
		
		PolymorphismDemo demo = new PolymorphismDemo();
		System.out.println(demo.add(3,4));
		
		//1. By changing the argument count
		System.out.println(demo.add(5, 9,4));
		
		//3. By Changing the return type of method
		//4. BY changing the data type of arguments*/
		System.out.println(demo.add("Java", "Class"));
		
		//2. BY changin the order of arguments
		System.out.println(demo.add("Java", "Class",6));
		
		/*1. By changing the argument count
		2. BY changin the order of arguments
		3. By Changing the return type of method
		4. BY changing the data type of arguments*/
		

	}

}
