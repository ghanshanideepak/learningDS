package prep.multiThreading;

import java.util.Scanner;

class VolatileThread implements  Runnable
{
public volatile boolean   stopFlag = true;

	public void run() {
		int i=0;
		while(stopFlag)
		{
			i++;
			System.out.println(i + "  " + stopFlag);
			
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	public void setFlag()
	{
		stopFlag=false;
	}
}

public class VolatileTest {

	public static void main(String[] args) {

VolatileThread vol = new VolatileThread();		
Thread t = new Thread(vol);
t.start();
Scanner s = new Scanner(System.in);
s.nextLine();
vol.setFlag();
	}
	
	
	

}
