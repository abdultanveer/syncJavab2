package abstraction;

public class HavellsAppliances implements SwitchBoardListener{

	@Override
	public void switchOne() {
		System.out.println("havells fan is on");
	}

	@Override
	public void switchTwo(int indicator) {
		System.out.println("havells light is on");
		
	}

	@Override
	public void switchThree(String marker) {
		System.out.println("havells AC is on");
		
	}

	@Override
	public void switchFour() {
		System.out.println("havells tubelight is on");
		
	}

}
