package prep.arrays;

public class Inherit {
	
	public void printf (String a)
	{
		System.out.println("String");
	}
	
	
	public void printf (Object a)
	{
		System.out.println("Object");
	}
	
	

	public static void main(String[] args) {
		Inherit i = new Inherit();
		i.printf(new String("Ob"));

	}

	
	
}

