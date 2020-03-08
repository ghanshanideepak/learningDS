package prep.oops.basic;

public class Addition_Formula {

	public static void main(String[] args) {
		
		int number1 = 10 ;// primitive data type
		int number2 = 20;
		
		System.out.println(number2 + number1);
		
		Runnable r1 = () -> System.out.println("New Thread"); // Lambda Expression
		//Lambda is basically it is related to Functional Interface
		
		Runnable r2 = new Runnable() {
			public void run()
			{
				System.out.println();
			}
		}; // It is through Anynomous Class
		
		

	}

}
