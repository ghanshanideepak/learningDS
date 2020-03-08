package prep.multiThreading.prodconsprob;

public class ExecutorThread {
	
	public static int MAX_CAP = 2;

	public static void main(String[] args) {
	  Producer prod = new Producer();
	  Thread t1  = new Thread(prod);
	  Consumer cons = new Consumer(prod);
      Thread t2  = new Thread(cons);
	  
      
      t1.start();      
      t2.start();
     
      try {
    	  t1.join();
		t2.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}
