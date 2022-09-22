package threads.callback;

public class Me {
	
	public static void main(String[] args) {
		new Thread() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				super.run();
				MobilePhone mobilePhone = new MyBrother();
				OfficeBoy ramu = new OfficeBoy();
				ramu.doWork(mobilePhone);
			}
		}.start();
		
		System.out.println("leave office for other work");
	}

}
