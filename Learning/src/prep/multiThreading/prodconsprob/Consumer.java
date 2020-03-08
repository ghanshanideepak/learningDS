package prep.multiThreading.prodconsprob;

public class Consumer implements Runnable {
	private Producer p;
		public Consumer(Producer prod)
		{
			this.p=prod;
		}

	@Override
	public void run() {
		while(true)
		{
			String message;
			try {
				message = p.getMessage();
				System.out.println("GOT MESSAGE    --> " + message);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}

}
