package threads.callback;

public class OfficeBoy {
	
	public void doWork(MobilePhone mobilePhone) {
		
		try {
			Thread.sleep(10000);
			System.out.println("im doing the work");
			mobilePhone.greenSuccessButton();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
