package prep.multiThreading;

import java.util.LinkedList;
import java.util.List;

public class Client {
	
	private int value =0;
	List<Integer> list = new LinkedList<Integer>();
	
	public void produce() throws InterruptedException
	{
		while(true)
		{
			synchronized (this) {
				
				list.add(value++);
				
				System.out.println("Produced");
			}
		}
	}

}
