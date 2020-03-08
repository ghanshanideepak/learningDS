package prep.multiThreading;

public class Signal implements Runnable {
	
	
	@Override
	public void run() {
		
		System.out.println("STOP SIGNAL");
		for(int i=30;i>0;i--)
		{
			System.out.println("STOP for " + i + "  seconds");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
	
	

}
