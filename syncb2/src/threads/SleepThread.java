package threads;

public class SleepThread extends Thread{
	public SleepThread(String name) {
		super(name);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		for(int i=1;i<6;i++) {
			
			try {
				sleep(500);
				System.out.println(i+"---"+Thread.currentThread().getName());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
