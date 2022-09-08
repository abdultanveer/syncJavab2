package abstraction;

public class GEAppliances implements SwitchBoardListener{

	@Override
	public void switchOne() {
		System.out.println("GE fan is on");

	}

	@Override
	public void switchTwo(int indicator) {
		System.out.println("GE Light is on");
		
	}

	@Override
	public void switchThree(String marker) {
		System.out.println("GE AC is on");
		
	}

	@Override
	public void switchFour() {
		System.out.println("GE tubelight is on");
		
	}

}
