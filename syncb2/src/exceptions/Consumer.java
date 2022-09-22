package exceptions;

public class Consumer {

	public static void main(String[] args) {
		//TestThrow1 tt1 = new TestThrow1();
		
		try {
			TestThrow1.validate(13);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println("rest of the code");
	}
}
