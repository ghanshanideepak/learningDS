package prep.multiThreading;

public class ThreadInitialization {

	public static void main(String[] args) {
		Runnable r = new MyRunnable();
		Thread t = new Thread(r);
		t.start();
		
		
		
		Runnable r1 = new Runnable() {
			public void run()
			{
				System.out.println("Run from inner class");
			}
		};
		
		Thread t2 = new Thread(r1);
		t2.start();
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("RUn from anonymous class");
				
			}
		}).start();
		
		
		Runnable r3 =() -> System.out.println("Run from Lambda expressed object ");
		new Thread(r3).start();
		
		
		

	}

}
