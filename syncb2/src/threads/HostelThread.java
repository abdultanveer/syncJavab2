package threads;

public class HostelThread implements Runnable{

	@Override
	public void run() {

		System.out.println("getting seal n sign from hostel");

		for(int i=1;i<6;i++) {

			try {
				Thread.sleep(500);
				System.out.println(i+"---"+Thread.currentThread().getName());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
