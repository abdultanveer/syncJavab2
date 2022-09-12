package threads;

public class College {
	public static void main(String[] args) {
		
		FeeThread nikhil = new FeeThread();
		Thread megha = new Thread(new HostelThread());
		
		nikhil.start();
		megha.start();
	}

}
