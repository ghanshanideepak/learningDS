package prep.multiThreading.prodconsprob;

import java.util.Vector;

public class Producer implements Runnable {
	
	
	public Vector messages = new Vector();
	
	
	public  synchronized void putMessage() throws InterruptedException
	{
		
		while(messages.size()==ExecutorThread.MAX_CAP)
			wait();
		
		messages.addElement(new java.util.Date().toString());
		System.out.println("Element  added  " + messages.firstElement() );
		
		
		notify();
		Thread.sleep(1000);
	}
	
	public synchronized String getMessage() throws InterruptedException
	{
		
		while(messages.size()==0)
		{
			wait();
		}
		String str = (String)messages.firstElement();
		messages.removeElement(str);
		notify();
		Thread.sleep(1000);
		return str;
			
		
	}
	
	
	
	@Override
	public void run() {
		while(true)
		{
			try {
				putMessage();
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
	
	

}
