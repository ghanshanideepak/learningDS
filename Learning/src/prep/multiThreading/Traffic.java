package prep.multiThreading;

public class Traffic {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName()+ "  started");
		 Thread t1 = new Thread(new Signal());
		 Thread t2 = new Thread(new GreenSignal());
		 t1.start();
		 t2.start();
		 try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 System.out.println(Thread.currentThread().getName()+ "  completed");
	}

}
