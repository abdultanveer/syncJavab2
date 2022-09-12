package threads;

public class College {
	public static void main(String[] args) {
		
		FeeThread nikhil = new FeeThread();
		Thread megha = new Thread(new HostelThread());
		
		nikhil.setName("nikthread");
		megha.setName("meghathread");
		
		megha.start();
		
		try {
			megha.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		nikhil.start();
		
		/*
		 * SleepThread st1 = new SleepThread("rumaan"); SleepThread st2 = new
		 * SleepThread("abdul");
		 * 
		 * st1.start(); st2.start();
		 */
		 
		
		/*
		 * st1.run(); st2.run();
		 */
	}

}
