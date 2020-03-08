package prep.multiThreading;

class Counter {
	private int counter = 0;

	public synchronized void incrementC() {
		counter++;
	}

	public synchronized void decrementC() {
		counter--;
	}

	public synchronized int getC() {
		return counter;
	}
}

 class IncrementThread implements Runnable
{
	 
Counter c;

 public IncrementThread(Counter c) {
	this.c=c;
}
	@Override
	public void run() {
		
		c.incrementC();
		System.out.println("Increment Thread  " + c.getC());
		
	}
	}
 
 class DecrementThread implements Runnable
 {
Counter c;
public DecrementThread(Counter c) {
	this.c=c;
}
 	@Override
 	public void run() {
 		
 		c.decrementC();
 		System.out.println("Decrement Thread  " + c.getC());
 		
 	}
 	}

public class SynchronizedTest  {

	public static void main(String[] args) {
	 Counter c=  new Counter();
		Thread t1 = new Thread(new IncrementThread(c));
		Thread t2 = new Thread(new DecrementThread(c));
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

	

}
